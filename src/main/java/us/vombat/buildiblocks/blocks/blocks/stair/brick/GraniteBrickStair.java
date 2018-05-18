package us.vombat.buildiblocks.blocks.blocks.stair.brick;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class GraniteBrickStair extends StairBlock
{
	public static String name = "granite_brick_stairs";
	public GraniteBrickStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}