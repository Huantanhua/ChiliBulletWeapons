package com.github.iunius118.chilibulletweapons.neoforge.client;

import com.github.iunius118.chilibulletweapons.client.ChiliBulletRenderer;
import com.github.iunius118.chilibulletweapons.client.ChiliBulletWeaponsClient;
import com.github.iunius118.chilibulletweapons.entity.ModEntityTypes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

public class ChiliBulletWeaponsNeoForgeClient {
    public static void onInitializeClient(IEventBus modEventBus) {
        modEventBus.addListener(ChiliBulletWeaponsNeoForgeClient::onClientSetup);
        modEventBus.addListener(ChiliBulletWeaponsNeoForgeClient::registerEntityRenderer);
    }

    private static void onClientSetup(final FMLClientSetupEvent event) {
        ChiliBulletWeaponsClient.init();
    }

    private static void registerEntityRenderer(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.CHILI_BULLET, ChiliBulletRenderer::new);
    }
}
