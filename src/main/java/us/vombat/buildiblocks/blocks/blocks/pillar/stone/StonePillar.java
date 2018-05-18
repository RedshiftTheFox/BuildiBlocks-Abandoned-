package us.vombat.buildiblocks.blocks.blocks.pillar.stone;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.RotatedBlock;

public class StonePillar extends RotatedBlock
{
	public static String name = "stone_pillar";
	public StonePillar(Block block)
	{
		super(block, name, "pickaxe", 0);
	}
}