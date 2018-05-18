package us.vombat.buildiblocks.blocks.blocks.stair.claytile;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class ClaytileWhiteStair extends StairBlock
{
	public static String name = "claytile_white_stairs";
	public ClaytileWhiteStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}