package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class StoneStair extends StairBlock
{
	public static String name = "stone_stairs";
	public StoneStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}