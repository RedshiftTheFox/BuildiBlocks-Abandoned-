package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassOrangeStair extends StairTranslucentBlock
{
	public static final String name = "glass_orange_stairs";
	public GlassOrangeStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}