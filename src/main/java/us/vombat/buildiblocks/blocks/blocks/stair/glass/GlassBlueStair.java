package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassBlueStair extends StairTranslucentBlock
{
	public static final String name = "glass_blue_stairs";
	public GlassBlueStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}