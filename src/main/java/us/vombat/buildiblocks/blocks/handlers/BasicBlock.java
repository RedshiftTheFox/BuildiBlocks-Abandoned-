package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class BasicBlock extends Block implements IHasModel
{
	private String name;
	public BasicBlock(Block block, String name, float hard, float resist, String harvest, int level, CreativeTabs tab)
	{
		super(block.getDefaultState().getMaterial());
		this.name = name;
		this.setHardness(hard);
		this.setResistance(block.getExplosionResistance(null));
		this.setCreativeTab(tab);
		this.setSoundType(block.getSoundType());
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		BlockList.list.add(this);
		ItemList.list.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	public BasicBlock(Block block, String name, CreativeTabs tab)
	{
		super(block.getDefaultState().getMaterial());
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(block.getBlockHardness(null, null, null));
		this.setResistance(block.getExplosionResistance(null));
		this.setCreativeTab(tab);
		this.setSoundType(block.getSoundType());
		BlockList.list.add(this);
		ItemList.list.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels()
	{
		Item item = Item.getItemFromBlock(this);
		BuildiBlocksMod.proxy.registerItemRenderer(item, 0, "inventory");
	}
	public float getBlockHardness()
	{
		return this.blockHardness;
	}
	public float getBlockResistance()
	{
		return this.blockResistance;
	}
}