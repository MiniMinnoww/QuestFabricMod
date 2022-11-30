package com.mini.modid;

import com.mini.client.HudOverlay;
import com.mini.commands.Command;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import static net.minecraft.server.command.CommandManager.literal;

public class Main implements ModInitializer {

    public static final String MOD_ID = "modid";
    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("fat")
                .executes(Command::command)));
        HudRenderCallback.EVENT.register(new HudOverlay());

        System.out.println(MOD_ID + " mod initialised!");
    }
}
