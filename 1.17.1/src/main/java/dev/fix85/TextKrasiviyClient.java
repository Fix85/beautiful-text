package dev.fix85;

import dev.fix85.config.TextKrasiviyConfig;
import net.fabricmc.api.ClientModInitializer;

public class TextKrasiviyClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		TextKrasiviyConfig.init();
	}
}
