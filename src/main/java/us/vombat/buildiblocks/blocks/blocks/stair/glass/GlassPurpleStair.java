package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassPurpleStair extends StairTranslucentBlock
{
	public static final String name = "glass_purple_stairs";
	public GlassPurpleStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}