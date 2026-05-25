package dev.fix85.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = "beautiful-text")
public class BeautifulTextConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip
    public boolean enabled = true;

    @ConfigEntry.Gui.Tooltip
    public String prefix = "&6&l";

    public static void init() {
        AutoConfig.register(BeautifulTextConfig.class, GsonConfigSerializer::new);
    }

    public static BeautifulTextConfig get() {
        return AutoConfig.getConfigHolder(BeautifulTextConfig.class).getConfig();
    }
}
