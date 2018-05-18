package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PrismarineBrickStair extends StairBlock
{
	public static String name = "prismarine_brick_stairs";
	public PrismarineBrickStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}