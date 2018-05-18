package us.vombat.buildiblocks.blocks.blocks.stair;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class PrismarineDarkStair extends StairBlock
{
	public static String name = "prismarine_dark_stairs";
	public PrismarineDarkStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}