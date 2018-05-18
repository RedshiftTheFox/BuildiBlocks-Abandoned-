package us.vombat.buildiblocks.blocks.handlers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.util.IHasModel;

public class SlabSingleBlock extends SlabBlock implements IHasModel
{
	private String name;
	public SlabSingleBlock(Block block, String name)
	{
		super(block, name);
		this.name = name;
		this.useNeighborBrightness = true;
	}
	@Override public Item getItemDropped(IBlockState state, Random r, int fort)
	{
		return Item.getItemFromBlock(this);
	}
	@Override public boolean isDouble()
	{
		return false;
	}
	@Override public void registerModels()
	{
		Item item = Item.getItemFromBlock(this);
		BuildiBlocksMod.proxy.registerItemRenderer(item, 0, "inventory");
	}
}