package net.razita.narcosdelight.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.razita.narcosdelight.item.ModItems;

public class CannabisBlock extends CropBlock {
    public CannabisBlock(Properties properties) {
        super(properties);
    }
    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CANNABIS_SEEDS.get();
    }


    }
