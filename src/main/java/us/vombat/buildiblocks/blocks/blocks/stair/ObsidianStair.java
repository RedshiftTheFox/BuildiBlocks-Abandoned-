package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class ObsidianStair extends StairBlock
{
	public static String name = "obsidian_stairs";
	public ObsidianStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}