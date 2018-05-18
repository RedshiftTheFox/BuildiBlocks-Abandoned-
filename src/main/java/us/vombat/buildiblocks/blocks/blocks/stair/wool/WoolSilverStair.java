package us.vombat.buildiblocks.blocks.blocks.stair.wool;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class WoolSilverStair extends StairBlock
{
	public static String name = "wool_silver_stairs";
	public WoolSilverStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}