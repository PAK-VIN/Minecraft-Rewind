
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package sp.pakvin.minecraftrewindfabric.init;

import sp.pakvin.minecraftrewindfabric.MinecraftRewindFabricMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class MinecraftRewindFabricModTabs {
	public static ResourceKey<CreativeModeTab> TAB_MINECRAFT_REWIND_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MinecraftRewindFabricMod.MODID, "minecraft_rewind_tab"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MINECRAFT_REWIND_TAB,
				FabricItemGroup.builder().title(Component.translatable("item_group." + MinecraftRewindFabricMod.MODID + ".minecraft_rewind_tab")).icon(() -> new ItemStack(MinecraftRewindFabricModItems.GAUNTLET_1_PRISMARINE)).build());
	}
}
