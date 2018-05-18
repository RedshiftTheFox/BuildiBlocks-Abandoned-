package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class PaneBlock extends BlockPane implements IHasModel
{
	private String name;
	public PaneBlock(Block block, String name, SoundType type)
	{
		super(block.getDefaultState().getMaterial(), true);
		this.name = name;
		this.blockSoundType = type;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		this.setSoundType(type);
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