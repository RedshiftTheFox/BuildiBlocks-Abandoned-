package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassBlackStair extends StairTranslucentBlock
{
	public static final String name = "glass_black_stairs";
	public GlassBlackStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}