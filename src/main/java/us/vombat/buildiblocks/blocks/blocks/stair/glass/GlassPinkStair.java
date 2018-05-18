package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassPinkStair extends StairTranslucentBlock
{
	public static final String name = "glass_pink_stairs";
	public GlassPinkStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}