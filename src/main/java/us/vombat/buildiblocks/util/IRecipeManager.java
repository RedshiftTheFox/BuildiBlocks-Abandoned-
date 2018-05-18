package us.vombat.buildiblocks.util;

import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.vombat.buildiblocks.Info;
import us.vombat.buildiblocks.init.BlockList;

public class IRecipeManager
{
	/**
	 * Use this to remove a smelting recipe from the registry.
	 * @param item - The item to be removed.
	 */
	protected void removeSmelt(Item item)
	{
		Map<ItemStack, ItemStack> list = FurnaceRecipes.instance().getSmeltingList();
		Iterator<ItemStack> itr = list.values().iterator();
		while(itr.hasNext())
		{
			ItemStack st = itr.next();
			if(st.getItem() == item)
				itr.remove();
		}
	}
	protected void removeSmelt(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		removeSmelt(item);
	}
	protected void smeltingBB(Block in, int meta1, int amount1, Block out, int meta2, int amount2, float xp)
	{
		ItemStack src = new ItemStack(in, amount1, meta1);
		ItemStack st = new ItemStack(out, amount2, meta2);
		GameRegistry.addSmelting(src, st, xp);
	}
	protected void smeltingBB(Block in, int meta1, Block out, int amount, int meta2, float xp) { smeltingBB(in, meta1, 1, out, meta2, amount, xp); }
	protected void smeltingBB(Block in, Block out, float xp) { smeltingBB(in, 0, 1, out, 0, 1, xp); }
	protected void smeltingBI(Block in, int meta1, int amount1, Item out, int meta2, int amount2, float xp)
	{
		ItemStack src = new ItemStack(in, amount1, meta1);
		ItemStack st = new ItemStack(out, amount2, meta2);
		GameRegistry.addSmelting(src, st, xp);
	}
	protected void smeltingBI(Block in, int meta1, Item out, int amount, int meta2, float xp) { smeltingBI(in, meta1, 1, out, meta2, amount, xp); }
	protected void smeltingBI(Block in, Item out, int amount, float xp) { smeltingBI(in, 0, 1, out, 0, amount, xp); }
	protected void smeltingBI(Block in, Item out, float xp) { smeltingBI(in, 0, 1, out, 0, 1, xp); }
	protected void smeltingIB(Item in, int meta1, int amount1, Block out, int meta2, int amount2, float xp)
	{
		ItemStack src = new ItemStack(in, amount1, meta1);
		ItemStack st = new ItemStack(out, amount2, meta2);
		GameRegistry.addSmelting(src, st, xp);
	}
	protected void smeltingII(Item in, int meta1, int amount1, Item out, int meta2, int amount2, float xp)
	{
		ItemStack src = new ItemStack(in, amount1, meta1);
		ItemStack st = new ItemStack(out, amount2, meta2);
		GameRegistry.addSmelting(src, st, xp);
	}
	protected void smeltingII(Item in, Item out, float xp) { smeltingII(in, 0, 1, out, 0, 1, xp); }
}