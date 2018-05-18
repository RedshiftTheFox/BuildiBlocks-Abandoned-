package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassGreenStair extends StairTranslucentBlock
{
	public static final String name = "glass_green_stairs";
	public GlassGreenStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}