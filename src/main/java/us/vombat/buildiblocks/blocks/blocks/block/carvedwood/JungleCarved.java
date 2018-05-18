package us.vombat.buildiblocks.blocks.blocks.block.carvedwood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class JungleCarved extends BasicBlock
{
	public static String name = "carved_jungle_wood";
	public JungleCarved()
	{
		super(Blocks.LOG, name, CreativeTabs.DECORATIONS);
	}
}