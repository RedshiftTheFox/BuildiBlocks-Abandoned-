package us.vombat.buildiblocks.blocks.blocks.lattice;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.PaneBlock;

public class JungleLattice extends PaneBlock
{
	public static String name = "jungle_lattice";
	public JungleLattice()
	{
		super(Blocks.WOOL, name, SoundType.WOOD);
	}
}