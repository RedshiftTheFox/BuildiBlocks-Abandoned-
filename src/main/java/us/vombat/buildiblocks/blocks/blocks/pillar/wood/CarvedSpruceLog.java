package us.vombat.buildiblocks.blocks.blocks.pillar.wood;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.RotatedBlock;

public class CarvedSpruceLog extends RotatedBlock
{
	public static String name = "carved_spruce_log";
	public CarvedSpruceLog(Block block)
	{
		super(block, name, "axe", 0);
	}
}