package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class SandstoneSmoothStair extends StairBlock
{
	public static String name = "sandstone_smooth_stairs";
	public SandstoneSmoothStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}