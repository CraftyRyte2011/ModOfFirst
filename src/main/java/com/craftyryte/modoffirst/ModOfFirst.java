package com.craftyryte.modoffirst;

import com.craftyryte.block.ModBlocks;
import com.craftyryte.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModOfFirst implements ModInitializer {
	public static final String MOD_ID = "mod-of-first";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
