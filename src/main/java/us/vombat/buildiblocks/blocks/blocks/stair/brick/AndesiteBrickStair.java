package us.vombat.buildiblocks.blocks.blocks.stair.brick;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class AndesiteBrickStair extends StairBlock
{
	public static String name = "andesite_brick_stairs";
	public AndesiteBrickStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}