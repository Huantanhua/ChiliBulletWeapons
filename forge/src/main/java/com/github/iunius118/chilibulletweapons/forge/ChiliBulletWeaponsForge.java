package com.github.iunius118.chilibulletweapons.forge;

import com.github.iunius118.chilibulletweapons.ChiliBulletWeapons;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ChiliBulletWeapons.MOD_ID)
public class ChiliBulletWeaponsForge {
    public ChiliBulletWeaponsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ChiliBulletWeapons.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ChiliBulletWeapons.init();
    }
}
