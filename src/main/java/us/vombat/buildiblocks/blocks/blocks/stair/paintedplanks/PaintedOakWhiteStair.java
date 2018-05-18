package us.vombat.buildiblocks.blocks.blocks.stair.paintedplanks;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PaintedOakWhiteStair extends StairBlock
{
	public static String name = "oak_plank_white_stairs";
	public PaintedOakWhiteStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}