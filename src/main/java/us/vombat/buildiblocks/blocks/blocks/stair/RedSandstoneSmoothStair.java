package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class RedSandstoneSmoothStair extends StairBlock
{
	public static String name = "red_sandstone_smooth_stairs";
	public RedSandstoneSmoothStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}