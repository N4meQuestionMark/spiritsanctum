
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spiritsanctum.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.spiritsanctum.item.SilverKnifeItem;
import net.mcreator.spiritsanctum.item.DioritePowderItem;
import net.mcreator.spiritsanctum.SpiritsanctumMod;

public class SpiritsanctumModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpiritsanctumMod.MODID);
	public static final DeferredItem<Item> DIORITE_POWDER = REGISTRY.register("diorite_powder", DioritePowderItem::new);
	public static final DeferredItem<Item> SILVER_KNIFE = REGISTRY.register("silver_knife", SilverKnifeItem::new);
	public static final DeferredItem<Item> SEALED_ENVIROMENT_BLOCK = block(SpiritsanctumModBlocks.SEALED_ENVIROMENT_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
