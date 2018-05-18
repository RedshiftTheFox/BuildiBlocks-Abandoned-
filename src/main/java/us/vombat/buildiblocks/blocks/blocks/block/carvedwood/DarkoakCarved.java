package us.vombat.buildiblocks.blocks.blocks.block.carvedwood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class DarkoakCarved extends BasicBlock
{
	public static String name = "carved_dark_oak_wood";
	public DarkoakCarved()
	{
		super(Blocks.LOG, name, CreativeTabs.DECORATIONS);
	}
}