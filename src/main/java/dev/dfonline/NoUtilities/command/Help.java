package dev.dfonline.NoUtilities.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import dev.dfonline.NoUtilities.ChatUtil;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;

import static dev.dfonline.NoUtilities.NoUtilities.MOD_ID;

public class Help implements Command{

    @Override
    public void register(CommandDispatcher<FabricClientCommandSource> cd) {

        cd.register(
                literal("help")
                        .then(literal(MOD_ID)
                                .executes(
                                    ctx -> {
                                        ChatUtil.info("Run /help <command> for help with a certain command");
                                        return 0;
                                    }
                                )
                        )
                        .then(argument("command", StringArgumentType.string()).executes(
                                ctx -> {
                                    Command[] filter = (Command[]) Commands.commands.stream().filter(command -> command.name == ctx.getArgument("command",String.class)).toArray();
                                    if(filter.length == 0){
                                        ChatUtil.error("Could not find command.");
                                        return 0;
                                    }

                                    ChatUtil.info(filter[0].name);
                                    ChatUtil.sendMessage(filter[0].description);
                                    return 1;
                                }
                        ))
        );
    }
}
