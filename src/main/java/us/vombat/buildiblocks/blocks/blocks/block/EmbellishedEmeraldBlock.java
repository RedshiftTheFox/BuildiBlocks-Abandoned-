package us.vombat.buildiblocks.blocks.blocks.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class EmbellishedEmeraldBlock extends BasicBlock
{
	public static String name = "embellished_emerald_block";
	public EmbellishedEmeraldBlock(Block block)
	{
		super(block, name, CreativeTabs.DECORATIONS);
	}
}