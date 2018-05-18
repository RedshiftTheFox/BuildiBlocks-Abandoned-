package us.vombat.buildiblocks.blocks.blocks.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class EmbellishedIronBlock extends BasicBlock
{
	public static String name = "embellished_iron_block";
	public EmbellishedIronBlock(Block block)
	{
		super(block, name, CreativeTabs.DECORATIONS);
	}
}