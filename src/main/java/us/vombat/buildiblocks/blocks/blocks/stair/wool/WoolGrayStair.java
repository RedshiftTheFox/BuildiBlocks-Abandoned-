package us.vombat.buildiblocks.blocks.blocks.stair.wool;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class WoolGrayStair extends StairBlock
{
	public static String name = "wool_gray_stairs";
	public WoolGrayStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}