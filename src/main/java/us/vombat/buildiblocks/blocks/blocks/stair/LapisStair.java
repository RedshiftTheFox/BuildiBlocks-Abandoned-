package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class LapisStair extends StairBlock
{
	public static String name = "lapis_stairs";
	public LapisStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}