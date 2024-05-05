package net.psitheguy.goldengoodies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.psitheguy.goldengoodies.GoldenGoodies;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item REAL_GOLDEN_CARROT = registerItem("real_golden_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.REAL_GOLDEN_CARROT)));
    public static final Item GOLDEN_POTATO = registerItem("golden_potato", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_POTATO)));
    public static final Item GOLDEN_BEETROOT = registerItem( "golden_beetroot", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BEETROOT)));
    public static final Item GOLDEN_SWEET_BERRIES = registerItem( "golden_sweet_berries", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_SWEET_BERRIES)));
    public static final Item GOLDEN_GLOW_BERRIES = registerItem( "golden_glow_berries", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_GLOW_BERRIES)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(REAL_GOLDEN_CARROT);
        entries.add(GOLDEN_POTATO);
        entries.add(GOLDEN_BEETROOT);
        entries.add(GOLDEN_SWEET_BERRIES);
        entries.add(GOLDEN_GLOW_BERRIES);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GoldenGoodies.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GoldenGoodies.LOGGER.info("Registering Mod Items for " + GoldenGoodies.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientItemGroup);
    }
}