package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class EndBrickStair extends StairBlock
{
	public static String name = "end_brick_stairs";
	public EndBrickStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}