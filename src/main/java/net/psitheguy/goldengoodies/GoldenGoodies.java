package net.psitheguy.goldengoodies;

import net.fabricmc.api.ModInitializer;
import net.psitheguy.goldengoodies.item.ModItems;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoldenGoodies implements ModInitializer {
	public static final String MOD_ID = "golden-goodies";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}