package us.vombat.buildiblocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import us.vombat.buildiblocks.proxy.CommonProxy;

@Mod(modid = Info.id, name = Info.name, version = Info.version, acceptedMinecraftVersions = Info.rec)
public class BuildiBlocksMod
{
	@Mod.Instance public BuildiBlocksMod instance;
	private static RecipeRegistry recipe = new RecipeRegistry();
	@SidedProxy(clientSide = Info.client, serverSide = Info.server)
	public static CommonProxy proxy;
	@EventHandler public void preinit(FMLPreInitializationEvent e)
	{
		recipe.register();
	}
	@EventHandler public void init(FMLInitializationEvent e) {}
	@EventHandler public void postinit(FMLPostInitializationEvent e) {}
}