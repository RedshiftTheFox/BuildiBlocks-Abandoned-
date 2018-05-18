package us.vombat.buildiblocks.blocks.blocks.stair.wool;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class WoolYellowStair extends StairBlock
{
	public static String name = "wool_yellow_stairs";
	public WoolYellowStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}