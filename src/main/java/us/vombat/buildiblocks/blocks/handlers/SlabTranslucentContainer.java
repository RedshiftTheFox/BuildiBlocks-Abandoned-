package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.util.ISlabContainer;

public abstract class SlabTranslucentContainer extends Block implements ISlabContainer 
{
	private final SlabTranslucentSingleBlock single;
	private final SlabTranslucentDoubleBlock doub;
	public SlabTranslucentContainer(Block slab, String name)
	{
		super(slab.getMaterial(null));
		this.single = new SlabTranslucentSingleBlock(slab, name);
		this.doub = new SlabTranslucentDoubleBlock(single, name);
		this.setLightOpacity(0);
		useNeighborBrightness = true;
		register();
	}
	public SlabSingleBlock getSingleSlab()
	{
		return single;
	}
	public SlabDoubleBlock getDoubleSlab()
	{
		return doub;
	}
	public SlabTranslucentContainer register()
	{
		return (SlabTranslucentContainer) BlockHelper.registerSlabAndItem(this);
	}
}