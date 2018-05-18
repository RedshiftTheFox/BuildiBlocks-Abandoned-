package us.vombat.buildiblocks.blocks.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import us.vombat.buildiblocks.BuildiBlocksMod;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.init.ItemList;
import us.vombat.buildiblocks.util.IHasModel;

public class RotatedBlock extends BlockRotatedPillar implements IHasModel
{
	protected MapColor color;
	protected SoundType type;
	private String name;
	private static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.create("axis", EnumFacing.Axis.class);
	public RotatedBlock(Block block, String name, String harvest, int level)
	{
		super(block.getDefaultState().getMaterial());
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(block.getBlockHardness(null, null, null));
		this.setResistance(block.getExplosionResistance(null));
		this.setHarvestLevel(harvest, level);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
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
	@SideOnly(Side.CLIENT)public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.SOLID;
	}
}