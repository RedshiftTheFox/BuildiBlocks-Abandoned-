package us.vombat.buildiblocks.blocks.handlers;

import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
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

public class WallTranslucentBlock extends BlockWall implements IHasModel
{
	private String name;
	public WallTranslucentBlock(Block block, String name)
	{
		super(block);
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
	@Override public int quantityDropped(Random r)
	{
		return 0;
	}
	@Override protected boolean canSilkHarvest()
	{
		return true;
	}
	@Override public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess access, BlockPos pos)
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
		return !(block instanceof WallTranslucentBlock);
	}
	@Override public boolean doesSideBlockRendering(IBlockState state, IBlockAccess access, BlockPos pos, EnumFacing face)
	{
		return false;
	}
	@SideOnly(Side.CLIENT) public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> list)
	{
		list.add(new ItemStack(item, 1, 0));
	}
}