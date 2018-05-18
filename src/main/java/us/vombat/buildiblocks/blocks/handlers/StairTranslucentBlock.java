package us.vombat.buildiblocks.blocks.handlers;

import java.util.Random;

import javax.annotation.Nonnull;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class StairTranslucentBlock extends BlockStairs implements IHasModel
{
	private String name;
	public StairTranslucentBlock(IBlockState state, String name)
	{
		super(state);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setLightOpacity(0);
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
	@Override public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	@Override public int quantityDropped(Random r)
	{
		return 0;
	}
	@Override protected boolean canSilkHarvest()
	{
		return true;
	}
	@SideOnly(Side.CLIENT) @Nonnull public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
	@SideOnly(Side.CLIENT) public boolean shouldSideBeRendered(IBlockState state, IBlockAccess access, BlockPos pos, EnumFacing face)
	{
		IBlockState neighbor = access.getBlockState(pos.offset(face));
		Block block = neighbor.getBlock();
		return !(block instanceof StairTranslucentBlock);
	}
	@Override public boolean doesSideBlockRendering(IBlockState state, IBlockAccess access, BlockPos pos, EnumFacing face)
	{
		return false;
	}
}