package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class DiamondStair extends StairBlock
{
	public static String name = "diamond_stairs";
	public DiamondStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}