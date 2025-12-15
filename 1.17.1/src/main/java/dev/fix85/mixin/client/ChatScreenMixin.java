package dev.fix85.mixin.client;

import dev.fix85.config.TextKrasiviyConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatScreen.class)
public class ChatScreenMixin {
    
    @Shadow
    protected TextFieldWidget chatField;
    
    @Inject(method = "keyPressed", at = @At("HEAD"))
    private void onKeyPressed(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
        // Enter key = 257
        if (keyCode == 257) {
            if (!TextKrasiviyConfig.get().enabled) {
                return;
            }
            
            String message = chatField.getText();
            
            if (message == null || message.isEmpty() || message.startsWith("/")) {
                return;
            }
            
            String prefix = TextKrasiviyConfig.get().prefix;
            String newMessage;
            
            if (message.startsWith("!")) {
                String rest = message.substring(1);
                if (rest.startsWith(" ")) {
                    rest = rest.substring(1);
                }
                newMessage = "!" + prefix + rest;
            } else {
                newMessage = prefix + message;
            }
            
            chatField.setText(newMessage);
        }
    }
}
