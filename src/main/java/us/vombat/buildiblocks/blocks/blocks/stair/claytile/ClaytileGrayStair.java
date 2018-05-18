package us.vombat.buildiblocks.blocks.blocks.stair.claytile;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairBlock;

public class ClaytileGrayStair extends StairBlock
{
	public static String name = "claytile_gray_stairs";
	public ClaytileGrayStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}