package us.vombat.buildiblocks.blocks.blocks.wall.glass;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.WallTranslucentBlock;

public class GlassWall extends WallTranslucentBlock
{
	public static String name = "glass_wall";
	public GlassWall(Block wall)
	{
		super(wall, name);
	}
}