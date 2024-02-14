package com.github.iunius118.chilibulletweapons;

import com.github.iunius118.chilibulletweapons.item.ModItems;
import com.github.iunius118.chilibulletweapons.registry.ModRegistries;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import org.slf4j.Logger;

public class ChiliBulletWeapons {
    public static final String MOD_ID = "chilibulletweapons";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        ModRegistries.registerGameObjects();
    }

    public static void registerCompostableItems() {
        ComposterBlock.COMPOSTABLES.put(ModItems.BULLET_CHILI, 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CURVED_CHILI, 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CHILI_SEEDS, 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CHILI_POTATO_SANDWICH, 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModItems.HALF_CHILI_POTATO_SANDWICH, 0.43F);
        ComposterBlock.COMPOSTABLES.put(ModItems.FRIED_CHILI_PEPPER, 0.3F);
    }

    public static LootPool getCurvedChiliLootTable() {
        return LootPool.lootPool()
                .add(LootItem.lootTableItem(ModItems.CURVED_CHILI)
                        .when(LootItemRandomChanceCondition.randomChance(0.125F))
                        .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE, 1)))
                .build();
    }
}
