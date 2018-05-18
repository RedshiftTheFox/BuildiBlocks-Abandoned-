package us.vombat.buildiblocks.blocks.blocks.pillar.brick;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.RotatedBlock;

public class GranitePillar extends RotatedBlock
{
	public static String name = "granite_pillar";
	public GranitePillar(Block block)
	{
		super(block, name, "pickaxe", 0);
	}
}