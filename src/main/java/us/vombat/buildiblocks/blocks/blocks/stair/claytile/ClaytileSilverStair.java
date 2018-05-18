package us.vombat.buildiblocks.blocks.blocks.stair.claytile;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class ClaytileSilverStair extends StairBlock
{
	public static String name = "claytile_silver_stairs";
	public ClaytileSilverStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}