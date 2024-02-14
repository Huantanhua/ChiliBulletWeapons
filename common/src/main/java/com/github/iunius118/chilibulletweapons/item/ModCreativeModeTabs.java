package com.github.iunius118.chilibulletweapons.item;

import com.github.iunius118.chilibulletweapons.ChiliBulletWeapons;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;

public class ModCreativeModeTabs {
    public final static String KEY_MAIN = "itemGroup." + ChiliBulletWeapons.MOD_ID + ".main";
    public static final CreativeModeTab MAIN = CreativeTabRegistry.create(Component.translatable(KEY_MAIN), () -> new ItemStack(ModItems.BULLET_CHILI));
    public static final ItemStack[] MAIN_ITEMS = {
            // Plants
            new ItemStack(ModItems.BULLET_CHILI),
            new ItemStack(ModItems.CURVED_CHILI),
            new ItemStack(ModItems.CHILI_SEEDS),

            // Foods
            new ItemStack(ModItems.CHILI_CHICKEN_SANDWICH),
            new ItemStack(ModItems.CHILI_FISH_SANDWICH),
            new ItemStack(ModItems.CHILI_MEAT_SANDWICH),
            new ItemStack(ModItems.CHILI_POTATO_SANDWICH),
            new ItemStack(ModItems.HALF_CHILI_CHICKEN_SANDWICH),
            new ItemStack(ModItems.HALF_CHILI_FISH_SANDWICH),
            new ItemStack(ModItems.HALF_CHILI_MEAT_SANDWICH),
            new ItemStack(ModItems.HALF_CHILI_POTATO_SANDWICH),
            new ItemStack(ModItems.FRIED_CHILI_PEPPER),

            // Weapons
            new ItemStack(ModItems.CHILI_BULLET),
            new ItemStack(ModItems.GUN),
            ChiliBulletGun.enchant(ModItems.GUN, Enchantments.PIERCING),
            ChiliBulletGun.enchant(ModItems.GUN, Enchantments.MULTISHOT),
            // ChiliBulletGun.enchant(ModItems.GUN, Enchantments.PIERCING, Enchantments.MULTISHOT), // For debug
            ChiliBulletGun.enchant(ModItems.GUN, Enchantments.QUICK_CHARGE),
            ChiliBulletGun.enchant(ModItems.GUN, Enchantments.PIERCING, Enchantments.QUICK_CHARGE),
            ChiliBulletGun.enchant(ModItems.GUN, Enchantments.MULTISHOT, Enchantments.QUICK_CHARGE),
            // ChiliBulletGun.enchant(ModItems.GUN, Enchantments.PIERCING, Enchantments.MULTISHOT, Enchantments.QUICK_CHARGE),  // For debug
            ChiliBulletMachineGun.enchant(ModItems.MACHINE_GUN, Enchantments.PIERCING)
    };
}
