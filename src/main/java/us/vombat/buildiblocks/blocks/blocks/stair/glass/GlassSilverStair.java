package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassSilverStair extends StairTranslucentBlock
{
	public static final String name = "glass_silver_stairs";
	public GlassSilverStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}