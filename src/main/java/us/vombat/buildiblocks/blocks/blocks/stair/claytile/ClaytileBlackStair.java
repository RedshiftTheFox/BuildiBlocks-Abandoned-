package us.vombat.buildiblocks.blocks.blocks.stair.claytile;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class ClaytileBlackStair extends StairBlock
{
	public static String name = "claytile_black_stairs";
	public ClaytileBlackStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}