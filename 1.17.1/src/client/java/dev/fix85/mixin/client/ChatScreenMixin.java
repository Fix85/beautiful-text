package dev.fix85.mixin.client;

import dev.fix85.config.TextKrasiviyConfig;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ChatScreen.class)
public class ChatScreenMixin {
    
    @ModifyVariable(
        method = "sendMessage",
        at = @At("HEAD"),
        argsOnly = true,
        ordinal = 0
    )
    private String replaceExclamationMark(String message) {
        // Проверяем включен ли мод
        if (!TextKrasiviyConfig.get().enabled) {
            return message;
        }
        
        // Защита от null и пустых строк
        if (message == null || message.isEmpty()) {
            return message;
        }
        
        // Не обрабатываем команды (начинающиеся с /)
        if (message.startsWith("/")) {
            return message;
        }
        
        String prefix = TextKrasiviyConfig.get().prefix;
        
        // Если начинается с !, сохраняем ! и добавляем префикс к остальной части
        if (message.startsWith("!")) {
            String restOfMessage = message.substring(1);
            
            // Если после ! идет пробел, убираем его
            if (!restOfMessage.isEmpty() && restOfMessage.startsWith(" ")) {
                restOfMessage = restOfMessage.substring(1);
            }
            
            // Возвращаем ! + префикс + остаток
            return "!" + prefix + restOfMessage;
        }
        
        // Если НЕ начинается с !, добавляем префикс ко всему сообщению
        return prefix + message;
    }
}
