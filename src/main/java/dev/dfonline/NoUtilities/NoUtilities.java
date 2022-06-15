package dev.dfonline.NoUtilities;

import dev.dfonline.NoUtilities.command.Commands;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoUtilities implements ModInitializer {
	public static final MinecraftClient MC = MinecraftClient.getInstance();
	public static final String MOD_ID = "NoUtilities";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Commands.register();
		LOGGER.info(MOD_ID + " loaded!");
	}
}
