package us.vombat.buildiblocks.blocks.blocks.stair.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.StairTranslucentBlock;

public class GlassMagentaStair extends StairTranslucentBlock
{
	public static final String name = "glass_magenta_stairs";
	public GlassMagentaStair(Block block)
	{
		super(block.getDefaultState(), name);
	}
}