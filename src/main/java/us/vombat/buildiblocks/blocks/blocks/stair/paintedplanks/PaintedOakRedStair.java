package us.vombat.buildiblocks.blocks.blocks.stair.paintedplanks;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PaintedOakRedStair extends StairBlock
{
	public static String name = "oak_plank_red_stairs";
	public PaintedOakRedStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}