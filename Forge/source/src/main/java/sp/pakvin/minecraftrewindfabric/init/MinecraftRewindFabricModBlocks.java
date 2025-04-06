
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package sp.pakvin.minecraftrewindfabric.init;

import sp.pakvin.minecraftrewindfabric.MinecraftRewindFabricMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class MinecraftRewindFabricModBlocks {
	public static void load() {
	}

	public static void clientLoad() {
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MinecraftRewindFabricMod.MODID, registryName), block);
	}
}
