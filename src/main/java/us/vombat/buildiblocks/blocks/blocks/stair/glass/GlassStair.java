package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassStair extends StairTranslucentBlock
{
	public static final String name = "glass_stairs";
	public GlassStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}