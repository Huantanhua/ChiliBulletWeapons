package com.github.iunius118.chilibulletweapons.data;

import com.github.iunius118.chilibulletweapons.item.ModItems;
import com.github.iunius118.chilibulletweapons.tags.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        /* Plants */
        // Seeds
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHILI_SEEDS)
                .group(getItemId(ModItems.CHILI_SEEDS).toString())
                .requires(ModItems.CURVED_CHILI)
                .unlockedBy("has_curved_chili", has(ModItems.CURVED_CHILI))
                .save(recipeOutput, getItemId(ModItems.CHILI_SEEDS));

        // Storage items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BULLET_CHILI_SACK)
                .group(getItemId(ModItems.BULLET_CHILI_SACK).toString())
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.BULLET_CHILI)
                .unlockedBy("has_bullet_chili", has(ModItems.BULLET_CHILI))
                .save(recipeOutput, getItemId(ModItems.BULLET_CHILI_SACK));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BULLET_CHILI, 9)
                .group(getItemId(ModItems.BULLET_CHILI).toString())
                .requires(ModItems.BULLET_CHILI_SACK)
                .unlockedBy("has_bullet_chili_sack", has(ModItems.BULLET_CHILI_SACK))
                .save(recipeOutput, getItemId(ModItems.BULLET_CHILI) + "_from_sack");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CURVED_CHILI_SACK)
                .group(getItemId(ModItems.CURVED_CHILI_SACK).toString())
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CURVED_CHILI)
                .unlockedBy("has_curved_chili", has(ModItems.CURVED_CHILI))
                .save(recipeOutput, getItemId(ModItems.CURVED_CHILI_SACK));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CURVED_CHILI, 9)
                .group(getItemId(ModItems.CURVED_CHILI).toString())
                .requires(ModItems.CURVED_CHILI_SACK)
                .unlockedBy("has_curved_chili_sack", has(ModItems.CURVED_CHILI_SACK))
                .save(recipeOutput, getItemId(ModItems.CURVED_CHILI) + "_from_sack");

        /* Foods */
        // Sandwiches
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHILI_CHICKEN_SANDWICH, 2)
                .group(getItemId(ModItems.CHILI_CHICKEN_SANDWICH).toString())
                .requires(ModItems.CURVED_CHILI)
                .requires(Items.COOKED_CHICKEN)
                .requires(Items.BREAD)
                .unlockedBy("has_curved_chili", has(ModItems.CURVED_CHILI))
                .save(recipeOutput, getItemId(ModItems.CHILI_CHICKEN_SANDWICH));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHILI_FISH_SANDWICH, 2)
                .group(getItemId(ModItems.CHILI_FISH_SANDWICH).toString())
                .requires(ModItems.CURVED_CHILI)
                .requires(ModItemTags.FOODS_COOKED_FISH)
                .requires(Items.BREAD)
                .unlockedBy("has_curved_chili", has(ModItems.CURVED_CHILI))
                .save(recipeOutput, getItemId(ModItems.CHILI_FISH_SANDWICH));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHILI_MEAT_SANDWICH, 2)
                .group(getItemId(ModItems.CHILI_MEAT_SANDWICH).toString())
                .requires(ModItems.CURVED_CHILI)
                .requires(ModItemTags.FOODS_COOKED_MEAT)
                .requires(Items.BREAD)
                .unlockedBy("has_curved_chili", has(ModItems.CURVED_CHILI))
                .save(recipeOutput, getItemId(ModItems.CHILI_MEAT_SANDWICH));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHILI_POTATO_SANDWICH, 2)
                .group(getItemId(ModItems.CHILI_POTATO_SANDWICH).toString())
                .requires(ModItems.CURVED_CHILI)
                .requires(Items.BAKED_POTATO)
                .requires(Items.BREAD)
                .unlockedBy("has_curved_chili", has(ModItems.CURVED_CHILI))
                .save(recipeOutput, getItemId(ModItems.CHILI_POTATO_SANDWICH));

        // Half-sized sandwiches
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.HALF_CHILI_CHICKEN_SANDWICH, 2)
                .group(getItemId(ModItems.HALF_CHILI_CHICKEN_SANDWICH).toString())
                .requires(ModItems.CHILI_CHICKEN_SANDWICH)
                .unlockedBy("has_full_sandwich", has(ModItems.CHILI_CHICKEN_SANDWICH))
                .save(recipeOutput, getItemId(ModItems.HALF_CHILI_CHICKEN_SANDWICH));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.HALF_CHILI_FISH_SANDWICH, 2)
                .group(getItemId(ModItems.HALF_CHILI_FISH_SANDWICH).toString())
                .requires(ModItems.CHILI_FISH_SANDWICH)
                .unlockedBy("has_full_sandwich", has(ModItems.CHILI_FISH_SANDWICH))
                .save(recipeOutput, getItemId(ModItems.HALF_CHILI_FISH_SANDWICH));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.HALF_CHILI_MEAT_SANDWICH, 2)
                .group(getItemId(ModItems.HALF_CHILI_MEAT_SANDWICH).toString())
                .requires(ModItems.CHILI_MEAT_SANDWICH)
                .unlockedBy("has_full_sandwich", has(ModItems.CHILI_MEAT_SANDWICH))
                .save(recipeOutput, getItemId(ModItems.HALF_CHILI_MEAT_SANDWICH));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.HALF_CHILI_POTATO_SANDWICH, 2)
                .group(getItemId(ModItems.HALF_CHILI_POTATO_SANDWICH).toString())
                .requires(ModItems.CHILI_POTATO_SANDWICH)
                .unlockedBy("has_curved_chili", has(ModItems.CHILI_POTATO_SANDWICH))
                .save(recipeOutput, getItemId(ModItems.HALF_CHILI_POTATO_SANDWICH));

        // Pasta
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PASTA_OIL_AND_CHILI)
                .group(getItemId(ModItems.PASTA_OIL_AND_CHILI).toString())
                .pattern(" c ")
                .pattern("www")
                .pattern(" b ")
                .define('c', ModItems.CURVED_CHILI)
                .define('w', Tags.Items.CROPS_WHEAT)
                .define('b', Items.BOWL)
                .unlockedBy("has_curved_chili", has(ModItems.CURVED_CHILI))
                .save(recipeOutput, getItemId(ModItems.PASTA_OIL_AND_CHILI));

        // Fried chili pepper
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.FRIED_CHILI_PEPPER, 3)
                .group(getItemId(ModItems.FRIED_CHILI_PEPPER).toString())
                .requires(ModItems.CURVED_CHILI, 3)
                .requires(Items.WHEAT)
                .unlockedBy("has_curved_chili", has(ModItems.CURVED_CHILI))
                .save(recipeOutput, getItemId(ModItems.FRIED_CHILI_PEPPER));

        /* Weapons */
        // Bullet
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.CHILI_BULLET)
                .group(getItemId(ModItems.CHILI_BULLET).toString())
                .requires(ModItems.BULLET_CHILI)
                .unlockedBy("has_bullet_chili", has(ModItems.BULLET_CHILI))
                .save(recipeOutput, getItemId(ModItems.CHILI_BULLET));

        // Upgrade parts
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UPGRADE_GUN_BAYONET)
                .group(getItemId(ModItems.UPGRADE_GUN_BAYONET).toString())
                .pattern("bbb")
                .pattern("iis")
                .pattern("bbb")
                .define('b', ModItems.CHILI_BULLET)
                .define('i', Tags.Items.INGOTS_IRON)
                .define('s', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_gun", has(ModItems.GUN))
                .save(recipeOutput, getItemId(ModItems.UPGRADE_GUN_BAYONET));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UPGRADE_GUN_BARREL)
                .group(getItemId(ModItems.UPGRADE_GUN_BARREL).toString())
                .pattern("bbb")
                .pattern("iii")
                .pattern("bbb")
                .define('b', ModItems.CHILI_BULLET)
                .define('i', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_gun", has(ModItems.GUN))
                .save(recipeOutput, getItemId(ModItems.UPGRADE_GUN_BARREL));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UPGRADE_GUN_MECHANISM)
                .group(getItemId(ModItems.UPGRADE_GUN_MECHANISM).toString())
                .pattern("bbb")
                .pattern("pii")
                .pattern("bbb")
                .define('b', ModItems.CHILI_BULLET)
                .define('p', ItemTags.PLANKS)
                .define('i', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_gun", has(ModItems.GUN))
                .save(recipeOutput, getItemId(ModItems.UPGRADE_GUN_MECHANISM));

        // Guns
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GUN)
                .group(getItemId(ModItems.GUN).toString())
                .pattern("i  ")
                .pattern(" i ")
                .pattern(" pb")
                .define('i', Tags.Items.INGOTS_IRON)
                .define('p', ItemTags.PLANKS)
                .define('b', ModItems.CHILI_BULLET)
                .unlockedBy("has_chili_bullet", has(ModItems.CHILI_BULLET))
                .save(recipeOutput, getItemId(ModItems.GUN));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.BAYONETED_GUN)
                .group(getItemId(ModItems.BAYONETED_GUN).toString())
                .requires(ModItems.UPGRADE_GUN_BAYONET)
                .requires(ModItems.GUN)
                .unlockedBy("has_gun", has(ModItems.GUN))
                .save(recipeOutput, getItemId(ModItems.BAYONETED_GUN));
    }

    private ResourceLocation getItemId(Item item) {
        return BuiltInRegistries.ITEM.getKey(item);
    }
}
