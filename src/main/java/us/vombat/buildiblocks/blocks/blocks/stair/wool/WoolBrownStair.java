package us.vombat.buildiblocks.blocks.blocks.stair.wool;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class WoolBrownStair extends StairBlock
{
	public static String name = "wool_brown_stairs";
	public WoolBrownStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}