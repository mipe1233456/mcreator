
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.idk.item.InfectedarmorItem;
import net.mcreator.idk.IdkMod;

public class IdkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IdkMod.MODID);
	public static final RegistryObject<Item> INFECTED_ARMOR_HELMET = REGISTRY.register("infected_armor_helmet", () -> new InfectedarmorItem.Helmet());
	public static final RegistryObject<Item> INFECTED_ARMOR_CHESTPLATE = REGISTRY.register("infected_armor_chestplate",
			() -> new InfectedarmorItem.Chestplate());
	public static final RegistryObject<Item> INFECTED_ARMOR_LEGGINGS = REGISTRY.register("infected_armor_leggings",
			() -> new InfectedarmorItem.Leggings());
	public static final RegistryObject<Item> INFECTED_ARMOR_BOOTS = REGISTRY.register("infected_armor_boots", () -> new InfectedarmorItem.Boots());
}
