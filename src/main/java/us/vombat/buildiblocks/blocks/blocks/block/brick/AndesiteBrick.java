package us.vombat.buildiblocks.blocks.blocks.block.brick;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class AndesiteBrick extends BasicBlock
{
	public static String name = "andesite_brick";
	public AndesiteBrick()
	{
		super(Blocks.STONE, name, CreativeTabs.BUILDING_BLOCKS);
	}
}