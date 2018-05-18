package us.vombat.buildiblocks.blocks.blocks.stair.wool;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class WoolWhiteStair extends StairBlock
{
	public static String name = "wool_white_stairs";
	public WoolWhiteStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}