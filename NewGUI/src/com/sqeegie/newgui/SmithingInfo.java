package com.sqeegie.newgui;

import java.util.Arrays;

import static org.bukkit.ChatColor.*;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.sqeegie.newgui.Costs;

@SuppressWarnings("unused")
public class SmithingInfo implements Listener{

	public static Inventory smith;
    
    
	/** Bronze smithing menu layout **/
	public static void openBronzeSmith(Player p) {
		smith = Bukkit.createInventory(null, 27, DARK_GRAY + "Bronze Items");
		
		// Back Arrow
    	ItemStack B = new ItemStack(Material.ARROW, 1);
        ItemMeta b = B.getItemMeta();
        b.setDisplayName("" + DARK_RED + BOLD + "Back");
        B.setItemMeta(b);
        smith.setItem(18, (ItemStack) (B));        
        
        // Bronze Axe
        ItemStack I = new ItemStack(Material.WOOD_AXE, 1);
        ItemMeta i = I.getItemMeta();
        i.setDisplayName("" + GRAY + BOLD + "Bronze Axe");
        i.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.bronzeAxe, "", RED + "Lvl " + Costs.smithBronzeAxe + " Smithing Required"));
        I.setItemMeta(i);
        smith.setItem(2, (ItemStack) (I));
        
        // Bronze Sword
        ItemStack I2 = new ItemStack(Material.WOOD_SWORD, 1);
        ItemMeta i2 = I2.getItemMeta();
        i2.setDisplayName("" + GRAY + BOLD + "Bronze Sword");
        i2.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.bronzeSword, "", RED + "Lvl " + Costs.smithBronzeSword + " Smithing Required"));
        I2.setItemMeta(i2);
        smith.setItem(3, (ItemStack) (I2));
        
        // Bronze Mace
        ItemStack I3 = new ItemStack(Material.WOOD_SPADE, 1);
        ItemMeta i3 = I3.getItemMeta();
        i3.setDisplayName("" + GRAY + BOLD + "Bronze Mace");
        i3.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.bronzeMace, "", RED + "Lvl " + Costs.smithBronzeMace + " Smithing Required"));
        I3.setItemMeta(i3);
        smith.setItem(4, (ItemStack) (I3));
        
        // Bronze Shield
        ItemStack I4 = new ItemStack(Material.SHIELD, 1);
        ItemMeta i4 = I4.getItemMeta();
        i4.setDisplayName("" + GRAY + BOLD + "Bronze Shield");
        i4.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.bronzeShield, "", RED + "Lvl " + Costs.smithBronzeShield + " Smithing Required"));
        I4.setItemMeta(i4);
        smith.setItem(5, (ItemStack) (I4));
        
        // Bronze Boots
        ItemStack I5 = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta i5 = I5.getItemMeta();
        i5.setDisplayName("" + GRAY + BOLD + "Bronze Boots");
        i5.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.bronzeBoots, "", RED + "Lvl " + Costs.smithBronzeBoots + " Smithing Required"));
        I5.setItemMeta(i5);
        smith.setItem(6, (ItemStack) (I5));
        
        // Bronze Helmet
        ItemStack I6 = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta i6 = I6.getItemMeta();
        i6.setDisplayName("" + GRAY + BOLD + "Bronze Helmet");
        i6.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.bronzeHelmet, "", RED + "Lvl " + Costs.smithBronzeHelmet + " Smithing Required"));
        I6.setItemMeta(i6);
        smith.setItem(11, (ItemStack) (I6));
        
        // Bronze Leggings
        ItemStack I7 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta i7 = I7.getItemMeta();
        i7.setDisplayName("" + GRAY + BOLD + "Bronze Legplates");
        i7.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.bronzeLeggings, "", RED + "Lvl " + Costs.smithBronzeLeggings + " Smithing Required"));
        I7.setItemMeta(i7);
        smith.setItem(12, (ItemStack) (I7));
        
        // Bronze Chestplate
        ItemStack I8 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta i8 = I8.getItemMeta();
        i8.setDisplayName("" + GRAY + BOLD + "Bronze Chestplate");
        i8.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.bronzeChestplate, "", RED + "Lvl " + Costs.smithBronzeChestplate + " Smithing Required"));
        I8.setItemMeta(i8);
        smith.setItem(13, (ItemStack) (I8));
        
        p.openInventory(smith);
	}
	
	/** Iron smithing menu layout **/
	public static void openIronSmith(Player p) {
		smith = Bukkit.createInventory(null, 27, DARK_GRAY + "Iron Items");
		
		// Back Arrow
    	ItemStack B = new ItemStack(Material.ARROW, 1);
        ItemMeta b = B.getItemMeta();
        b.setDisplayName("" + DARK_RED + BOLD + "Back");
        B.setItemMeta(b);
        smith.setItem(18, (ItemStack) (B));        
        
        // Iron Axe
        ItemStack I = new ItemStack(Material.IRON_AXE, 1);
        ItemMeta i = I.getItemMeta();
        i.setDisplayName("" + GRAY + BOLD + "Iron Axe");
        i.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.ironAxe, "", RED + "Lvl " + Costs.smithIronAxe + " Smithing Required"));
        I.setItemMeta(i);
        smith.setItem(2, (ItemStack) (I));
        
        // Iron Sword
        ItemStack I2 = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta i2 = I2.getItemMeta();
        i2.setDisplayName("" + GRAY + BOLD + "Iron Sword");
        i2.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.ironSword, "", RED + "Lvl " + Costs.smithIronSword + " Smithing Required"));
        I2.setItemMeta(i2);
        smith.setItem(3, (ItemStack) (I2));
        
        // Iron Mace
        ItemStack I3 = new ItemStack(Material.IRON_SPADE, 1);
        ItemMeta i3 = I3.getItemMeta();
        i3.setDisplayName("" + GRAY + BOLD + "Iron Mace");
        i3.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.ironMace, "", RED + "Lvl " + Costs.smithIronMace + " Smithing Required"));
        I3.setItemMeta(i3);
        smith.setItem(4, (ItemStack) (I3));
        
        // Iron Shield
        ItemStack I4 = new ItemStack(Material.SHIELD, 1);
        ItemMeta i4 = I4.getItemMeta();
        i4.setDisplayName("" + GRAY + BOLD + "Iron Shield");
        i4.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.ironShield, "", RED + "Lvl " + Costs.smithIronShield + " Smithing Required"));
        I4.setItemMeta(i4);
        smith.setItem(5, (ItemStack) (I4));
        
        // Iron Boots
        ItemStack I5 = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta i5 = I5.getItemMeta();
        i5.setDisplayName("" + GRAY + BOLD + "Iron Boots");
        i5.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.ironBoots, "", RED + "Lvl " + Costs.smithIronBoots + " Smithing Required"));
        I5.setItemMeta(i5);
        smith.setItem(6, (ItemStack) (I5));
        
        // Iron Helmet
        ItemStack I6 = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta i6 = I6.getItemMeta();
        i6.setDisplayName("" + GRAY + BOLD + "Iron Helmet");
        i6.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.ironHelmet, "", RED + "Lvl + " + Costs.smithIronHelmet + " Smithing Required"));
        I6.setItemMeta(i6);
        smith.setItem(11, (ItemStack) (I6));
        
        // Iron Leggings
        ItemStack I7 = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta i7 = I7.getItemMeta();
        i7.setDisplayName("" + GRAY + BOLD + "Iron Legplates");
        i7.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.ironLeggings, "", RED + "Lvl " + Costs.smithIronLeggings + " Smithing Required"));
        I7.setItemMeta(i7);
        smith.setItem(12, (ItemStack) (I7));
        
        // Iron Chestplate
        ItemStack I8 = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta i8 = I8.getItemMeta();
        i8.setDisplayName("" + GRAY + BOLD + "Iron Chestplate");
        i8.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.ironChestplate, "", RED + "Lvl " + Costs.smithIronChestplate + " Smithing Required"));
        I8.setItemMeta(i8);
        smith.setItem(13, (ItemStack) (I8));
        
        p.openInventory(smith);
	}
	
	/** Gold smithing menu layout **/
	public static void openGoldSmith(Player p){
		smith = Bukkit.createInventory(null, 27, DARK_GRAY + "Gold Items");
		
		// Back Arrow
    	ItemStack B = new ItemStack(Material.ARROW, 1);
        ItemMeta b = B.getItemMeta();
        b.setDisplayName("" + DARK_RED + BOLD + "Back");
        B.setItemMeta(b);
        smith.setItem(18, (ItemStack) (B));        
        
        // Gold Axe
        ItemStack I = new ItemStack(Material.GOLD_AXE, 1);
        ItemMeta i = I.getItemMeta();
        i.setDisplayName("" + GREEN + BOLD + "Gold Axe");
        i.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.goldAxe, "", RED + "Lvl " + Costs.smithGoldAxe + " Smithing Required"));
        I.setItemMeta(i);
        smith.setItem(2, (ItemStack) (I));
        
        // Gold Sword
        ItemStack I2 = new ItemStack(Material.GOLD_SWORD, 1);
        ItemMeta i2 = I2.getItemMeta();
        i2.setDisplayName("" + GREEN + BOLD + "Gold Sword");
        i2.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.goldSword, "", RED + "Lvl " + Costs.smithGoldSword + " Smithing Required"));
        I2.setItemMeta(i2);
        smith.setItem(3, (ItemStack) (I2));
        
        // Gold Mace
        ItemStack I3 = new ItemStack(Material.GOLD_SPADE, 1);
        ItemMeta i3 = I3.getItemMeta();
        i3.setDisplayName("" + GREEN + BOLD + "Gold Mace");
        i3.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.goldMace, "", RED + "Lvl " + Costs.smithGoldMace + " Smithing Required"));
        I3.setItemMeta(i3);
        smith.setItem(4, (ItemStack) (I3));
        
        // Gold Shield
        ItemStack I4 = new ItemStack(Material.SHIELD, 1);
        ItemMeta i4 = I4.getItemMeta();
        i4.setDisplayName("" + GREEN + BOLD + "Gold Shield");
        i4.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.goldShield, "", RED + "Lvl " + Costs.smithGoldShield + " Smithing Required"));
        I4.setItemMeta(i4);
        smith.setItem(5, (ItemStack) (I4));
        
        // Gold Boots
        ItemStack I5 = new ItemStack(Material.GOLD_BOOTS, 1);
        ItemMeta i5 = I5.getItemMeta();
        i5.setDisplayName("" + GREEN + BOLD + "Gold Boots");
        i5.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.goldBoots, "", RED + "Lvl " + Costs.smithGoldBoots + " Smithing Required"));
        I5.setItemMeta(i5);
        smith.setItem(6, (ItemStack) (I5));
        
        // Gold Helmet
        ItemStack I6 = new ItemStack(Material.GOLD_HELMET, 1);
        ItemMeta i6 = I6.getItemMeta();
        i6.setDisplayName("" + GREEN + BOLD + "Gold Helmet");
        i6.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.goldHelmet, "", RED + "Lvl " + Costs.smithGoldHelmet + " Smithing Required"));
        I6.setItemMeta(i6);
        smith.setItem(11, (ItemStack) (I6));
        
        // Gold Leggings
        ItemStack I7 = new ItemStack(Material.GOLD_LEGGINGS, 1);
        ItemMeta i7 = I7.getItemMeta();
        i7.setDisplayName("" + GREEN + BOLD + "Gold Legplates");
        i7.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.goldLeggings, "", RED + "Lvl " + Costs.smithGoldLeggings + " Smithing Required"));
        I7.setItemMeta(i7);
        smith.setItem(12, (ItemStack) (I7));
        
        // Gold Chestplate
        ItemStack I8 = new ItemStack(Material.GOLD_CHESTPLATE, 1);
        ItemMeta i8 = I8.getItemMeta();
        i8.setDisplayName("" + GREEN + BOLD + "Gold Chestplate");
        i8.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.goldChestplate, "", RED + "Lvl " + Costs.smithGoldChestplate + " Smithing Required"));
        I8.setItemMeta(i8);
        smith.setItem(13, (ItemStack) (I8));
        
        p.openInventory(smith);
	}
	
	/** Mithril smithing menu layout **/
	public static void openMithrilSmith(Player p){
		smith = Bukkit.createInventory(null, 27, DARK_GRAY + "Mithril Items");
		
		// Back Arrow
    	ItemStack B = new ItemStack(Material.ARROW, 1);
        ItemMeta b = B.getItemMeta();
        b.setDisplayName("" + DARK_RED + BOLD + "Back");
        B.setItemMeta(b);
        smith.setItem(18, (ItemStack) (B));
           
        // Mithril Axe
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta i = I.getItemMeta();
        i.setDisplayName("" + GREEN + BOLD + "Mithril Axe");
        i.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.mithrilAxe, "", RED + "Lvl " + Costs.smithMithrilAxe + " Smithing Required"));
        I.setItemMeta(i);
        smith.setItem(2, (ItemStack) (I));
        
        // Mithril Sword
        ItemStack I2 = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta i2 = I2.getItemMeta();
        i2.setDisplayName("" + GREEN + BOLD + "Mithril Sword");
        i2.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.mithrilSword, "", RED + "Lvl " + Costs.smithMithrilSword + " Smithing Required"));
        I2.setItemMeta(i2);
        smith.setItem(3, (ItemStack) (I2));
        
        // Mithril Mace
        ItemStack I3 = new ItemStack(Material.DIAMOND_SPADE, 1);
        ItemMeta i3 = I3.getItemMeta();
        i3.setDisplayName("" + GREEN + BOLD + "Mithril Mace");
        i3.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.mithrilMace, "", RED + "Lvl " + Costs.smithMithrilMace + " Smithing Required"));
        I3.setItemMeta(i3);
        smith.setItem(4, (ItemStack) (I3));
        
        // Mithril Shield
        ItemStack I4 = new ItemStack(Material.SHIELD, 1);
        ItemMeta i4 = I4.getItemMeta();
        i4.setDisplayName("" + GREEN + BOLD + "Mithril Shield");
        i4.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.mithrilShield, "", RED + "Lvl " + Costs.smithMithrilShield + " Smithing Required"));
        I4.setItemMeta(i4);
        smith.setItem(5, (ItemStack) (I4));
        
        // Mithril Boots
        ItemStack I5 = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta i5 = I5.getItemMeta();
        i5.setDisplayName("" + GREEN + BOLD + "Mithril Boots");
        i5.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.mithrilBoots, "", RED + "Lvl " + Costs.smithMithrilBoots + " Smithing Required"));
        I5.setItemMeta(i5);
        smith.setItem(6, (ItemStack) (I5));
        
        // Mithril Helmet
        ItemStack I6 = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta i6 = I6.getItemMeta();
        i6.setDisplayName("" + GREEN + BOLD + "Mithril Helmet");
        i6.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.mithrilHelmet, "", RED + "Lvl " + Costs.smithMithrilHelmet + " Smithing Required"));
        I6.setItemMeta(i6);
        smith.setItem(11, (ItemStack) (I6));
        
        // Mithril Leggings
        ItemStack I7 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta i7 = I7.getItemMeta();
        i7.setDisplayName("" + GREEN + BOLD + "Mithril Legplates");
        i7.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.mithrilLeggings, "", RED + "Lvl " + Costs.smithMithrilLeggings + " Smithing Required"));
        I7.setItemMeta(i7);
        smith.setItem(12, (ItemStack) (I7));
        
        // Mithril Chestplate
        ItemStack I8 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta i8 = I8.getItemMeta();
        i8.setDisplayName("" + GREEN + BOLD + "Mithril Chestplate");
        i8.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.mithrilChestplate, "", RED + "Lvl " + Costs.smithMithrilChestplate + " Smithing Required"));
        I8.setItemMeta(i8);
        smith.setItem(13, (ItemStack) (I8));
        
        p.openInventory(smith);
	}
	
	/** Adamantite smith menu layout **/
	public static void openAdamantiteSmith(Player p){
		smith = Bukkit.createInventory(null, 27, DARK_GRAY + "Adamantite Items");
		
		// Back Arrow
    	ItemStack B = new ItemStack(Material.ARROW, 1);
        ItemMeta b = B.getItemMeta();
        b.setDisplayName("" + DARK_RED + BOLD + "Back");
        B.setItemMeta(b);
        smith.setItem(18, (ItemStack) (B));        
        
        // Adamantite Axe
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta i = I.getItemMeta();
        i.setDisplayName("" + GREEN + BOLD + "Adamantite Axe");
        i.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.adamantiteAxe, "", RED + "Lvl " + Costs.smithAdamantiteAxe + " Smithing Required"));
        I.setItemMeta(i);
        smith.setItem(2, (ItemStack) (I));
        
        // Adamantite Sword
        ItemStack I2 = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta i2 = I2.getItemMeta();
        i2.setDisplayName("" + GREEN + BOLD + "Adamantite Sword");
        i2.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.adamantiteSword, "", RED + "Lvl " + Costs.smithAdamantiteSword + " Smithing Required"));
        I2.setItemMeta(i2);
        smith.setItem(3, (ItemStack) (I2));
        
        // Adamantite Mace
        ItemStack I3 = new ItemStack(Material.DIAMOND_SPADE, 1);
        ItemMeta i3 = I3.getItemMeta();
        i3.setDisplayName("" + GREEN + BOLD + "Adamantite Mace");
        i3.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.adamantiteMace, "", RED + "Lvl " + Costs.smithAdamantiteMace + " Smithing Required"));
        I3.setItemMeta(i3);
        smith.setItem(4, (ItemStack) (I3));
        
        // Adamantite Shield
        ItemStack I4 = new ItemStack(Material.SHIELD, 1);
        ItemMeta i4 = I4.getItemMeta();
        i4.setDisplayName("" + GREEN + BOLD + "Adamantite Shield");
        i4.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.adamantiteShield, "", RED + "Lvl " + Costs.smithAdamantiteShield + " Smithing Required"));
        I4.setItemMeta(i4);
        smith.setItem(5, (ItemStack) (I4));
        
        // Adamantite Boots
        ItemStack I5 = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta i5 = I5.getItemMeta();
        i5.setDisplayName("" + GREEN + BOLD + "Adamantite Boots");
        i5.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.adamantiteBoots, "", RED + "Lvl " + Costs.smithAdamantiteBoots + " Smithing Required"));
        I5.setItemMeta(i5);
        smith.setItem(6, (ItemStack) (I5));
        
        // Adamantite Helmet
        ItemStack I6 = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta i6 = I6.getItemMeta();
        i6.setDisplayName("" + GREEN + BOLD + "Adamantite Helmet");
        i6.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.adamantiteHelmet, "", RED + "Lvl " + Costs.smithAdamantiteHelmet + " Smithing Required"));
        I6.setItemMeta(i6);
        smith.setItem(11, (ItemStack) (I6));
        
        // Adamantite Leggings
        ItemStack I7 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta i7 = I7.getItemMeta();
        i7.setDisplayName("" + GREEN + BOLD + "Adamantite Legplates");
        i7.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.adamantiteLeggings, "", RED + "Lvl " + Costs.smithAdamantiteLeggings + " Smithing Required"));
        I7.setItemMeta(i7);
        smith.setItem(12, (ItemStack) (I7));
        
        // Adamantite Chestplate
        ItemStack I8 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta i8 = I8.getItemMeta();
        i8.setDisplayName("" + GREEN + BOLD + "Adamantite Chestplate");
        i8.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.adamantiteChestplate, "", RED + "Lvl " + Costs.smithAdamantiteChestplate + " Smithing Required"));
        I8.setItemMeta(i8);
        smith.setItem(13, (ItemStack) (I8));
        
        p.openInventory(smith);
	}
	
	/** Crystal smithing menu layout **/
	public static void openCrystalSmith(Player p){
		smith = Bukkit.createInventory(null, 27, DARK_GRAY + "Crystal Items");
		
		// Back Arrow
    	ItemStack B = new ItemStack(Material.ARROW, 1);
        ItemMeta b = B.getItemMeta();
        b.setDisplayName("" + DARK_RED + BOLD + "Back");
        B.setItemMeta(b);
        smith.setItem(18, (ItemStack) (B));        
        
        // Crystal Axe
        ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta i = I.getItemMeta();
        i.setDisplayName("" + GREEN + BOLD + "Crystal Axe");
        i.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.crystalAxe, "", RED + "Lvl " + Costs.smithCrystalAxe + " Smithing Required"));
        I.setItemMeta(i);
        smith.setItem(2, (ItemStack) (I));
        
        // Crystal Sword
        ItemStack I2 = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta i2 = I2.getItemMeta();
        i2.setDisplayName("" + GREEN + BOLD + "Crystal Sword");
        i2.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.crystalSword, "", RED + "Lvl " + Costs.smithCrystalSword + " Smithing Required"));
        I2.setItemMeta(i2);
        smith.setItem(3, (ItemStack) (I2));
        
        // Crystal Mace
        ItemStack I3 = new ItemStack(Material.DIAMOND_SPADE, 1);
        ItemMeta i3 = I3.getItemMeta();
        i3.setDisplayName("" + GREEN + BOLD + "Crystal Mace");
        i3.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.crystalMace, "", RED + "Lvl " + Costs.smithCrystalMace + " Smithing Required"));
        I3.setItemMeta(i3);
        smith.setItem(4, (ItemStack) (I3));
        
        // Crystal Shield
        ItemStack I4 = new ItemStack(Material.SHIELD, 1);
        ItemMeta i4 = I4.getItemMeta();
        i4.setDisplayName("" + GREEN + BOLD + "Crystal Shield");
        i4.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.crystalShield, "", RED + "Lvl " + Costs.smithCrystalShield + " Smithing Required"));
        I4.setItemMeta(i4);
        smith.setItem(5, (ItemStack) (I4));
        
        // Crystal Boots
        ItemStack I5 = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta i5 = I5.getItemMeta();
        i5.setDisplayName("" + GREEN + BOLD + "Crystal Boots");
        i5.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.crystalBoots, "", RED + "Lvl " + Costs.smithCrystalBoots + " Smithing Required"));
        I5.setItemMeta(i5);
        smith.setItem(6, (ItemStack) (I5));
        
        // Crystal Helmet
        ItemStack I6 = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta i6 = I6.getItemMeta();
        i6.setDisplayName("" + GREEN + BOLD + "Crystal Helmet");
        i6.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.crystalHelmet, "", RED + "Lvl " + Costs.smithCrystalHelmet + " Smithing Required"));
        I6.setItemMeta(i6);
        smith.setItem(11, (ItemStack) (I6));
        
        // Crystal Leggings
        ItemStack I7 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta i7 = I7.getItemMeta();
        i7.setDisplayName("" + GREEN + BOLD + "Crystal Legplates");
        i7.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.crystalLeggings, "", RED + "Lvl " + Costs.smithCrystalLeggings + " Smithing Required"));
        I7.setItemMeta(i7);
        smith.setItem(12, (ItemStack) (I7));
        
        // Crystal Chestplate
        ItemStack I8 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta i8 = I8.getItemMeta();
        i8.setDisplayName("" + GREEN + BOLD + "Crystal Chestplate");
        i8.setLore(Arrays.asList(GOLD + "Bars Required: " + Costs.crystalLeggings, "", RED + "Lvl " + Costs.smithCrystalChestplate + " Smithing Required"));
        I8.setItemMeta(i8);
        smith.setItem(13, (ItemStack) (I8));
        
        p.openInventory(smith);
	}
}
