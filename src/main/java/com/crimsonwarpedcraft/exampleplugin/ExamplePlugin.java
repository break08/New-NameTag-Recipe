package com.crimsonwarpedcraft.exampleplugin;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * NNTR.
 *
 * <p>NNTR.
 */
public class ExamplePlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    NamespacedKey key = new NamespacedKey(this, "IronNuggetNT");
    ItemStack item = new ItemStack(Material.NAME_TAG);

    ShapelessRecipe ironNuggetNntr = new ShapelessRecipe(key, item);
    ironNuggetNntr.addIngredient(1, Material.PAPER);
    ironNuggetNntr.addIngredient(1, Material.IRON_NUGGET);

    getServer().addRecipe(ironNuggetNntr);

    NamespacedKey keyGold = new NamespacedKey(this, "GoldNuggetNT");
    ItemStack itemGold = new ItemStack(Material.NAME_TAG);

    ShapelessRecipe goldNuggetNntr = new ShapelessRecipe(keyGold, itemGold);
    goldNuggetNntr.addIngredient(1, Material.PAPER);
    goldNuggetNntr.addIngredient(1, Material.GOLD_NUGGET);

    getServer().addRecipe(goldNuggetNntr);
    saveDefaultConfig();
  }
}