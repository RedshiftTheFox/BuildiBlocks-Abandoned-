package us.vombat.buildiblocks.blocks.handlers;

import javax.annotation.Nonnull;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab.EnumBlockHalf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public abstract class SlabBlock extends BlockSlab
{
	private static final PropertyBool VAR = PropertyBool.create("variant");
	static final int META_BIT = 8;
	public SlabBlock(Block block, String name)
	{
		super(block.getMaterial(null));
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(block.getBlockHardness(null, null, null));
		this.setResistance(block.getExplosionResistance(null));
		this.setSoundType(block.getSoundType());
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	public static PropertyBool getVar()
	{
		return VAR;
	}
	@Override @Nonnull public String getUnlocalizedName(int meta)
	{
		return getUnlocalizedName();
	}
	@Override @Nonnull public IProperty<?> getVariantProperty()
	{
		return getVar();
	}
	@Override @Nonnull public Comparable<?> getTypeForItem(@Nonnull ItemStack stack)
	{
		return false;
	}
	@Override @Nonnull protected final BlockStateContainer createBlockState()
	{
		if(this.isDouble())
			return new BlockStateContainer(this, getVar());
		else
			return new BlockStateContainer(this, HALF, getVar());
	}
	@Override @Nonnull public final IBlockState getStateFromMeta(final int meta)
	{
		IBlockState state = getDefaultState();
		state = state.withProperty(getVar(), false);
		if(!isDouble())
		{
			EnumBlockHalf val = EnumBlockHalf.BOTTOM;
			if((meta & META_BIT) != 0)
				val = EnumBlockHalf.TOP;
			state = state.withProperty(HALF, val);
		}
		return state;
	}
	@Override @Nonnull public final int getMetaFromState(final IBlockState state)
	{
		if(isDouble())
			return 0;
		if(state.getValue(HALF) == EnumBlockHalf.TOP)
			return META_BIT;
		else return 0;
	}
}