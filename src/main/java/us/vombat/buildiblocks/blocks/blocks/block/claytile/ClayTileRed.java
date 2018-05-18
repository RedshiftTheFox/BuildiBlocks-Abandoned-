package us.vombat.buildiblocks.blocks.blocks.block.claytile;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class ClayTileRed extends BasicBlock
{
	public static String name = "claytile_red";
	public ClayTileRed()
	{
		super(Blocks.HARDENED_CLAY, name, CreativeTabs.BUILDING_BLOCKS);
	}
}