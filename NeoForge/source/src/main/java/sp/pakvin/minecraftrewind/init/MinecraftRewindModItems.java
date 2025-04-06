
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sp.pakvin.minecraftrewind.init;

import sp.pakvin.minecraftrewind.item.TheUnderneathItem;
import sp.pakvin.minecraftrewind.item.ThePortalAtlasItem;
import sp.pakvin.minecraftrewind.item.TheAmuletItem;
import sp.pakvin.minecraftrewind.item.RomeosGlockItem;
import sp.pakvin.minecraftrewind.item.GauntletCoreItem;
import sp.pakvin.minecraftrewind.item.GauntletCore7Item;
import sp.pakvin.minecraftrewind.item.GauntletCore6Item;
import sp.pakvin.minecraftrewind.item.GauntletCore5Item;
import sp.pakvin.minecraftrewind.item.GauntletCore3Item;
import sp.pakvin.minecraftrewind.item.GauntletCore2Item;
import sp.pakvin.minecraftrewind.item.Gauntlet7CopperItem;
import sp.pakvin.minecraftrewind.item.Gauntlet6FredItem;
import sp.pakvin.minecraftrewind.item.Gauntlet5WarriorItem;
import sp.pakvin.minecraftrewind.item.Gauntlet3GoldProtocolItem;
import sp.pakvin.minecraftrewind.item.Gauntlet2ChampionItem;
import sp.pakvin.minecraftrewind.item.Gauntlet1PrismarineItem;
import sp.pakvin.minecraftrewind.item.EnchantedFlintAndSteelItem;
import sp.pakvin.minecraftrewind.MinecraftRewindMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import java.util.function.Function;

public class MinecraftRewindModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MinecraftRewindMod.MODID);
	public static final DeferredItem<Item> GAUNTLET_1_PRISMARINE = register("gauntlet_1_prismarine", Gauntlet1PrismarineItem::new);
	public static final DeferredItem<Item> GAUNTLET_2_CHAMPION = register("gauntlet_2_champion", Gauntlet2ChampionItem::new);
	public static final DeferredItem<Item> GAUNTLET_3_GOLD_PROTOCOL = register("gauntlet_3_gold_protocol", Gauntlet3GoldProtocolItem::new);
	public static final DeferredItem<Item> ROMEOS_GLOCK = register("romeos_glock", RomeosGlockItem::new);
	public static final DeferredItem<Item> GAUNTLET_5_WARRIOR = register("gauntlet_5_warrior", Gauntlet5WarriorItem::new);
	public static final DeferredItem<Item> GAUNTLET_6_FRED = register("gauntlet_6_fred", Gauntlet6FredItem::new);
	public static final DeferredItem<Item> THE_AMULET = register("the_amulet", TheAmuletItem::new);
	public static final DeferredItem<Item> THE_PORTAL_ATLAS = register("the_portal_atlas", ThePortalAtlasItem::new);
	public static final DeferredItem<Item> ENCHANTED_FLINT_AND_STEEL = register("enchanted_flint_and_steel", EnchantedFlintAndSteelItem::new);
	public static final DeferredItem<Item> THE_UNDERNEATH = register("the_underneath", TheUnderneathItem::new);
	public static final DeferredItem<Item> GAUNTLET_CORE = register("gauntlet_core", GauntletCoreItem::new);
	public static final DeferredItem<Item> GAUNTLET_CORE_2 = register("gauntlet_core_2", GauntletCore2Item::new);
	public static final DeferredItem<Item> GAUNTLET_CORE_3 = register("gauntlet_core_3", GauntletCore3Item::new);
	public static final DeferredItem<Item> GAUNTLET_CORE_5 = register("gauntlet_core_5", GauntletCore5Item::new);
	public static final DeferredItem<Item> GAUNTLET_CORE_6 = register("gauntlet_core_6", GauntletCore6Item::new);
	public static final DeferredItem<Item> GAUNTLET_7_COPPER = register("gauntlet_7_copper", Gauntlet7CopperItem::new);
	public static final DeferredItem<Item> GAUNTLET_CORE_7 = register("gauntlet_core_7", GauntletCore7Item::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
