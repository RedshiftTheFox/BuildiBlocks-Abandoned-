package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class WallBlock extends BlockWall implements IHasModel
{
	private String name;
	public WallBlock(Block block, String name)
	{
		super(block);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
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
	@Override public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess access, BlockPos pos)
	{
		return true;
	}
/*	@SideOnly(Side.CLIENT) public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> list)
	{
		list.add(new ItemStack(item, 1, 0));
	}*/
}