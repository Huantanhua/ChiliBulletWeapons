package com.github.iunius118.chilibulletweapons.fabric;

import com.github.iunius118.chilibulletweapons.ChiliBulletWeapons;
import net.fabricmc.api.ModInitializer;

public class ChiliBulletWeaponsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ChiliBulletWeapons.init();
    }
}
