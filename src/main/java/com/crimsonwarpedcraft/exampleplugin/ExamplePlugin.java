package com.crimsonwarpedcraft.exampleplugin;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmithingTransformRecipe;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * NNTR
 *
 * NNTR
 */
public class ExamplePlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    public class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        NamespacedKey key = new NamespacedKey(this, "WarriorSword");
        ItemStack item = ItemStack.of(Material.DIAMOND_SWORD);

        ShapelessRecipe iron_nugget_nntr = new ShapelessRecipe(key, item);
        iron_nugget_nntr.addIngredient(1, Material.PAPER);
        iron_nugget_nntr.addIngredient(1, Material.IRON_NUGGET);

        getServer().addRecipe(iron_nugget_nntr);

        NamespacedKey key_gold = new NamespacedKey(this, "WarriorSword");
        ItemStack item_gold = ItemStack.of(Material.DIAMOND_SWORD);

        ShapelessRecipe gold_nugget_nntr = new ShapelessRecipe(key_gold, item_gold);
        gold_nugget_nntr.addIngredient(1, Material.PAPER);
        gold_nugget_nntr.addIngredient(1, Material.GOLD_NUGGET);

        getServer().addRecipe(gold_nugget_nntr);
    }
}

    saveDefaultConfig();
  }
}
