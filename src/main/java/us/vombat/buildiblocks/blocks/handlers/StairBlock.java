package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class StairBlock extends BlockStairs implements IHasModel
{
	private String name;
	public StairBlock(IBlockState state, String name)
	{
		super(state);
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
}