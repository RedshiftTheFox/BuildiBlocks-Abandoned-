package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class CobblestoneMossyStair extends StairBlock
{
	public static String name = "cobblestone_mossy_stairs";
	public CobblestoneMossyStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}