package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class IronStair extends StairBlock
{
	public static String name = "iron_stairs";
	public IronStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}