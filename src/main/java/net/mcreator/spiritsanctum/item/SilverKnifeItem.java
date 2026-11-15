
package net.mcreator.spiritsanctum.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SilverKnifeItem extends ShearsItem {
	public SilverKnifeItem() {
		super(new Item.Properties().durability(1000));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 4f;
	}
}
