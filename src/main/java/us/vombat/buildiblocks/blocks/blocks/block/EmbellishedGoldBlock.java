package us.vombat.buildiblocks.blocks.blocks.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class EmbellishedGoldBlock extends BasicBlock
{
	public static String name = "embellished_gold_block";
	public EmbellishedGoldBlock(Block block)
	{
		super(block, name, CreativeTabs.DECORATIONS);
	}
}