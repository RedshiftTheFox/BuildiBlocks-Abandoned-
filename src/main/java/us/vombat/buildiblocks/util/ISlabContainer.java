package us.vombat.buildiblocks.util;

import us.vombat.buildiblocks.blocks.handlers.SlabDoubleBlock;
import us.vombat.buildiblocks.blocks.handlers.SlabSingleBlock;

public interface ISlabContainer
{
	SlabSingleBlock getSingleSlab();
	SlabDoubleBlock getDoubleSlab();
}