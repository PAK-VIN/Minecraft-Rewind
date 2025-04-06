
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sp.pakvin.minecraftrewind.init;

import sp.pakvin.minecraftrewind.entity.AdminBulletsEntity;
import sp.pakvin.minecraftrewind.MinecraftRewindMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class MinecraftRewindModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MinecraftRewindMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AdminBulletsEntity>> ADMIN_BULLETS = register("admin_bullets",
			EntityType.Builder.<AdminBulletsEntity>of(AdminBulletsEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MinecraftRewindMod.MODID, registryname))));
	}
}
