package us.vombat.buildiblocks.blocks.blocks.stair.paintedplanks;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PaintedOakBlackStair extends StairBlock
{
	public static String name = "oak_plank_black_stairs";
	public PaintedOakBlackStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}