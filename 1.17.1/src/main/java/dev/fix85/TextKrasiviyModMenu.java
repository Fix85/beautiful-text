package dev.fix85;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.fix85.config.TextKrasiviyConfig;
import me.shedaniel.autoconfig.AutoConfig;

public class TextKrasiviyModMenu implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(TextKrasiviyConfig.class, parent).get();
    }
}
