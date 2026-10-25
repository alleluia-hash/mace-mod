package com.example.mace;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class MaceMod implements ModInitializer {
	public static final String MOD_ID = "mace_mod";

	public static Item MACE;

	@Override
	public void onInitialize() {
		MACE = Registry.register(
			Registries.ITEM,
			new Identifier(MOD_ID, "mace"),
			new MaceItem(new Item.Settings().maxDamage(500).rarity(Rarity.EPIC))
		);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(MACE));
	}
}
