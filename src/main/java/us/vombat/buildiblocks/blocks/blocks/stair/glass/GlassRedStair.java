package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassRedStair extends StairTranslucentBlock
{
	public static final String name = "glass_red_stairs";
	public GlassRedStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}