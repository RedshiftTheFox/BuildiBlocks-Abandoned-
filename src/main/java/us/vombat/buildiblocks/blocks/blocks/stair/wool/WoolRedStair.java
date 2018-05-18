package us.vombat.buildiblocks.blocks.blocks.stair.wool;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class WoolRedStair extends StairBlock
{
	public static String name = "wool_red_stairs";
	public WoolRedStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}