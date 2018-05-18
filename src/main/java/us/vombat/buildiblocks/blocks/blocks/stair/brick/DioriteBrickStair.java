package us.vombat.buildiblocks.blocks.blocks.stair.brick;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class DioriteBrickStair extends StairBlock
{
	public static String name = "diorite_brick_stairs";
	public DioriteBrickStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}