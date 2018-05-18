package us.vombat.buildiblocks.blocks.blocks.block.claytile;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class ClayTilePurple extends BasicBlock
{
	public static String name = "claytile_purple";
	public ClayTilePurple()
	{
		super(Blocks.HARDENED_CLAY, name, CreativeTabs.BUILDING_BLOCKS);
	}
}