package dev.fix85.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = "text-krasiviy")
public class TextKrasiviyConfig implements ConfigData {
    
    @ConfigEntry.Gui.Tooltip
    public boolean enabled = true;
    
    @ConfigEntry.Gui.Tooltip
    public String prefix = "&6&l";
    
    public static void init() {
        AutoConfig.register(TextKrasiviyConfig.class, GsonConfigSerializer::new);
    }
    
    public static TextKrasiviyConfig get() {
        return AutoConfig.getConfigHolder(TextKrasiviyConfig.class).getConfig();
    }
}
