package us.vombat.buildiblocks.blocks.blocks.stair.claytile;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class ClaytileYellowStair extends StairBlock
{
	public static String name = "claytile_yellow_stairs";
	public ClaytileYellowStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}