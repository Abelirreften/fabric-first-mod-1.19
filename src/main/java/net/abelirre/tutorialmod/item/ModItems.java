package net.abelirre.tutorialmod.item;

import net.abelirre.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    //Registrar y Crear los Ítems
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()));
    public static final Item ABELIRRE = registerItem("abelirre",
            new Item(new FabricItemSettings()));
    public static final Item RICHUPAN = registerItem("richupan",
            new Item(new FabricItemSettings()));

    //Se añaden los Ítems a los ItemGroups deseados
    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_TANZANITE);
        addToItemGroup(ItemGroups.INGREDIENTS, TANZANITE);
        addToItemGroup(ItemGroups.INGREDIENTS, ABELIRRE);
        addToItemGroup(ItemGroups.INGREDIENTS, RICHUPAN);

        addToItemGroup(ModItemGroup.TANZANITE, RAW_TANZANITE);
        addToItemGroup(ModItemGroup.TANZANITE, TANZANITE);
        addToItemGroup(ModItemGroup.ABELIRRE, ABELIRRE);
        addToItemGroup(ModItemGroup.ABELIRRE, RICHUPAN);
    }

    //Registra el item en el ItemGroup
    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    //Registra el Ítem
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    //Registra los Ítems del Mod y llama a la función que los añade a sus Grupos
    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);

        addItemsToItemGroup();
    }
}
