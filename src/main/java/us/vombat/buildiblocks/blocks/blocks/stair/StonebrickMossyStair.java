package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class StonebrickMossyStair extends StairBlock
{
	public static String name = "stonebrick_mossy_stairs";
	public StonebrickMossyStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}