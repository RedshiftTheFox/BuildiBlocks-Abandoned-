package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class EmeraldStair extends StairBlock
{
	public static String name = "emerald_stairs";
	public EmeraldStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}