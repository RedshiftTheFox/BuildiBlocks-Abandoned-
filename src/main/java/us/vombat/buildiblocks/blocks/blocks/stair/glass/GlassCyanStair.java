package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassCyanStair extends StairTranslucentBlock
{
	public static final String name = "glass_cyan_stairs";
	public GlassCyanStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}