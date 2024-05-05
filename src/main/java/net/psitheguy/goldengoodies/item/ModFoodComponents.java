package net.psitheguy.goldengoodies.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent REAL_GOLDEN_CARROT = new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1.0f).build();

    public static final FoodComponent GOLDEN_BEETROOT = new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400, 1), 1.0f).build();

    public static final FoodComponent GOLDEN_POTATO = new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 1), 1.0f).build();

    public static final FoodComponent GOLDEN_SWEET_BERRIES = new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 400, 0), 1.0f).build();

    public static final FoodComponent GOLDEN_GLOW_BERRIES = new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0), 1.0f).build();
}
