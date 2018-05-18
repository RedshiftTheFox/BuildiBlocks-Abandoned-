package us.vombat.buildiblocks.blocks.blocks.stair.paintedplanks;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PaintedOakOrangeStair extends StairBlock
{
	public static String name = "oak_plank_orange_stairs";
	public PaintedOakOrangeStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}