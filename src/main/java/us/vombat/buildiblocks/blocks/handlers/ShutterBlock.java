package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class ShutterBlock extends BlockHorizontal implements IHasModel
{
	public static final PropertyBool OPEN = PropertyBool.create("open");
	private String name;
	public ShutterBlock(Block block, String name)
	{
		super(block.getDefaultState().getMaterial());
		this.name = name;
		this.setHardness(block.getBlockHardness(null, null, null));
		this.setResistance(block.getExplosionResistance(null));
		this.setSoundType(block.getSoundType());
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		BlockList.list.add(this);
		ItemList.list.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override public void registerModels()
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