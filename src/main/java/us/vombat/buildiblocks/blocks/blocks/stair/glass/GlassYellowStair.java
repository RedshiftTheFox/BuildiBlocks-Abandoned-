package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassYellowStair extends StairTranslucentBlock
{
	public static final String name = "glass_yellow_stairs";
	public GlassYellowStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}