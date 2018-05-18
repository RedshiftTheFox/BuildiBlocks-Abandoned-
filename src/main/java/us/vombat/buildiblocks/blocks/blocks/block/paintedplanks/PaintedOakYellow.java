package us.vombat.buildiblocks.blocks.blocks.block.paintedplanks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class PaintedOakYellow extends BasicBlock
{
	public static String name = "oak_plank_yellow";
	public PaintedOakYellow()
	{
		super(Blocks.PLANKS, name, CreativeTabs.BUILDING_BLOCKS);
	}
}