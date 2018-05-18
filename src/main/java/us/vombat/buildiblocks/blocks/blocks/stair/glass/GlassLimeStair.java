package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassLimeStair extends StairTranslucentBlock
{
	public static final String name = "glass_lime_stairs";
	public GlassLimeStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}