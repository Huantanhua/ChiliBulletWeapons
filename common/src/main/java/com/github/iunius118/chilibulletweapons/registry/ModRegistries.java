package com.github.iunius118.chilibulletweapons.registry;

import com.github.iunius118.chilibulletweapons.ChiliBulletWeapons;
import com.github.iunius118.chilibulletweapons.block.ModBlocks;
import com.github.iunius118.chilibulletweapons.entity.ChiliBullet;
import com.github.iunius118.chilibulletweapons.entity.ModEntityTypes;
import com.github.iunius118.chilibulletweapons.item.ModCreativeModeTabs;
import com.github.iunius118.chilibulletweapons.item.ModItems;
import com.github.iunius118.chilibulletweapons.sounds.ModSoundEvents;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;

public class ModRegistries {
    public static void registerGameObjects() {
        registerBlocks();
        registerItems();
        registerSoundEvents();
        registerEntityTypes();
        registerCreativeModeTabs();
    }

    private static void registerBlocks() {
        var blockRegister = DeferredRegister.create(ChiliBulletWeapons.MOD_ID, Registries.BLOCK);

        blockRegister.register("chili_pepper", () -> ModBlocks.CHILI_PEPPER);

        blockRegister.register();
    }

    private static void registerItems() {
        var itemRegister = DeferredRegister.create(ChiliBulletWeapons.MOD_ID, Registries.ITEM);

        // Plants
        itemRegister.register("bullet_chili", () -> ModItems.BULLET_CHILI);
        itemRegister.register("curved_chili", () -> ModItems.CURVED_CHILI);
        itemRegister.register("chili_seeds", () -> ModItems.CHILI_SEEDS);
        // Foods
        itemRegister.register("chili_chicken_sandwich", () -> ModItems.CHILI_CHICKEN_SANDWICH);
        itemRegister.register("chili_fish_sandwich", () -> ModItems.CHILI_FISH_SANDWICH);
        itemRegister.register("chili_meat_sandwich", () -> ModItems.CHILI_MEAT_SANDWICH);
        itemRegister.register("chili_potato_sandwich", () -> ModItems.CHILI_POTATO_SANDWICH);
        itemRegister.register("half_chili_chicken_sandwich", () -> ModItems.HALF_CHILI_CHICKEN_SANDWICH);
        itemRegister.register("half_chili_fish_sandwich", () -> ModItems.HALF_CHILI_FISH_SANDWICH);
        itemRegister.register("half_chili_meat_sandwich", () -> ModItems.HALF_CHILI_MEAT_SANDWICH);
        itemRegister.register("half_chili_potato_sandwich", () -> ModItems.HALF_CHILI_POTATO_SANDWICH);
        itemRegister.register("fried_chili_pepper", () -> ModItems.FRIED_CHILI_PEPPER);
        // Weapons
        itemRegister.register("chili_bullet", () -> ModItems.CHILI_BULLET);
        itemRegister.register("gun", () -> ModItems.GUN);
        itemRegister.register("machine_gun", () -> ModItems.MACHINE_GUN);

        itemRegister.register();
    }

    private static void registerSoundEvents() {
        var soundEventRegister = DeferredRegister.create(ChiliBulletWeapons.MOD_ID, Registries.SOUND_EVENT);

        soundEventRegister.register("block_chili_pepper_pick_chili_peppers", () -> ModSoundEvents.CHILI_PEPPER_PICK_CHILI_PEPPERS);
        soundEventRegister.register("item_gun_shoot", () -> ModSoundEvents.GUN_SHOOT);
        soundEventRegister.register("item_gun_action_open", () -> ModSoundEvents.GUN_ACTION_OPEN);
        soundEventRegister.register("item_gun_action_close", () -> ModSoundEvents.GUN_ACTION_CLOSE);

        soundEventRegister.register();
    }

    private static void registerEntityTypes() {
        var entityTypeRegister = DeferredRegister.create(ChiliBulletWeapons.MOD_ID, Registries.ENTITY_TYPE);

        entityTypeRegister.register(ChiliBullet.ID.getPath(), () -> ModEntityTypes.CHILI_BULLET);

        entityTypeRegister.register();
    }

    public static void registerCreativeModeTabs() {
        var creativeModeTabRegister = DeferredRegister.create(ChiliBulletWeapons.MOD_ID, Registries.CREATIVE_MODE_TAB);

        creativeModeTabRegister.register("main", () -> ModCreativeModeTabs.MAIN);

        creativeModeTabRegister.register();
    }
}
