
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sp.pakvin.minecraftrewind.init;

import sp.pakvin.minecraftrewind.MinecraftRewindMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MinecraftRewindModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftRewindMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MINECRAFT_REWIND_TAB = REGISTRY.register("minecraft_rewind_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.minecraft_rewind.minecraft_rewind_tab")).icon(() -> new ItemStack(MinecraftRewindModItems.GAUNTLET_1_PRISMARINE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MinecraftRewindModItems.GAUNTLET_1_PRISMARINE.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_2_CHAMPION.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_3_GOLD_PROTOCOL.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_5_WARRIOR.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_6_FRED.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_7_COPPER.get());
				tabData.accept(MinecraftRewindModItems.THE_AMULET.get());
				tabData.accept(MinecraftRewindModItems.THE_PORTAL_ATLAS.get());
				tabData.accept(MinecraftRewindModItems.ENCHANTED_FLINT_AND_STEEL.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_CORE.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_CORE_2.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_CORE_3.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_CORE_5.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_CORE_6.get());
				tabData.accept(MinecraftRewindModItems.GAUNTLET_CORE_7.get());
				tabData.accept(MinecraftRewindModItems.THE_UNDERNEATH.get());
				tabData.accept(MinecraftRewindModItems.ROMEOS_GLOCK.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MinecraftRewindModItems.THE_UNDERNEATH.get());
		}
	}
}
