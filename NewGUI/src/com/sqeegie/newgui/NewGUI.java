package com.sqeegie.newgui;

import java.util.Arrays;
import java.util.Iterator;

import org.bukkit.Bukkit;

import static org.bukkit.ChatColor.*;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import net.minecraft.server.v1_11_R1.ContainerAnvil;
import com.sqeegie.newgui.Register;

@SuppressWarnings("unused")
public class NewGUI extends JavaPlugin implements Listener {
	
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable() {
		this.getServer().getLogger().info("NewGUI Loaded.");
		
		// Register events
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new GUIControl(), this);
		Bukkit.getPluginManager().registerEvents(new WeaponControl(), this);
		
		// Register crafting recipes
		Register.recipes();
	}


	/** Smelting Inventory creation and execution when called **/
	
	public static Inventory inv;
	
	// Smelting GUI
    public static void openSmeltGUI(Player player){
	    inv = Bukkit.createInventory(null, 9, DARK_GRAY + "Smelting Menu"); 
    	
    	  ItemStack item1 = new ItemStack(Material.CLAY_BRICK);
            ItemMeta meta1 = item1.getItemMeta();
            meta1.setDisplayName("" + WHITE + ChatColor.BOLD + "Bronze");
            meta1.setLore(Arrays.asList(DARK_PURPLE + "Click to smelt!", GOLD + "Cost: ", GRAY + "1 Tin Ore", GRAY + "1 Copper Ore", GOLD + "Produces:", GRAY + "Copper Ingot [x1]"));
            item1.setItemMeta(meta1);
	     inv.setItem(0, (ItemStack) (item1));
	     
	     ItemStack item2 = new ItemStack(Material.IRON_INGOT);
            ItemMeta meta2 = item2.getItemMeta();
            meta2.setDisplayName("" + WHITE + ChatColor.BOLD + "Iron");
            meta2.setLore(Arrays.asList(DARK_PURPLE + "Click to smelt!", GOLD + "Cost: ", GRAY + "1 Iron Ore", GRAY + "1 Coal", GOLD + "Produces:", GRAY + "Iron Ingot [x1]"));
            item2.setItemMeta(meta2);
	     inv.setItem(1, (ItemStack) (item2));
	     
	     ItemStack item3 = new ItemStack(Material.GOLD_INGOT);
            ItemMeta meta3 = item3.getItemMeta();
            meta3.setDisplayName("" + GREEN + ChatColor.BOLD + "Gold");
            meta3.setLore(Arrays.asList(DARK_PURPLE + "Click to smelt!", GOLD + "Cost: ", GRAY + "1 Gold Ore", GRAY + "2 Coal", GOLD + "Produces:", GREEN + "Gold Ingot [x1]"));
            item3.setItemMeta(meta3);
	     inv.setItem(2, (ItemStack) (item3));
	     
	     ItemStack item4 = new ItemStack(Material.GHAST_TEAR);
            ItemMeta meta4 = item4.getItemMeta();
            meta4.setDisplayName("" + GREEN + ChatColor.BOLD + "Mithril");
            meta4.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Click to smelt!", GOLD + "Cost: ", GRAY + "1 Mithril Ore", GRAY + "3 Coal", GOLD + "Produces:", GREEN + "Mithril Ingot [x1]"));
            item4.setItemMeta(meta4);
	     inv.setItem(3, (ItemStack) (item4));
	     
	     ItemStack item5 = new ItemStack(Material.PRISMARINE_SHARD);
            ItemMeta meta5 = item5.getItemMeta();
            meta5.setDisplayName("" + GREEN + ChatColor.BOLD + "Adamantite");
            meta5.setLore(Arrays.asList(DARK_PURPLE + "Click to smelt!", GOLD + "Cost: ", GRAY + "1 Adamantite Ore", GRAY + "4 Coal", GOLD + "Produces:", GREEN + "Adamantite Ingot [x1]"));
            item5.setItemMeta(meta5);
	     inv.setItem(4, (ItemStack) (item5));
	     
	     ItemStack item6 = new ItemStack(Material.DIAMOND);
            ItemMeta meta6 = item6.getItemMeta();
            meta6.setDisplayName("" + GREEN + ChatColor.BOLD + "Crystal");
            meta6.setLore(Arrays.asList(DARK_PURPLE + "Click to smelt!", GOLD + "Cost: ", GRAY + "1 Crystal Ore", GRAY + "4 Coal", GOLD + "Produces:", GREEN + "Refined Crystal [x1]"));
            item6.setItemMeta(meta6);
	     inv.setItem(5, (ItemStack) (item6));
	
	    player.openInventory(inv);
	}
    
    /// Smithing GUI
    public static void openSmithGUI(Player player){
	     inv = Bukkit.createInventory(null, 9, DARK_GRAY + "Smithing Menu"); 
    	
    	  ItemStack item1 = new ItemStack(Material.CLAY_BRICK);
            ItemMeta meta1 = item1.getItemMeta();
            meta1.setDisplayName("" + WHITE + ChatColor.BOLD + "Bronze");
            meta1.setLore(Arrays.asList(DARK_PURPLE + "Click to smith Bronze items!"));
            item1.setItemMeta(meta1);
	     inv.setItem(0, (ItemStack) (item1));
	     
	     ItemStack item2 = new ItemStack(Material.IRON_INGOT);
            ItemMeta meta2 = item2.getItemMeta();
            meta2.setDisplayName("" + WHITE + ChatColor.BOLD + "Iron");
            meta2.setLore(Arrays.asList(DARK_PURPLE + "Click to smith Iron Items!"));
            item2.setItemMeta(meta2);
	     inv.setItem(1, (ItemStack) (item2));
	     
	     ItemStack item3 = new ItemStack(Material.GOLD_INGOT);
            ItemMeta meta3 = item3.getItemMeta();
            meta3.setDisplayName("" + GREEN + ChatColor.BOLD + "Gold");
            meta3.setLore(Arrays.asList(DARK_PURPLE + "Click to smith Gold items"));
            item3.setItemMeta(meta3);
	     inv.setItem(2, (ItemStack) (item3));
	     
	     ItemStack item4 = new ItemStack(Material.GHAST_TEAR);
            ItemMeta meta4 = item4.getItemMeta();
            meta4.setDisplayName("" + GREEN + ChatColor.BOLD + "Mithril");
            meta4.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Click to smith Mithril items!"));
            item4.setItemMeta(meta4);
	     inv.setItem(3, (ItemStack) (item4));
	     
	     ItemStack item5 = new ItemStack(Material.PRISMARINE_SHARD);
            ItemMeta meta5 = item5.getItemMeta();
            meta5.setDisplayName("" + GREEN + ChatColor.BOLD + "Adamantite");
            meta5.setLore(Arrays.asList(DARK_PURPLE + "Click to smith Adamant items!"));
            item5.setItemMeta(meta5);
	     inv.setItem(4, (ItemStack) (item5));
	
	     ItemStack item6 = new ItemStack(Material.DIAMOND);
            ItemMeta meta6 = item6.getItemMeta();
            meta6.setDisplayName("" + GREEN + ChatColor.BOLD + "Crystal");
            meta6.setLore(Arrays.asList(DARK_PURPLE + "Click to smith Crystal items!"));
            item6.setItemMeta(meta6);
	     inv.setItem(5, (ItemStack) (item6));
	     
	    player.openInventory(inv);
	}		
		
	@Override
	public void onDisable() {

	}
	
}

	