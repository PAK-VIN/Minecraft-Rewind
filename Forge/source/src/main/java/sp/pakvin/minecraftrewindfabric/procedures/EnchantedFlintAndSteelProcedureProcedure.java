package sp.pakvin.minecraftrewindfabric.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class EnchantedFlintAndSteelProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);
	}
}
