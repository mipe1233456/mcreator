
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idk.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class IdkModTabs {
	public static CreativeModeTab TAB_IDK;

	public static void load() {
		TAB_IDK = new CreativeModeTab("tabidk") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(IdkModItems.I.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
