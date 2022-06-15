package dev.dfonline.NoUtilities.command;

import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;

import java.util.ArrayList;
import java.util.List;

public class Commands {
    private static CommandDispatcher<FabricClientCommandSource> dispatcher = ClientCommandManager.getActiveDispatcher();

    public static List<Command> commands = new ArrayList<>();

    public static void register(){
        add(new Help());
        add(new NoUtilitiesCommand());
    }

    private static void add(Command command){
        command.register(dispatcher);
        commands.add(command);
    }
}
