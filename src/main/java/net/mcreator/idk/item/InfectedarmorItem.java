
package net.mcreator.idk.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.idk.init.IdkModTabs;

public abstract class InfectedarmorItem extends ArmorItem {
	public InfectedarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 7, 9, 8}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.netherrack.break"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "infected_armor";
			}

			@Override
			public float getToughness() {
				return 8.4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends InfectedarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(IdkModTabs.TAB_IDK));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "idk:textures/models/armor/temp__layer_1.png";
		}
	}

	public static class Chestplate extends InfectedarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(IdkModTabs.TAB_IDK));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "idk:textures/models/armor/temp__layer_1.png";
		}
	}

	public static class Leggings extends InfectedarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(IdkModTabs.TAB_IDK));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "idk:textures/models/armor/temp__layer_2.png";
		}
	}

	public static class Boots extends InfectedarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(IdkModTabs.TAB_IDK));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "idk:textures/models/armor/temp__layer_1.png";
		}
	}
}
