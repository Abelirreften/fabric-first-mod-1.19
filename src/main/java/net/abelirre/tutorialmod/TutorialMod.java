package net.abelirre.tutorialmod;

import net.abelirre.tutorialmod.block.ModBlocks;
import net.abelirre.tutorialmod.item.ModItemGroup;
import net.abelirre.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
