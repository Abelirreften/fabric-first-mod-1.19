package net.abelirre.tutorialmod.item;

import net.abelirre.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {

    //Añadir Item Groups
    public static ItemGroup TANZANITE;
    public static ItemGroup ABELIRRE;

    public static void registerItemGroups(){
        //Registrar y Crear un ItemGroup
        TANZANITE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "tanzanite"))
                .displayName(Text.translatable("itemgroup.tanzanite"))
                .icon(()-> new ItemStack(ModItems.TANZANITE))
                .build();

        //Registrar y Crear un Segundo ItemGroup
        ABELIRRE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "abelirre"))
                .displayName(Text.translatable("itemgroup.abelirre"))
                .icon(()-> new ItemStack(ModItems.ABELIRRE))
                .build();
    }

}
