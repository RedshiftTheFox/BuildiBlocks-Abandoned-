package us.vombat.buildiblocks.blocks.blocks.stair.claytile;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class ClaytileRedStair extends StairBlock
{
	public static String name = "claytile_red_stairs";
	public ClaytileRedStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}