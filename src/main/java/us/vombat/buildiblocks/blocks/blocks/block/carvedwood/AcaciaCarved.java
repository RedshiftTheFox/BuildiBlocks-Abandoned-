package us.vombat.buildiblocks.blocks.blocks.block.carvedwood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class AcaciaCarved extends BasicBlock
{
	public static String name = "carved_acacia_wood";
	public AcaciaCarved()
	{
		super(Blocks.LOG2, name, CreativeTabs.DECORATIONS);
	}
}