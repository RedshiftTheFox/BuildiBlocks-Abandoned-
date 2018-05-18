package us.vombat.buildiblocks.blocks.handlers;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
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

public class PathwayBlock extends Block implements IHasModel
{
	private String name;
	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");
	protected static final AxisAlignedBB PATH = new AxisAlignedBB(0.0625 * 0, 0.0625 * 0, 0.0625 * 0, 0.0625 * 16, 0.0625 * 1, 0.0625 * 16);
	protected static final AxisAlignedBB[] AABB1 = new AxisAlignedBB[] {new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.0625D, 0.8125D), new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.0625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.1875D, 0.8125D, 0.0625D, 0.8125D), new AxisAlignedBB(0.0D, 0.0D, 0.1875D, 0.8125D, 0.0625D, 1.0D), new AxisAlignedBB(0.1875D, 0.0D, 0.0D, 0.8125D, 0.0625D, 0.8125D), new AxisAlignedBB(0.1875D, 0.0D, 0.0D, 0.8125D, 0.0625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.8125D, 0.0625D, 0.8125D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.8125D, 0.0625D, 1.0D), new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 1.0D, 0.0625D, 0.8125D), new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 1.0D, 0.0625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.1875D, 1.0D, 0.0625D, 0.8125D), new AxisAlignedBB(0.0D, 0.0D, 0.1875D, 1.0D, 0.0625D, 1.0D), new AxisAlignedBB(0.1875D, 0.0D, 0.0D, 1.0D, 0.0625D, 0.8125D), new AxisAlignedBB(0.1875D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 0.8125D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D)};
	public PathwayBlock(Block block, String name)
	{
		super(block.getMaterial(null));
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(block.getBlockHardness(null,  null, null));
		this.setResistance(block.getExplosionResistance(null));
		this.setSoundType(block.getSoundType());
		this.getMapColor(null, null, null);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		useNeighborBrightness = true;
		BlockList.list.add(this);
		ItemList.list.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels()
	{
		Item item = Item.getItemFromBlock(this);
		BuildiBlocksMod.proxy.registerItemRenderer(item, 0, "inventory");
	}
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	@Override public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess access, BlockPos pos)
	{
		return false;
	}
	@SideOnly(Side.CLIENT) public boolean shouldSideBeRendered(IBlockState state, IBlockAccess access, BlockPos pos, EnumFacing face)
	{
		return true;
	}
	public int getMetaFromState(IBlockState state)
	{
		return 0;
	}
	public final boolean canConnectToBlock(Block block)
	{
		return block == this;
	}
	public IBlockState getActualState(IBlockState state, IBlockAccess access, BlockPos pos)
	{
		return state.withProperty(NORTH, canConnectTo(access, pos, EnumFacing.NORTH)).withProperty(SOUTH, canConnectTo(access, pos, EnumFacing.SOUTH)).withProperty(WEST, canConnectTo(access, pos, EnumFacing.WEST)).withProperty(EAST, canConnectTo(access, pos, EnumFacing.EAST));
	}
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return PATH;
	}
	@Nullable public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
	{
		return PATH;
	}
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] { NORTH, EAST, WEST, SOUTH });
	}
	public boolean canConnectTo(IBlockAccess access, BlockPos pos, EnumFacing face)
	{
		BlockPos off = pos.offset(face);
		IBlockState state = access.getBlockState(off);
		return canConnectToBlock(state.getBlock()) || state.isSideSolid(access, off, face.getOpposite());
	}
}