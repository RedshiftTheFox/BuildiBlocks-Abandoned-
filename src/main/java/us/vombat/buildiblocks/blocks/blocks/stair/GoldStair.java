package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class GoldStair extends StairBlock
{
	public static String name = "gold_stairs";
	public GoldStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}