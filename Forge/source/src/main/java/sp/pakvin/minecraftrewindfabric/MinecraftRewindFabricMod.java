/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package sp.pakvin.minecraftrewindfabric;

import sp.pakvin.minecraftrewindfabric.init.MinecraftRewindFabricModTabs;
import sp.pakvin.minecraftrewindfabric.init.MinecraftRewindFabricModProcedures;
import sp.pakvin.minecraftrewindfabric.init.MinecraftRewindFabricModItems;
import sp.pakvin.minecraftrewindfabric.init.MinecraftRewindFabricModBlocks;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

public class MinecraftRewindFabricMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "minecraft_rewind_fabric";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MinecraftRewindFabricMod");

		MinecraftRewindFabricModTabs.load();

		MinecraftRewindFabricModBlocks.load();
		MinecraftRewindFabricModItems.load();

		MinecraftRewindFabricModProcedures.load();

	}
}
