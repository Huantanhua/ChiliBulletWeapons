package com.github.iunius118.chilibulletweapons;

import com.github.iunius118.chilibulletweapons.registry.ModRegistries;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ChiliBulletWeapons {
    public static final String MOD_ID = "chilibulletweapons";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        ModRegistries.registerGameObjects();
    }
}
