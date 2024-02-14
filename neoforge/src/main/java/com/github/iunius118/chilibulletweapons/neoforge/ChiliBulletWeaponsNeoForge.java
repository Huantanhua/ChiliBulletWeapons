package com.github.iunius118.chilibulletweapons.neoforge;

import com.github.iunius118.chilibulletweapons.ChiliBulletWeapons;
import com.github.iunius118.chilibulletweapons.item.ModCreativeModeTabs;
import com.github.iunius118.chilibulletweapons.neoforge.client.ChiliBulletWeaponsNeoForgeClient;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.LootTableLoadEvent;

import java.util.Arrays;

@Mod(ChiliBulletWeapons.MOD_ID)
public class ChiliBulletWeaponsNeoForge {
    public ChiliBulletWeaponsNeoForge(IEventBus modEventBus, Dist dist) {
        ChiliBulletWeapons.init();
        modEventBus.addListener(this::registerItemsToCreativeTabs);
        modEventBus.addListener(this::onCommonSetup);

        if (dist.isClient()) {
            ChiliBulletWeaponsNeoForgeClient.onInitializeClient(modEventBus);
        }

        NeoForge.EVENT_BUS.addListener(this::onLootTableLoad);
    }

    private void registerItemsToCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeModeTabs.MAIN) {
            event.acceptAll(Arrays.asList(ModCreativeModeTabs.MAIN_ITEMS));
        }
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        ChiliBulletWeapons.registerCompostableItems();
    }

    private void onLootTableLoad(final LootTableLoadEvent event) {
        if (event.getName().equals(new ResourceLocation("blocks/short_grass"))) {
            event.getTable().addPool(ChiliBulletWeapons.getCurvedChiliLootTable());
        }
    }
}
