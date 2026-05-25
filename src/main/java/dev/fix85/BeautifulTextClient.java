package dev.fix85;

import dev.fix85.config.BeautifulTextConfig;
import net.fabricmc.api.ClientModInitializer;

public class BeautifulTextClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BeautifulTextConfig.init();
    }
}
