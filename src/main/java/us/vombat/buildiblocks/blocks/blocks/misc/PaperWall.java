package us.vombat.buildiblocks.blocks.blocks.misc;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.PaneBlock;

public class PaperWall extends PaneBlock
{
	public static String name = "paper_wall";
	public PaperWall()
	{
		super(Blocks.WOOL, name, SoundType.CLOTH);
		setLightOpacity(1);
	}
}