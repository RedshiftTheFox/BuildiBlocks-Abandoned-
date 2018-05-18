package us.vombat.buildiblocks.blocks.blocks.stair.brick;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class GranitePolishedStair extends StairBlock
{
	public static String name = "granite_polished_stairs";
	public GranitePolishedStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}