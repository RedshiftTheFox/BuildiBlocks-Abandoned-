package us.vombat.buildiblocks.blocks.blocks.block.brick;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class DioriteBrick extends BasicBlock
{
	public static String name = "diorite_brick";
	public DioriteBrick()
	{
		super(Blocks.STONE, name, CreativeTabs.BUILDING_BLOCKS);
	}
}