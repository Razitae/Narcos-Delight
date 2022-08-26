package net.razita.narcosdelight.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab NARCO_TAB = new CreativeModeTab("narcosdelight") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.ACACIA_SAPLING);
        }
    };
}
