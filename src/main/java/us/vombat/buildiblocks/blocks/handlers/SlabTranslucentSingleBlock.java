package us.vombat.buildiblocks.blocks.handlers;

import java.util.Random;

import javax.annotation.Nonnull;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlabTranslucentSingleBlock extends SlabSingleBlock
{
	public SlabTranslucentSingleBlock(Block block, String name)
	{
		super(block, name);
		this.setLightOpacity(0);
		useNeighborBrightness = true;
	}
	@Override public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	@Override public int quantityDropped(Random r)
	{
		return 0;
	}
	@Override protected boolean canSilkHarvest()
	{
		return true;
	}
	@SideOnly(Side.CLIENT) @Nonnull public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
	@SideOnly(Side.CLIENT) public boolean shouldSideBeRendered(IBlockState state, IBlockAccess access, BlockPos pos, EnumFacing face)
	{
		IBlockState neighbor = access.getBlockState(pos.offset(face));
		Block block = neighbor.getBlock();
		return !(block instanceof SlabTranslucentSingleBlock && (neighbor.getValue(HALF) == state.getValue(HALF)));
	}
	@Override public boolean doesSideBlockRendering(IBlockState state, IBlockAccess access, BlockPos pos, EnumFacing face)
	{
		return false;
	}
}