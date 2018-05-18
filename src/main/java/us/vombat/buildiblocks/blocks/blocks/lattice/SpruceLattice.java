package us.vombat.buildiblocks.blocks.blocks.lattice;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.PaneBlock;

public class SpruceLattice extends PaneBlock
{
	public static String name = "spruce_lattice";
	public SpruceLattice()
	{
		super(Blocks.WOOL, name, SoundType.WOOD);
	}
}