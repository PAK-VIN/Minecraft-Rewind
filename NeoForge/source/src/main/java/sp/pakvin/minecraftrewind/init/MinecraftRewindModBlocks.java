
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sp.pakvin.minecraftrewind.init;

import sp.pakvin.minecraftrewind.block.TheUnderneathPortalBlock;
import sp.pakvin.minecraftrewind.MinecraftRewindMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class MinecraftRewindModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MinecraftRewindMod.MODID);
	public static final DeferredBlock<Block> THE_UNDERNEATH_PORTAL = register("the_underneath_portal", TheUnderneathPortalBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
