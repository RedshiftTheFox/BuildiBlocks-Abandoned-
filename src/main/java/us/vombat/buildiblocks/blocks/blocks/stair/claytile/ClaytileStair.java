package us.vombat.buildiblocks.blocks.blocks.stair.claytile;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class ClaytileStair extends StairBlock
{
	public static String name = "claytile_stairs";
	public ClaytileStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}