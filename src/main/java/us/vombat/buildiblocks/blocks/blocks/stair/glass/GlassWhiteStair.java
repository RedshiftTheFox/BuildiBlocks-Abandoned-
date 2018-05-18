package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassWhiteStair extends StairTranslucentBlock
{
	public static final String name = "glass_white_stairs";
	public GlassWhiteStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}