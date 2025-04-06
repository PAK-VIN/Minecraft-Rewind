/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package sp.pakvin.minecraftrewindfabric.init;

import sp.pakvin.minecraftrewindfabric.MinecraftRewindFabricMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

public class MinecraftRewindFabricModItems {
	public static Item GAUNTLET_1_PRISMARINE;
	public static Item GAUNTLET_2_CHAMPION;
	public static Item GAUNTLET_3_GOLD_PROTOCOL;
	public static Item ROMEOS_GLOCK;
	public static Item GAUNTLET_5_WARRIOR;
	public static Item GAUNTLET_6_FRED;
	public static Item THE_AMULET;
	public static Item THE_PORTAL_ATLAS;
	public static Item ENCHANTED_FLINT_AND_STEEL;
	public static Item GAUNTLET_CORE;
	public static Item GAUNTLET_CORE_2;
	public static Item GAUNTLET_CORE_3;
	public static Item GAUNTLET_CORE_5;
	public static Item GAUNTLET_CORE_6;
	public static Item GAUNTLET_7_COPPER;
	public static Item GAUNTLET_CORE_7;

	public static void load() {
		GAUNTLET_1_PRISMARINE = register("gauntlet_1_prismarine", new Gauntlet1PrismarineItem());
		GAUNTLET_2_CHAMPION = register("gauntlet_2_champion", new Gauntlet2ChampionItem());
		GAUNTLET_3_GOLD_PROTOCOL = register("gauntlet_3_gold_protocol", new Gauntlet3GoldProtocolItem());
		ROMEOS_GLOCK = register("romeos_glock", new RomeosGlockItem());
		GAUNTLET_5_WARRIOR = register("gauntlet_5_warrior", new Gauntlet5WarriorItem());
		GAUNTLET_6_FRED = register("gauntlet_6_fred", new Gauntlet6FredItem());
		THE_AMULET = register("the_amulet", new TheAmuletItem());
		THE_PORTAL_ATLAS = register("the_portal_atlas", new ThePortalAtlasItem());
		ENCHANTED_FLINT_AND_STEEL = register("enchanted_flint_and_steel", new EnchantedFlintAndSteelItem());
		GAUNTLET_CORE = register("gauntlet_core", new GauntletCoreItem());
		GAUNTLET_CORE_2 = register("gauntlet_core_2", new GauntletCore2Item());
		GAUNTLET_CORE_3 = register("gauntlet_core_3", new GauntletCore3Item());
		GAUNTLET_CORE_5 = register("gauntlet_core_5", new GauntletCore5Item());
		GAUNTLET_CORE_6 = register("gauntlet_core_6", new GauntletCore6Item());
		GAUNTLET_7_COPPER = register("gauntlet_7_copper", new Gauntlet7CopperItem());
		GAUNTLET_CORE_7 = register("gauntlet_core_7", new GauntletCore7Item());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MinecraftRewindFabricMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
