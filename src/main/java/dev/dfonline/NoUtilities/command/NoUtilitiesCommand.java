package dev.dfonline.NoUtilities.command;

import com.mojang.brigadier.CommandDispatcher;
import dev.dfonline.NoUtilities.ChatUtil;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;

import static dev.dfonline.NoUtilities.NoUtilities.MC;
import static dev.dfonline.NoUtilities.NoUtilities.MOD_ID;

public class NoUtilitiesCommand implements Command{
    @Override
    public void register(CommandDispatcher<FabricClientCommandSource> cd) {
        cd.register(
                literal("noutilities")
                        .executes(ctx -> {
                            ChatUtil.info("A utility mod for DiamondFire");

                            return 1;
                        })
                        .then(
                                literal("help").executes(
                                    ctx -> {
                                        MC.player.sendChatMessage("/help " + MOD_ID);

                                        return 1;
                                    }
                                )
                        )
        );

    }

    String name = "NoUtilities";
    String description = "A command for the NoUtilities mod";
}
