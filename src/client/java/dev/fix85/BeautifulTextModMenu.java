package dev.fix85;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.fix85.config.BeautifulTextConfig;
import me.shedaniel.autoconfig.AutoConfig;

public class BeautifulTextModMenu implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(BeautifulTextConfig.class, parent).get();
    }
}
