package us.vombat.buildiblocks.blocks.blocks.stair.paintedplanks;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PaintedOakBlueStair extends StairBlock
{
	public static String name = "oak_plank_blue_stairs";
	public PaintedOakBlueStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}