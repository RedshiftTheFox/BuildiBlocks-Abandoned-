package us.vombat.buildiblocks.blocks.handlers;

import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class TorchBlock extends Block implements IHasModel
{
	private String name;
	private static final AxisAlignedBB STANDING_AABB = new AxisAlignedBB(0.4000000059604645D, 0.0D, 0.4000000059604645D, 0.6000000238418579D, 0.6000000238418579D, 0.6000000238418579D);
	private static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.3499999940395355D, 0.20000000298023224D, 0.699999988079071D, 0.6499999761581421D, 0.800000011920929D, 1.0D);
	private static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.3499999940395355D, 0.20000000298023224D, 0.0D, 0.6499999761581421D, 0.800000011920929D, 0.30000001192092896D);
	private static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.699999988079071D, 0.20000000298023224D, 0.3499999940395355D, 1.0D, 0.800000011920929D, 0.6499999761581421D);
	private static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, 0.20000000298023224D, 0.3499999940395355D, 0.30000001192092896D, 0.800000011920929D, 0.6499999761581421D);
	private static final AxisAlignedBB HANGING_AABB = new AxisAlignedBB(0.4000000059604645D, 0.0D, 0.4000000059604645D, 0.6000000238418579D, 0.6000000238418579D, 0.6000000238418579D);
	private static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>()
	{
		public boolean apply(@Nullable EnumFacing face)
		{
			return true;
		}
	});
	public TorchBlock(String name, float level)
	{
		super(Material.CIRCUITS);
		this.name = name;
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
		this.setTickRandomly(true);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setLightLevel(level);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		BlockList.list.add(this);
		ItemList.list.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels()
	{
		Item item = Item.getItemFromBlock(this);
		BuildiBlocksMod.proxy.registerItemRenderer(item, 0, "inventory");
	}
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		switch ((EnumFacing) state.getValue(FACING))
		{
		case EAST:
			return EAST_AABB;
		case WEST:
			return WEST_AABB;
		case SOUTH:
			return SOUTH_AABB;
		case NORTH:
			return NORTH_AABB;
		case DOWN:
			return HANGING_AABB;
		default:
			return STANDING_AABB;
		}
	}
	@Nullable public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	{
		return NULL_AABB;
	}
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	private boolean canPlaceOn(World world, BlockPos pos)
	{
		if(world.isSideSolid(pos, EnumFacing.UP))
			return true;
		else
		{
			IBlockState state = world.getBlockState(pos);
			Block block = state.getBlock();
			return block.canPlaceTorchOnTop(state, world, pos);
		}
	}
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		for(EnumFacing enumfacing : FACING.getAllowedValues())
			if(this.canPlaceAt(worldIn, pos, enumfacing))
				return true;
		return false;
	}
	private boolean canPlaceUnder(World world, BlockPos pos)
	{
		IBlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		return world.isSideSolid(pos, EnumFacing.DOWN) || block.canPlaceTorchOnTop(state, world, pos);
	}
	private boolean canPlaceAt(World world, BlockPos pos, EnumFacing face)
	{
		BlockPos blockPos = pos.offset(face.getOpposite());
		boolean flag = face.getAxis().isHorizontal();
		return (flag && world.isSideSolid(blockPos, face, true)) || (face.equals(EnumFacing.UP) && this.canPlaceOn(world, blockPos)) || (face.equals(EnumFacing.DOWN) && this.canPlaceUnder(world, blockPos));
	}
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		if(this.canPlaceAt(worldIn, pos, facing))
			return this.getDefaultState().withProperty(FACING, facing);
		else
			for(EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
				if(this.canPlaceAt(worldIn, pos, enumfacing))
					return this.getDefaultState().withProperty(FACING, enumfacing);
			return this.getDefaultState();
	}
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	{
		this.checkForDrop(worldIn, pos, state);
	}
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
	{
		this.onNeighborChangeInternal(worldIn, pos, state);
	}
	protected boolean onNeighborChangeInternal(World worldIn, BlockPos pos, IBlockState state)
	{
		if(!this.checkForDrop(worldIn, pos, state))
			return true;
		else
		{
			EnumFacing enumfacing = (EnumFacing) state.getValue(FACING);
			EnumFacing.Axis enumfacing$axis = enumfacing.getAxis();
			EnumFacing enumfacing1 = enumfacing.getOpposite();
			BlockPos blockpos = pos.offset(enumfacing1);
			boolean flag = false;
			if(enumfacing$axis.isHorizontal() && worldIn.getBlockState(blockpos).getBlockFaceShape(worldIn, blockpos, enumfacing) != BlockFaceShape.SOLID)
				flag = true;
			else if(enumfacing$axis.isVertical() && !this.canPlaceOn(worldIn, blockpos))
				flag = true;
			if(flag)
			{
				this.dropBlockAsItem(worldIn, pos, state, 0);
				worldIn.setBlockToAir(pos);
				return true;
			}
			else
				return false;
		}
	}
	protected boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state)
	{
		if(state.getBlock() == this && this.canPlaceAt(worldIn, pos, (EnumFacing) state.getValue(FACING)))
			return true;
		else
			if(worldIn.getBlockState(pos).getBlock() == this)
			{
				this.dropBlockAsItem(worldIn, pos, state, 0);
				worldIn.setBlockToAir(pos);
			}
			return false;
	}
	@SideOnly(Side.CLIENT) public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		EnumFacing enumfacing = (EnumFacing) stateIn.getValue(FACING);
		double d0 = (double) pos.getX() + 0.5D;
		double d1 = (double) pos.getY() + 0.7D;
		double d2 = (double) pos.getZ() + 0.5D;
		double d3 = 0.22D;
		double d4 = 0.27D;
		if(enumfacing.getAxis().isHorizontal())
		{
			EnumFacing enumfacing1 = enumfacing.getOpposite();
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + 0.27D * (double) enumfacing1.getFrontOffsetX(), d1 + 0.22D, d2 + 0.27D * (double) enumfacing1.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D);
			worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + 0.27D * (double) enumfacing1.getFrontOffsetX(), d1 + 0.22D, d2 + 0.27D * (double) enumfacing1.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D);
		}
		else
		{
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D);
			worldIn.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		}
	}
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState state = this.getDefaultState();
		switch (meta)
		{
		case 1:
			state = state.withProperty(FACING, EnumFacing.EAST);
			break;
		case 2:
			state = state.withProperty(FACING, EnumFacing.WEST);
			break;
		case 3:
			state = state.withProperty(FACING, EnumFacing.SOUTH);
			break;
		case 4:
			state = state.withProperty(FACING, EnumFacing.NORTH);
			break;
		case 5:
			state = state.withProperty(FACING, EnumFacing.DOWN);
			break;
		default:
			state = state.withProperty(FACING, EnumFacing.UP);
		}
		return state;
	}
	@SideOnly(Side.CLIENT) public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		switch ((EnumFacing)state.getValue(FACING))
		{
		case EAST:
			i = i | 1;
			break;
		case WEST:
			i = i | 2;
			break;
		case SOUTH:
			i = i | 3;
			break;
		case NORTH:
			i = i | 4;
			break;
		case DOWN:
			i = i | 6;
		case UP:
		default:
			i = i | 5;
		}
		return i;
	}
	public IBlockState withRotation(IBlockState state, Rotation rot)
	{
		return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
	}
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
	{
		return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
	}
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {FACING});
	}
	public BlockFaceShape getBlockFaceShape(IBlockAccess p_193383_1_, IBlockState p_193383_2_, BlockPos p_193383_3_, EnumFacing p_193383_4_)
	{
		return BlockFaceShape.UNDEFINED;
	}
}