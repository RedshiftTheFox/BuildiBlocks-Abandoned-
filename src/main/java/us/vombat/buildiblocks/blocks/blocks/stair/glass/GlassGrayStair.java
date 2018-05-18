package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassGrayStair extends StairTranslucentBlock
{
	public static final String name = "glass_gray_stairs";
	public GlassGrayStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}