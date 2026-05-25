package dev.fix85;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeautifulText implements ModInitializer {
    public static final String MOD_ID = "beautiful-text";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Beautiful Text mod initialized!");
    }
}
