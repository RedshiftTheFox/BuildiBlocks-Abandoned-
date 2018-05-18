package us.vombat.buildiblocks.blocks.blocks.pillar.brick;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.RotatedBlock;

public class AndesitePillar extends RotatedBlock
{
	public static String name = "andesite_pillar";
	public AndesitePillar(Block block)
	{
		super(block, name, "pickaxe", 0);
	}
}