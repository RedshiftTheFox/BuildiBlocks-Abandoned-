package us.vombat.buildiblocks.blocks.blocks.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class EmbellishedDiamondBlock extends BasicBlock
{
	public static String name = "embellished_diamond_block";
	public EmbellishedDiamondBlock(Block block)
	{
		super(block, name, CreativeTabs.DECORATIONS);
	}
}