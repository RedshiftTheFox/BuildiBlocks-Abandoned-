package us.vombat.buildiblocks.blocks.blocks.stair.wool;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class WoolBlueStair extends StairBlock
{
	public static String name = "wool_blue_stairs";
	public WoolBlueStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}