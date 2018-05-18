package us.vombat.buildiblocks.blocks.blocks.stair.paintedplanks;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PaintedOakGrayStair extends StairBlock
{
	public static String name = "oak_plank_gray_stairs";
	public PaintedOakGrayStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}