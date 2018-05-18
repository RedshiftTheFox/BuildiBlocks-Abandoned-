package us.vombat.buildiblocks.blocks.blocks.stair.paintedplanks;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PaintedOakYellowStair extends StairBlock
{
	public static String name = "oak_plank_yellow_stairs";
	public PaintedOakYellowStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}