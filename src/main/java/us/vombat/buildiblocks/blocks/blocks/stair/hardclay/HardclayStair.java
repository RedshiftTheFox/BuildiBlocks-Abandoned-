package us.vombat.buildiblocks.blocks.blocks.stair.hardclay;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class HardclayStair extends StairBlock
{
	public static final String name = "hardclay_stairs";
	public HardclayStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}