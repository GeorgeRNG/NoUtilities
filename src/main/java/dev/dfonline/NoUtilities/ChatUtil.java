package dev.dfonline.NoUtilities;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class ChatUtil {
    private static MinecraftClient MC = NoUtilities.MC;

    // it is a complex system which will be beyond your understanding.
    // ps does § work for chat messages to color stuff?
    // Lets find out!!!!

    public static void sendMessage(Text message){
        MC.player.sendMessage(message);
    }

    public static void sendMessage(String message){
        sendMessage(Text.literal(message));
    }


    public static void info(String message){
        sendMessage("NoUtilities §b» §f" + message);
    }

    public static void error(String message){
        sendMessage("NoUtilities §4» §c" + message);
    }
}
