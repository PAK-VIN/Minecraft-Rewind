
package sp.pakvin.minecraftrewind.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ThePortalAtlasItem extends Item {
	public ThePortalAtlasItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1).enchantable(50));
	}
}
