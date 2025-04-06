
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sp.pakvin.minecraftrewind.init;

import sp.pakvin.minecraftrewind.client.renderer.AdminBulletsRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftRewindModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecraftRewindModEntities.ADMIN_BULLETS.get(), AdminBulletsRenderer::new);
	}
}
