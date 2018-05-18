package us.vombat.buildiblocks.blocks.blocks.pillar.brick;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.RotatedBlock;

public class DioritePillar extends RotatedBlock
{
	public static String name = "diorite_pillar";
	public DioritePillar(Block block)
	{
		super(block, name, "pickaxe", 0);
	}
}