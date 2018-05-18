package us.vombat.buildiblocks.blocks.blocks.block.carvedwood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class SpruceCarved extends BasicBlock
{
	public static String name = "carved_spruce_wood";
	public SpruceCarved()
	{
		super(Blocks.LOG, name, CreativeTabs.DECORATIONS);
	}
}