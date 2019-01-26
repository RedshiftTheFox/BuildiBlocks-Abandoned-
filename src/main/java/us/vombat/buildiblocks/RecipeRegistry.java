package us.vombat.buildiblocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;
import us.vombat.buildiblocks.init.BlockList;
import us.vombat.buildiblocks.util.IRecipeManager;

@EventBusSubscriber(modid=Info.id) public class RecipeRegistry extends IRecipeManager
{
	public void register()
	{
		removeVanillaSmelting();
		initVanillaSmelting();
		smelting();
	}
	@SubscribeEvent public static void registerRecipes(RegistryEvent.Register<IRecipe> e)
	{
		IForgeRegistryModifiable registry = (IForgeRegistryModifiable) e.getRegistry();

		ResourceLocation AcaciaFenceGate = new ResourceLocation("minecraft:acacia_fence_gate");
		ResourceLocation AcaciaFence = new ResourceLocation("minecraft:acacia_fence");
		ResourceLocation AcaciaStair = new ResourceLocation("minecraft:acacia_stairs");
		ResourceLocation BirchFenceGate = new ResourceLocation("minecraft:birch_fence_gate");
		ResourceLocation BirchFence = new ResourceLocation("minecraft:birch_fence");
		ResourceLocation BirchStair = new ResourceLocation("minecraft:birch_stairs");
		ResourceLocation BrickStair = new ResourceLocation("minecraft:brick_stairs");
		ResourceLocation CobbleStairs = new ResourceLocation("minecraft:stone_stairs");
		ResourceLocation DarkOakFenceGate = new ResourceLocation("minecraft:dark_oak_fence_gate");
		ResourceLocation DarkOakFence = new ResourceLocation("minecraft:dark_oak_fence");
		ResourceLocation DarkOakStair = new ResourceLocation("minecraft:dark_oak_stairs");
		ResourceLocation JungleFenceGate = new ResourceLocation("minecraft:jungle_fence_gate");
		ResourceLocation JungleFence = new ResourceLocation("minecraft:jungle_fence");
		ResourceLocation JungleStair = new ResourceLocation("minecraft:jungle_stairs");
		ResourceLocation NetherBrickFence = new ResourceLocation("minecraft:nether_brick_fence");
		ResourceLocation OakFenceGate =new ResourceLocation("minecraft:fence_gate");
		ResourceLocation OakFence = new ResourceLocation("minecraft:fence");
		ResourceLocation OakStairs = new ResourceLocation("minecraft:oak_stairs");
		ResourceLocation PolishAndesite = new ResourceLocation("minecraft:polished_andesite");
		ResourceLocation PolishDiorite = new ResourceLocation("minecraft:polished_diorite");
		ResourceLocation PolishGranite = new ResourceLocation("minecraft:polished_granite");
		ResourceLocation PurpurStairs = new ResourceLocation("minecraft:purpur_stairs");
		ResourceLocation QuartzStairs = new ResourceLocation("minecraft:quartz_stairs");
		ResourceLocation RedSandstoneStairs = new ResourceLocation("minecraft:red_sandstone_stairs");
		ResourceLocation SandstoneStairs = new ResourceLocation("minecraft:sandstone_stairs");
		ResourceLocation SpruceFenceGate = new ResourceLocation("minecraft:spruce_fence_gate");
		ResourceLocation SpruceFence = new ResourceLocation("minecraft:spruce_fence");
		ResourceLocation SpruceStairs = new ResourceLocation("minecraft:spruce_stairs");
		ResourceLocation StonebrickStairs = new ResourceLocation("minecraft:stone_brick_stairs");
		ResourceLocation StonebrickSlab = new ResourceLocation("minecraft:stone_brick_slab");

		ResourceLocation BlackGlassPane = new ResourceLocation("minecraft:black_stainted_glass_pane");
		ResourceLocation BlueGlassPane = new ResourceLocation("minecraft:blue_stainted_glass_pane");
		ResourceLocation BrownGlassPane = new ResourceLocation("minecraft:brown_stainted_glass_pane");
		ResourceLocation CyanGlassPane = new ResourceLocation("minecraft:cyan_stainted_glass_pane");
		ResourceLocation GlassPane = new ResourceLocation("minecraft:glass_pane");
		ResourceLocation GrayGlassPane = new ResourceLocation("minecraft:gray_stainted_glass_pane");
		ResourceLocation GreenGlassPane = new ResourceLocation("minecraft:green_stainted_glass_pane");
		ResourceLocation LightBlueGlassPane = new ResourceLocation("minecraft:light_blue_stainted_glass_pane");
		ResourceLocation LimeGlassPane = new ResourceLocation("minecraft:lime_stainted_glass_pane");
		ResourceLocation MagentaGlassPane = new ResourceLocation("minecraft:magenta_stainted_glass_pane");
		ResourceLocation OrangeGlassPane = new ResourceLocation("minecraft:oramne_stainted_glass_pane");
		ResourceLocation PinkGlassPane = new ResourceLocation("minecraft:pink_stainted_glass_pane");
		ResourceLocation PurpleGlassPane = new ResourceLocation("minecraft:purple_stainted_glass_pane");
		ResourceLocation RedGlassPane = new ResourceLocation("minecraft:red_stainted_glass_pane");
		ResourceLocation SilverGlassPane = new ResourceLocation("minecraft:silver_stainted_glass_pane");
		ResourceLocation WhiteGlassPane = new ResourceLocation("minecraft:white_stainted_glass_pane");
		ResourceLocation YellowGlassPane = new ResourceLocation("minecraft:yellow_stainted_glass_pane");

		registry.remove(AcaciaFenceGate);
		registry.remove(AcaciaFence);
		registry.remove(AcaciaStair);
		registry.remove(BirchFenceGate);
		registry.remove(BirchFence);
		registry.remove(BirchStair);
		registry.remove(BrickStair);
		registry.remove(CobbleStairs);
		registry.remove(DarkOakFenceGate);
		registry.remove(DarkOakFence);
		registry.remove(DarkOakStair);
		registry.remove(OakFenceGate);
		registry.remove(JungleFenceGate);
		registry.remove(JungleFence);
		registry.remove(JungleStair);
		registry.remove(NetherBrickFence);
		registry.remove(OakFence);
		registry.remove(OakStairs);
		registry.remove(PolishAndesite);
		registry.remove(PolishDiorite);
		registry.remove(PolishGranite);
		registry.remove(PurpurStairs);
		registry.remove(QuartzStairs);
		registry.remove(RedSandstoneStairs);
		registry.remove(SandstoneStairs);
		registry.remove(SpruceFenceGate);
		registry.remove(SpruceFence);
		registry.remove(SpruceStairs);
		registry.remove(StonebrickStairs);
		registry.remove(StonebrickSlab);

		registry.remove(BlackGlassPane);
		registry.remove(BlueGlassPane);
		registry.remove(BrownGlassPane);
		registry.remove(CyanGlassPane);
		registry.remove(GrayGlassPane);
		registry.remove(GreenGlassPane);
		registry.remove(LightBlueGlassPane);
		registry.remove(LimeGlassPane);
		registry.remove(MagentaGlassPane);
		registry.remove(OrangeGlassPane);
		registry.remove(PinkGlassPane);
		registry.remove(PurpleGlassPane);
		registry.remove(RedGlassPane);
		registry.remove(SilverGlassPane);
		registry.remove(WhiteGlassPane);
		registry.remove(YellowGlassPane);

	}
	private void removeVanillaSmelting() {}
	private void initVanillaSmelting() {}
	private void smelting()
	{
		smeltingBB(Blocks.DIRT, Blocks.HARDENED_CLAY, 0.1F);
	}
	
