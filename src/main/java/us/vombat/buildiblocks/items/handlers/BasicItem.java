package us.vombat.buildiblocks.items.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class BasicItem extends Item implements IHasModel
{
	private String name;
	public BasicItem(String name, CreativeTabs tab)
	{
		super();
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
		
		ItemList.list.add(this);
	}
	@Override
	public void registerModels()
	{
		BuildiBlocksMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}