package us.vombat.buildiblocks.blocks.blocks.stair.wool;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class WoolBlackStair extends StairBlock
{
	public static String name = "wool_black_stairs";
	public WoolBlackStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}