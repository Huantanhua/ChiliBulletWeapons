package com.github.iunius118.chilibulletweapons.registry;

import com.github.iunius118.chilibulletweapons.ChiliBulletWeapons;
import com.github.iunius118.chilibulletweapons.item.ModCreativeModeTabs;
import com.github.iunius118.chilibulletweapons.item.ModItems;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;

public class ModRegistries {
    public static void registerGameObjects() {
        registerBlocks();
        registerItems();
        registerCreativeModeTabs();
    }

    private static void registerBlocks() {
        var blockDeferredRegister = DeferredRegister.create(ChiliBulletWeapons.MOD_ID, Registries.BLOCK);

        blockDeferredRegister.register();
    }

    private static void registerItems() {
        var itemDeferredRegister = DeferredRegister.create(ChiliBulletWeapons.MOD_ID, Registries.ITEM);

        itemDeferredRegister.register("bullet_chili", () -> ModItems.BULLET_CHILI);
        itemDeferredRegister.register("curved_chili", () -> ModItems.CURVED_CHILI);
        itemDeferredRegister.register("chili_seeds", () -> ModItems.CHILI_SEEDS);
        itemDeferredRegister.register("chili_bullet", () -> ModItems.CHILI_BULLET);

        itemDeferredRegister.register();
    }

    private static void registerCreativeModeTabs() {
        var creativeModeTabDeferredRegister = DeferredRegister.create(ChiliBulletWeapons.MOD_ID, Registries.CREATIVE_MODE_TAB);

        creativeModeTabDeferredRegister.register("main", () -> ModCreativeModeTabs.MAIN);

        creativeModeTabDeferredRegister.register();
    }
}
