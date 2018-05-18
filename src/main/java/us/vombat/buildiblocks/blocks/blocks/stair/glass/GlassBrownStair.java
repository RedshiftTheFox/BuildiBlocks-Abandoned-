package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassBrownStair extends StairTranslucentBlock
{
	public static final String name = "glass_brown_stairs";
	public GlassBrownStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}