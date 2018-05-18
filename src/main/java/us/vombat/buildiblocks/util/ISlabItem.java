package us.vombat.buildiblocks.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class ISlabItem extends ItemSlab
{
	public ISlabItem(Block block, BlockSlab single, BlockSlab doub)
	{
		super(block, single, doub);
	}
}