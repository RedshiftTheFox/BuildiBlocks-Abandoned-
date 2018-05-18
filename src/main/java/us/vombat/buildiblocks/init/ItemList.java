package us.vombat.buildiblocks.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import us.vombat.buildiblocks.items.handlers.BasicItem;
import us.vombat.buildiblocks.items.item.rods.DiamondRod;
import us.vombat.buildiblocks.items.item.rods.EmeraldRod;
import us.vombat.buildiblocks.items.item.rods.GoldRod;
import us.vombat.buildiblocks.items.item.rods.IronRod;
import us.vombat.buildiblocks.items.item.rods.LapisRod;
import us.vombat.buildiblocks.items.item.rods.NetherRod;

public class ItemList
{
	public static final List<Item> list = new ArrayList<Item>();

	//Rods
	public static final BasicItem netherRod = new NetherRod();
	public static final BasicItem ironRod = new IronRod();
	public static final BasicItem goldRod = new GoldRod();
	public static final BasicItem diamondRod = new DiamondRod();
	public static final BasicItem emeraldRod = new EmeraldRod();
	public static final BasicItem lapisRod = new LapisRod();

}