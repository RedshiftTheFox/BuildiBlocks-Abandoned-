package us.vombat.buildiblocks.blocks.blocks.stair.brick;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class DioritePolishedStair extends StairBlock
{
	public static String name = "diorite_polished_stairs";
	public DioritePolishedStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}