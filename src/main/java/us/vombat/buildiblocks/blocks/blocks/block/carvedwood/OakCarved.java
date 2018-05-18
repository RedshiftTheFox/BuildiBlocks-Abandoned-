package us.vombat.buildiblocks.blocks.blocks.block.carvedwood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class OakCarved extends BasicBlock
{
	public static String name = "carved_oak_wood";
	public OakCarved()
	{
		super(Blocks.LOG2, name, CreativeTabs.DECORATIONS);
	}
}