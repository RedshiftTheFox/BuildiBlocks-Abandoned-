package us.vombat.buildiblocks.blocks.blocks.stair.paintedplanks;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PaintedOakSilverStair extends StairBlock
{
	public static String name = "oak_plank_silver_stairs";
	public PaintedOakSilverStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}