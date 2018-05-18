package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class FenceBlock extends BlockFence implements IHasModel
{
	private String name;
	public FenceBlock(Block block, String name)
	{
		super(block.getMaterial(null), MapColor.BLACK);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(block.getBlockHardness(null,  null, null));
		this.setResistance(block.getExplosionResistance(null));
		this.setSoundType(block.getSoundType());
		useNeighborBrightness = true;
		BlockList.list.add(this);
		ItemList.list.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels()
	{
		Item item = Item.getItemFromBlock(this);
		BuildiBlocksMod.proxy.registerItemRenderer(item, 0, "inventory");
	}
}