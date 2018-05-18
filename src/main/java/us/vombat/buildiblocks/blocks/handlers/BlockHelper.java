package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.util.ISlabContainer;
import us.vombat.buildiblocks.util.ISlabItem;

public class BlockHelper
{
	static ISlabContainer registerSlabAndItem(ISlabContainer slab) {
		BlockList.list.add(slab.getSingleSlab());
		ForgeRegistries.BLOCKS.register(slab.getSingleSlab());
		ModelLoader.setCustomStateMapper(slab.getSingleSlab(), new StateMap.Builder().ignore(new IProperty[] { SlabBlock.getVar() } ).build());
		BlockList.list.add(slab.getDoubleSlab());
		ForgeRegistries.BLOCKS.register(slab.getDoubleSlab());
		ModelLoader.setCustomStateMapper(slab.getDoubleSlab(), new StateMap.Builder().ignore(new IProperty[] { SlabBlock.getVar() } ).build());
		ISlabItem item = new ISlabItem(slab.getSingleSlab(), slab.getSingleSlab(), slab.getDoubleSlab());
		item.setRegistryName(slab.getSingleSlab().getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		return slab;
	}
}