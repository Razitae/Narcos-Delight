package net.razita.narcosdelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.razita.narcosdelight.NarcosDelight;
import net.razita.narcosdelight.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NarcosDelight.MOD_ID);

    public static final RegistryObject<Item> MARIJUANA = ITEMS.register("marijuana",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NARCO_TAB).food(ModFoods.MARIJUANA)));

    public static final RegistryObject<Item> CANNABIS_SEEDS = ITEMS.register("cannabis_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CANNABIS_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.NARCO_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
