package com.github.iunius118.chilibulletweapons.client;

import com.github.iunius118.chilibulletweapons.item.ChiliBulletGun;
import com.github.iunius118.chilibulletweapons.item.ModItems;
import dev.architectury.registry.item.ItemPropertiesRegistry;

public class ChiliBulletWeaponsClient {
    public static void init() {
        registerItemProperties();
    }

    private static void registerItemProperties() {
        ItemPropertiesRegistry.register(ModItems.GUN, ChiliBulletGun.PROPERTY_LOADING, (stack, l, e, i) -> ChiliBulletGun.isLoading(stack) ? 1.0F : 0.0F);
        ItemPropertiesRegistry.register(ModItems.GUN, ChiliBulletGun.PROPERTY_MULTISHOT, (stack, l, e, i) -> ChiliBulletGun.getMultishotLevel(stack) != 0 ? 1.0F : 0.0F);
        ItemPropertiesRegistry.register(ModItems.GUN, ChiliBulletGun.PROPERTY_PIERCING, (stack, l, e, i) -> ChiliBulletGun.getPiercingLevel(stack) > 0 ? 1.0F : 0.0F);
    }
}
