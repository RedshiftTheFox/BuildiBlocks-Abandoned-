package us.vombat.buildiblocks.blocks.blocks.pillar.wood;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.RotatedBlock;

public class CarvedBirchLog extends RotatedBlock
{
	public static String name = "carved_birch_log";
	public CarvedBirchLog(Block block)
	{
		super(block, name, "axe", 0);
	}
}