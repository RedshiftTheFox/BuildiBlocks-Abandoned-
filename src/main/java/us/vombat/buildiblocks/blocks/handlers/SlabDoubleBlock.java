package us.vombat.buildiblocks.blocks.handlers;

import java.util.Random;

import javax.annotation.Nonnull;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;

public class SlabDoubleBlock extends SlabSingleBlock
{
	private SlabSingleBlock singleSlab;
	public SlabDoubleBlock(SlabSingleBlock slab, String name)
	{
		super(slab, name + "_double");
		this.singleSlab = slab;
		this.setCreativeTab(null);
		BlockList.list.add(this);
		ItemList.list.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override public Item getItemDropped(IBlockState state, Random r, int fort)
	{
		return Item.getItemFromBlock(singleSlab);
	}
	@Override public boolean isDouble()
	{
		return true;
	}
	@Override @Nonnull @SuppressWarnings("deprecation") public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing face, float x, float y, float z, int meta, EntityLivingBase placer)
	{
		return getStateFromMeta(meta);
	}
}