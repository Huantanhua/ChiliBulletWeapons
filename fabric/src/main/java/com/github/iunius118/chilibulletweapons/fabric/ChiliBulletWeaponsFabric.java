package com.github.iunius118.chilibulletweapons.fabric;

import com.github.iunius118.chilibulletweapons.ChiliBulletWeapons;
import com.github.iunius118.chilibulletweapons.item.ModCreativeModeTabs;
import dev.architectury.registry.CreativeTabRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.level.storage.loot.LootDataManager;
import net.minecraft.world.level.storage.loot.LootTable;

public class ChiliBulletWeaponsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ChiliBulletWeapons.init();
        registerItemsToCreativeTabs();
        ChiliBulletWeapons.registerCompostableItems();
        LootTableEvents.MODIFY.register(this::onLootTableLoad);
    }

    private void registerItemsToCreativeTabs() {
        CreativeTabRegistry.appendBuiltinStack(ModCreativeModeTabs.MAIN, ModCreativeModeTabs.MAIN_ITEMS);
    }

    private void onLootTableLoad(ResourceManager resourceManager, LootDataManager lootManager, ResourceLocation id, LootTable.Builder tableBuilder, LootTableSource source) {
        if (source.isBuiltin() && id.equals(new ResourceLocation("blocks/short_grass"))) {
            tableBuilder.pool(ChiliBulletWeapons.getCurvedChiliLootTable());
        }
    }
}