	//Legacy Code
	private void slabs()
	{
//		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:granite_slab"), null, new ItemStack(BlockList.graniteSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STONE, 1, 2) } );
//		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:diorite_slab"), null, new ItemStack(BlockList.dioriteSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STONE, 1, 4) } );
//		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:andesite_slab"), null, new ItemStack(BlockList.andesiteSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STONE, 1, 6) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:granite_polished_slab"), null, new ItemStack(BlockList.granitePolishSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STONE, 1, 2) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:diorite_polished_slab"), null, new ItemStack(BlockList.dioritePolishSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STONE, 1, 4) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:andesite_polished_slab"), null, new ItemStack(BlockList.andesitePolishSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STONE, 1, 6) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:andesite_brick_slab"), null, new ItemStack(BlockList.andesiteBrickSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.andesiteBrick } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:granite_brick_slab"), null, new ItemStack(BlockList.graniteBrickSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.graniteBrick } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:diorite_brick_slab"), null, new ItemStack(BlockList.dioriteBrickSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.dioriteBrick } );

		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:coarse_dirt_slab"), null, new ItemStack(BlockList.coarseDirtSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.DIRT, 1, 1) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:cobblestone_mossy_slab"), null, new ItemStack(BlockList.cobbleMossySlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.MOSSY_COBBLESTONE } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:diamond_slab"), null, new ItemStack(BlockList.diamondSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.DIAMOND_BLOCK } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:emerald_slab"), null, new ItemStack(BlockList.emeraldSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.EMERALD_BLOCK } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:gold_slab"), null, new ItemStack(BlockList.goldSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.GOLD_BLOCK } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:iron_slab"), null, new ItemStack(BlockList.ironSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.IRON_BLOCK } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:lapis_slab"), null, new ItemStack(BlockList.lapisSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.LAPIS_BLOCK } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:end_brick_slab"), null, new ItemStack(BlockList.endBrickSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.END_BRICKS } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:haybale_slab"), null, new ItemStack(BlockList.haybaleSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.HAY_BLOCK } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:obsidian_slab"), null, new ItemStack(BlockList.obsidianSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.OBSIDIAN } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:prismarine_brick_slab"), null, new ItemStack(BlockList.prismarineBrickSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.PRISMARINE, 1, 1) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:prismarine_dark_slab"), null, new ItemStack(BlockList.prismarineDarkSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.PRISMARINE, 1, 2) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:red_sandstone_smooth_slab"), null, new ItemStack(BlockList.redSmoothSandstoneSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.RED_SANDSTONE, 1, 2) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:sandstone_smooth_slab"), null, new ItemStack(BlockList.sandstoneSmoothSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.SANDSTONE, 1, 2) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:stonebrick_cracked_slab"), null, new ItemStack(BlockList.stonebrickCrackSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STONEBRICK, 1, 2) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:stonebrick_mossy_slab"), null, new ItemStack(BlockList.stonebrickMossSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STONEBRICK, 1, 1) } );

		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_black_slab"), null, new ItemStack(BlockList.woolBlackSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 15) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_blue_slab"), null, new ItemStack(BlockList.woolBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 11) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_brown_slab"), null, new ItemStack(BlockList.woolBrownSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 12) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_cyan_slab"), null, new ItemStack(BlockList.woolCyanSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 9) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_gray_slab"), null, new ItemStack(BlockList.woolGraySlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 7) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_green_slab"), null, new ItemStack(BlockList.woolGreenSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 13) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_light_blue_slab"), null, new ItemStack(BlockList.woolLightBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 3) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_lime_slab"), null, new ItemStack(BlockList.woolLimeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 5) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_magenta_slab"), null, new ItemStack(BlockList.woolMagentaSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 2) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_orange_slab"), null, new ItemStack(BlockList.woolOrangeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 1) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_pink_slab"), null, new ItemStack(BlockList.woolPinkSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 6) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_purple_slab"), null, new ItemStack(BlockList.woolPurpleSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 10) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_red_slab"), null, new ItemStack(BlockList.woolRedSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 14) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_silver_slab"), null, new ItemStack(BlockList.woolSilverSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 8) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_slab"), null, new ItemStack(BlockList.woolWhiteSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 0) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:wool_yellow_slab"), null, new ItemStack(BlockList.woolYellowSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.WOOL, 1, 4) } );

		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_black_slab"), null, new ItemStack(BlockList.hardclayBlackSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_blue_slab"), null, new ItemStack(BlockList.hardclayBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_brown_slab"), null, new ItemStack(BlockList.hardclayBrownSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_cyan_slab"), null, new ItemStack(BlockList.hardclayCyanSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_gray_slab"), null, new ItemStack(BlockList.hardclayGraySlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_green_slab"), null, new ItemStack(BlockList.hardclayGreenSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_light_blue_slab"), null, new ItemStack(BlockList.hardclayLightBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_lime_slab"), null, new ItemStack(BlockList.hardclayLimeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_magenta_slab"), null, new ItemStack(BlockList.hardclayMagentaSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_orange_slab"), null, new ItemStack(BlockList.hardclayOrangeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_pink_slab"), null, new ItemStack(BlockList.hardclayPinkSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_purple_slab"), null, new ItemStack(BlockList.hardclayPurpleSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_red_slab"), null, new ItemStack(BlockList.hardclayRedSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_silver_slab"), null, new ItemStack(BlockList.hardclaySilverSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_white_slab"), null, new ItemStack(BlockList.hardclayWhiteSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_yellow_slab"), null, new ItemStack(BlockList.hardclayYellowSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:hardclay_slab"), null, new ItemStack(BlockList.hardclaySlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.HARDENED_CLAY } );

		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_black_slab"), null, new ItemStack(BlockList.glassBlackSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 15) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_blue_slab"), null, new ItemStack(BlockList.glassBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 11) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_brown_slab"), null, new ItemStack(BlockList.glassBrownSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 12) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_cyan_slab"), null, new ItemStack(BlockList.glassCyanSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 9) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_gray_slab"), null, new ItemStack(BlockList.glassGraySlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 7) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_green_slab"), null, new ItemStack(BlockList.glassGreenSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 13) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_light_blue_slab"), null, new ItemStack(BlockList.glassLightBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 3) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_lime_slab"), null, new ItemStack(BlockList.glassLimeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 5) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_magenta_slab"), null, new ItemStack(BlockList.glassMagentaSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 2) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_orange_slab"), null, new ItemStack(BlockList.glassOrangeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 1) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_pink_slab"), null, new ItemStack(BlockList.glassPinkSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 6) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_purple_slab"), null, new ItemStack(BlockList.glassPurpleSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 10) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_red_slab"), null, new ItemStack(BlockList.glassRedSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 14) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_silver_slab"), null, new ItemStack(BlockList.glassSilverSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 8) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_white_slab"), null, new ItemStack(BlockList.glassWhiteSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 0) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_yellow_slab"), null, new ItemStack(BlockList.glassYellowSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', new ItemStack(Blocks.STAINED_GLASS, 1, 4) } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:glass_slab"), null, new ItemStack(BlockList.glassSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', Blocks.GLASS } );

		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_black_slab"), null, new ItemStack(BlockList.claytileBlackSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileBlack } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_blue_slab"), null, new ItemStack(BlockList.claytileBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileBlue } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_brown_slab"), null, new ItemStack(BlockList.claytileBrownSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileBrown } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_cyan_slab"), null, new ItemStack(BlockList.claytileCyanSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileCyan } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_gray_slab"), null, new ItemStack(BlockList.claytileGraySlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileGray } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_green_slab"), null, new ItemStack(BlockList.claytileGreenSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileGreen } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_light_blue_slab"), null, new ItemStack(BlockList.claytileLightBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileLightBlue } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_lime_slab"), null, new ItemStack(BlockList.claytileLimeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileLime } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_magenta_slab"), null, new ItemStack(BlockList.claytileMagentaSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileMagenta } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_orange_slab"), null, new ItemStack(BlockList.claytileOrangeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileOrange } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_pink_slab"), null, new ItemStack(BlockList.claytilePinkSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytilePink } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_purple_slab"), null, new ItemStack(BlockList.claytilePurpleSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytilePurple } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_red_slab"), null, new ItemStack(BlockList.claytileRedSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileRed } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_silver_slab"), null, new ItemStack(BlockList.claytileSilverSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileSilver } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_white_slab"), null, new ItemStack(BlockList.claytileWhiteSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileWhite } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_yellow_slab"), null, new ItemStack(BlockList.claytileYellowSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytileYellow } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:claytile_slab"), null, new ItemStack(BlockList.claytileSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.claytile } );

