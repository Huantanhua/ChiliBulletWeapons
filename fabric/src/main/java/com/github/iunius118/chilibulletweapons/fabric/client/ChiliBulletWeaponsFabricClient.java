package com.github.iunius118.chilibulletweapons.fabric.client;

import com.github.iunius118.chilibulletweapons.block.ModBlocks;
import com.github.iunius118.chilibulletweapons.client.ChiliBulletRenderer;
import com.github.iunius118.chilibulletweapons.client.ChiliBulletWeaponsClient;
import com.github.iunius118.chilibulletweapons.entity.ModEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;

public class ChiliBulletWeaponsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChiliBulletWeaponsClient.init();
        registerCropBlockLayer();
        registerEntityRenderer();
    }

    private void registerCropBlockLayer() {
        // Set render type of crop block to cutout
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHILI_PEPPER, RenderType.cutout());
    }

    private void registerEntityRenderer() {
        EntityRendererRegistry.register(ModEntityTypes.CHILI_BULLET, ChiliBulletRenderer::new);
    }
}
