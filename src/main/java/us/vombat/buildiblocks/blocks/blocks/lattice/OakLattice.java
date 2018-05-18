package us.vombat.buildiblocks.blocks.blocks.lattice;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.PaneBlock;

public class OakLattice extends PaneBlock
{
	public static String name = "oak_lattice";
	public OakLattice()
	{
		super(Blocks.WOOL, name, SoundType.WOOD);
	}
}