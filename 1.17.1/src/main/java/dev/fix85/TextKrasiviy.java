package dev.fix85;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextKrasiviy implements ModInitializer {
	public static final String MOD_ID = "text-krasiviy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("TextKrasiviy mod initialized!");
	}
}
