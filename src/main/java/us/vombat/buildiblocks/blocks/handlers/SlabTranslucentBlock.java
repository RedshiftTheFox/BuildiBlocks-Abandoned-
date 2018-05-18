package us.vombat.buildiblocks.blocks.handlers;

import java.util.Random;

import net.minecraft.block.Block;

public abstract class SlabTranslucentBlock extends SlabBlock
{
	public SlabTranslucentBlock(String name, Block block)
	{
		super(block, name);
		this.setLightOpacity(0);
		useNeighborBrightness = true;
	}
	@Override public int quantityDropped(Random r)
	{
		return 0;
	}
	@Override protected boolean canSilkHarvest()
	{
		return true;
	}
}