/*		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_black_slab"), null, new ItemStack(BlockList.paintedOakBlackSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakBlack } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_blue_slab"), null, new ItemStack(BlockList.paintedOakBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakBlue } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_cyan_slab"), null, new ItemStack(BlockList.paintedOakCyanSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakCyan } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_gray_slab"), null, new ItemStack(BlockList.paintedOakGraySlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakGray } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_green_slab"), null, new ItemStack(BlockList.paintedOakGreenSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakGreen } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_light_blue_slab"), null, new ItemStack(BlockList.paintedOakLightBlueSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakLightBlue } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_lime_slab"), null, new ItemStack(BlockList.paintedOakLimeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakLime } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_magenta_slab"), null, new ItemStack(BlockList.paintedOakMagentaSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakMagenta } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_orange_slab"), null, new ItemStack(BlockList.paintedOakOrangeSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakOrange } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_pink_slab"), null, new ItemStack(BlockList.paintedOakPinkSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakPink } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_purple_slab"), null, new ItemStack(BlockList.paintedOakPurpleSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakPurple } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_red_slab"), null, new ItemStack(BlockList.paintedOakRedSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakRed } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_silver_slab"), null, new ItemStack(BlockList.paintedOakSilverSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakSilver } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_white_slab"), null, new ItemStack(BlockList.paintedOakWhiteSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakWhite } );
		GameRegistry.addShapedRecipe(new ResourceLocation("buildiblocks:oak_plank_yellow_slab"), null, new ItemStack(BlockList.paintedOakYellowSlab.getSingleSlab(), 6), new Object[] { "aaa", 'a', BlockList.paintedOakYellow } );*/
	}
}