package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class StonebrickCrackedStair extends StairBlock
{
	public static String name = "stonebrick_cracked_stairs";
	public StonebrickCrackedStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}