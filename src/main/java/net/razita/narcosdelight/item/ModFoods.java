package net.razita.narcosdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

        public static final FoodProperties MARIJUANA = new FoodProperties.Builder().nutrition(1).saturationMod(0.2f)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200), 0.5f)
                .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 200), 0.5f).alwaysEat().build();
    }
