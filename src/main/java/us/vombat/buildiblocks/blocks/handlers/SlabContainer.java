package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.util.ISlabContainer;

public class SlabContainer implements ISlabContainer
{
	private final SlabSingleBlock singleSlab;
	private final SlabDoubleBlock doubleSlab;
	public SlabContainer(Block block, String name)
	{
		this.singleSlab = new SlabSingleBlock(block, name);
		this.doubleSlab = new SlabDoubleBlock(singleSlab, name);
		register();
	}
	public SlabSingleBlock getSingleSlab()
	{
		return this.singleSlab;
	}
	public SlabDoubleBlock getDoubleSlab()
	{
		return this.doubleSlab;
	}
	public SlabContainer register()
	{
		return (SlabContainer) BlockHelper.registerSlabAndItem(this);
	}
}