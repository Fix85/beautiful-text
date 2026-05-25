package dev.fix85.mixin.client;

import dev.fix85.config.TextKrasiviyConfig;
import net.minecraft.client.gui.screens.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ChatScreen.class)
public class ChatScreenMixin {

    @ModifyVariable(
        method = "handleChatInput",
        at = @At("HEAD"),
        argsOnly = true,
        ordinal = 0
    )
    private String replaceExclamationMark(String message) {

        if (!TextKrasiviyConfig.get().enabled) {
            return message;
        }

        if (message == null || message.isEmpty()) {
            return message;
        }

        if (message.startsWith("/")) {
            return message;
        }

        String prefix = TextKrasiviyConfig.get().prefix;

        if (message.startsWith("!")) {
            String restOfMessage = message.substring(1);

            if (!restOfMessage.isEmpty() && restOfMessage.startsWith(" ")) {
                restOfMessage = restOfMessage.substring(1);
            }

            return "!" + prefix + restOfMessage;
        }

        return prefix + message;
    }
}
