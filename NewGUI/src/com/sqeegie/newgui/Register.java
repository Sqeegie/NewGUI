package com.sqeegie.newgui;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Register {
	
	/** Crafting recipes **/
	public static void recipes() {
		
		// Mithril Sword
		ItemStack MithrilSword = new ItemStack(Material.WOOD_HOE);
	    ItemMeta mithrilsword = MithrilSword.getItemMeta();
	    mithrilsword.setLore(Arrays.asList(ChatColor.AQUA + "Some call it unbreakable!"));
	    mithrilsword.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + "Mithril Sword");
	    mithrilsword.addEnchant(Enchantment.DAMAGE_ALL, 8, true);

        MithrilSword.setItemMeta(mithrilsword);
 
		ShapedRecipe MithrilSwordRec = new ShapedRecipe(MithrilSword).shape(" % "," % "," B ").setIngredient('%', Material.INK_SACK, 6).setIngredient('B', Material.STICK);
	    
	    Bukkit.getServer().addRecipe(MithrilSwordRec);
	    
	    
    	// Mithril Chestplate
 		ItemStack MithrilChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1, (byte) 4000);
 	    LeatherArmorMeta mithrilchest = (LeatherArmorMeta) MithrilChest.getItemMeta();
 	    mithrilchest.setLore(Arrays.asList(ChatColor.BLUE + "Blocks 4% of all attacks!"));
 	    mithrilchest.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + "Mithril Platemail");
 	    mithrilchest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    mithrilchest.addEnchant(Enchantment.DURABILITY, 10, true);
 	    mithrilchest.setColor(Color.AQUA);
 	    MithrilChest.setItemMeta(mithrilchest);
 	    
 		ShapedRecipe MithrilChestRec = new ShapedRecipe(MithrilChest).shape("% %","%%%","%%%").setIngredient('%', Material.INK_SACK, 6);
 	    
 	    Bukkit.getServer().addRecipe(MithrilChestRec);
 	    
 	    // Mithril Leggings
 		ItemStack MithrilLeg = new ItemStack(Material.LEATHER_LEGGINGS, 1, (byte) 4000);
 	    LeatherArmorMeta mithrilleg = (LeatherArmorMeta) MithrilLeg.getItemMeta();
 	    mithrilleg.setLore(Arrays.asList(ChatColor.BLUE + "Blocks 3% of all attacks!"));
 	    mithrilleg.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + "Mithril Leggings");
 	    mithrilleg.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    mithrilleg.addEnchant(Enchantment.DURABILITY, 10, true);
 	    mithrilleg.setColor(Color.AQUA);
 	    MithrilLeg.setItemMeta(mithrilleg);

 		ShapedRecipe MithrilLegRec = new ShapedRecipe(MithrilLeg).shape("%%%","% %","% %").setIngredient('%', Material.INK_SACK, 6);
 	    
 	    Bukkit.getServer().addRecipe(MithrilLegRec);
 	    
	
 	    // Mithril Boots
 		ItemStack MithrilBoots = new ItemStack(Material.LEATHER_BOOTS, 1, (byte) 4000);
 	    LeatherArmorMeta mithrilboots = (LeatherArmorMeta) MithrilBoots.getItemMeta();
 	    mithrilboots.setLore(Arrays.asList(ChatColor.BLUE + "Blocks 1% of all attacks!"));
 	    mithrilboots.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + "Mithril Boots");
 	    mithrilboots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    mithrilboots.addEnchant(Enchantment.DURABILITY, 10, true);
 	    mithrilboots.setColor(Color.AQUA);
 	    MithrilBoots.setItemMeta(mithrilboots);

 		ShapedRecipe MithrilBootsRec = new ShapedRecipe(MithrilBoots).shape("   ","% %","% %").setIngredient('%', Material.INK_SACK, 6);
 	    
 	    Bukkit.getServer().addRecipe(MithrilBootsRec);
 	    
 	    
 	    // Mithril Helm
 		ItemStack MithrilHelm = new ItemStack(Material.LEATHER_HELMET, 1, (byte) 4000);
 	    LeatherArmorMeta mithrilhelm = (LeatherArmorMeta) MithrilHelm.getItemMeta();
 	    mithrilhelm.setLore(Arrays.asList(ChatColor.BLUE + "Blocks 2% of all attacks!"));
 	    mithrilhelm.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + "Mithril GreatHelm");
 	    mithrilhelm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    mithrilhelm.addEnchant(Enchantment.DURABILITY, 10, true);
 	    mithrilhelm.setColor(Color.AQUA);
 	    MithrilHelm.setItemMeta(mithrilhelm);

 		ShapedRecipe MithrilHelmRec = new ShapedRecipe(MithrilHelm).shape("%%%","% %","   ").setIngredient('%', Material.INK_SACK, 6);

 	    Bukkit.getServer().addRecipe(MithrilHelmRec);
 	    
 	    
 	    // Mithril Pickaxe
 		ItemStack MithrilPick = new ItemStack(Material.STONE_HOE, 1, (byte) 4000);
 	    ItemMeta mithrilpick = MithrilPick.getItemMeta();
 	    mithrilpick.setLore(Arrays.asList(ChatColor.AQUA + "Some call it unbreakable!"));
 	    mithrilpick.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + "Mithril Pickaxe");
 	    mithrilpick.addEnchant(Enchantment.DIG_SPEED, 5, true);
 	    MithrilPick.setItemMeta(mithrilpick);

 		ShapedRecipe MithrilPickRec = new ShapedRecipe(MithrilPick).shape("%%%"," B "," B ").setIngredient('%', Material.INK_SACK, 6).setIngredient('B', Material.STICK);

 	    Bukkit.getServer().addRecipe(MithrilPickRec);
 	    
 	    
 	    // Adamantite Sword
		ItemStack AdSword = new ItemStack(Material.IRON_HOE);
	    ItemMeta adsword = AdSword.getItemMeta();
	    adsword.setLore(Arrays.asList(ChatColor.DARK_RED + "A worthy blade"));
	    adsword.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Adamantite Sword");
	    adsword.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
	    AdSword.setItemMeta(adsword);

		ShapedRecipe AdSwordRec = new ShapedRecipe(AdSword).shape(" % "," % "," B ").setIngredient('%', Material.REDSTONE).setIngredient('B', Material.STICK);

	    Bukkit.getServer().addRecipe(AdSwordRec);
	    
	    
    	// Adamantite Chestplate
 		ItemStack AdChest = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
 	    ItemMeta adchest =  AdChest.getItemMeta();
 	    adchest.setLore(Arrays.asList(ChatColor.DARK_RED + "When they see the red... they run..."));
 	    adchest.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Adamantite Platemail");
 	    adchest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    adchest.addEnchant(Enchantment.DURABILITY, 10, true);
 	    AdChest.setItemMeta(adchest);
 	    
 		ShapedRecipe AdChestRec = new ShapedRecipe(AdChest).shape("% %","%%%","%%%").setIngredient('%', Material.REDSTONE);

 	    Bukkit.getServer().addRecipe(AdChestRec);
 	    
 	    
 	    // Adamantite Leggings
 	    ItemStack AdLeg = new ItemStack(Material.CHAINMAIL_LEGGINGS);
 	    ItemMeta adleg =  AdLeg.getItemMeta();
 	    adleg.setLore(Arrays.asList(ChatColor.DARK_RED + "When they see the red... they run..."));
 	    adleg.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Adamantite Leggings");
 	    adleg.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    adleg.addEnchant(Enchantment.DURABILITY, 10, true);
 	    AdLeg.setItemMeta(adleg);

 		ShapedRecipe AdLegRec = new ShapedRecipe(AdLeg).shape("%%%","% %","% %").setIngredient('%', Material.REDSTONE);
 
 	    Bukkit.getServer().addRecipe(AdLegRec);
 	    

 	    // Adamantite Boots
 	    ItemStack AdBoots = new ItemStack(Material.CHAINMAIL_BOOTS);
 	    ItemMeta adboots =  AdBoots.getItemMeta();
 	    adboots.setLore(Arrays.asList(ChatColor.DARK_RED + "When they see the red... they run..."));
 	    adboots.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Adamantite Boots");
 	    adboots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    adboots.addEnchant(Enchantment.DURABILITY, 10, true);
 	    AdBoots.setItemMeta(adboots);

 		ShapedRecipe AdBootsRec = new ShapedRecipe(AdBoots).shape("   ","% %","% %").setIngredient('%', Material.REDSTONE);

 	    Bukkit.getServer().addRecipe(AdBootsRec);
 	    
 	    
 	    // Adamantite Helm
 	    ItemStack AdHelm = new ItemStack(Material.CHAINMAIL_HELMET);
 	    ItemMeta adhelm =  AdHelm.getItemMeta();
 	    adhelm.setLore(Arrays.asList(ChatColor.DARK_RED + "When they see the red... they run..."));
 	    adhelm.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Adamantite Greathelm");
 	    adhelm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    adhelm.addEnchant(Enchantment.DURABILITY, 10, true);
 	    AdHelm.setItemMeta(adhelm);

 		ShapedRecipe AdHelmRec = new ShapedRecipe(AdHelm).shape("%%%","% %","   ").setIngredient('%', Material.REDSTONE);
 	    
 	    Bukkit.getServer().addRecipe(AdHelmRec);
 	    
 	    
 	    // Adamantite Pickaxe
 		ItemStack AdPick = new ItemStack(Material.GOLD_HOE, 1, (byte) 4000);
 	    ItemMeta adpick = AdPick.getItemMeta();
 	    adpick.setLore(Arrays.asList(ChatColor.DARK_RED + "When they see the red... they run..."));
 	    adpick.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Adamantite Pickaxe");
 	    adpick.addEnchant(Enchantment.DIG_SPEED, 8, true);
 	    AdPick.setItemMeta(adpick);

 		ShapedRecipe AdPickRec = new ShapedRecipe(AdPick).shape("%%%"," B "," B ").setIngredient('%', Material.REDSTONE).setIngredient('B', Material.STICK);
 	    
 	    Bukkit.getServer().addRecipe(AdPickRec);
 	    
 	    
 	    // Gold Chestplate
 		ItemStack GoldChest = new ItemStack(Material.GOLD_CHESTPLATE);
 	    ItemMeta gchest =  GoldChest.getItemMeta();
 	    gchest.setLore(Arrays.asList(ChatColor.GOLD + "Fit for a king!"));
 	    gchest.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Chestplate");
 	    gchest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
 	    gchest.addEnchant(Enchantment.DURABILITY, 3, true);
 	    GoldChest.setItemMeta(gchest);
 	    
 		ShapedRecipe GoldChestRec = new ShapedRecipe(GoldChest).shape("% %","%%%","%%%").setIngredient('%', Material.GOLD_INGOT);
 	    
 	    Bukkit.getServer().addRecipe(GoldChestRec);
 	    
 	    
 	    // Gold leggings
 		ItemStack GoldLegs = new ItemStack(Material.GOLD_LEGGINGS);
 	    ItemMeta glegs =  GoldLegs.getItemMeta();
 	    glegs.setLore(Arrays.asList(ChatColor.GOLD + "Fit for a king!"));
 	    glegs.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Leggings");
 	    glegs.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
 	    glegs.addEnchant(Enchantment.DURABILITY, 3, true);
 	    GoldLegs.setItemMeta(glegs);
 	    
 		ShapedRecipe GoldLegsRec = new ShapedRecipe(GoldLegs).shape("%%%","% %","% %").setIngredient('%', Material.GOLD_INGOT);

 	    Bukkit.getServer().addRecipe(GoldLegsRec);
 	    
 	    
 	    // Gold Boots
 		ItemStack GoldBoots = new ItemStack(Material.GOLD_BOOTS);
 	    ItemMeta gboots =  GoldBoots.getItemMeta();
 	    gboots.setLore(Arrays.asList(ChatColor.GOLD + "Fit for a king!"));
 	    gboots.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Boots");
 	    gboots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
 	    gboots.addEnchant(Enchantment.DURABILITY, 3, true);
 	    GoldBoots.setItemMeta(gboots);
 	    
 		ShapedRecipe GoldBootsRec = new ShapedRecipe(GoldBoots).shape("   ","% %","% %").setIngredient('%', Material.GOLD_INGOT);
 	    
 	    Bukkit.getServer().addRecipe(GoldBootsRec);
 	    
 	    
 	    // Gold Helm
 		ItemStack GoldHelm = new ItemStack(Material.GOLD_HELMET);
 	    ItemMeta ghelm =  GoldHelm.getItemMeta();
 	    ghelm.setLore(Arrays.asList(ChatColor.GOLD + "Fit for a king!"));
 	    ghelm.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Helmet");
 	    ghelm.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
 	    ghelm.addEnchant(Enchantment.DURABILITY, 3, true);
 	    GoldHelm.setItemMeta(ghelm);

 		ShapedRecipe GoldHelmRec = new ShapedRecipe(GoldHelm).shape("%%%","% %","   ").setIngredient('%', Material.GOLD_INGOT);
 	    
 	    Bukkit.getServer().addRecipe(GoldHelmRec);
 	    
 	    
 	    // Gold Sword
 		ItemStack GoldS = new ItemStack(Material.GOLD_SWORD);
 	    ItemMeta gs =  GoldS.getItemMeta();
 	    gs.setLore(Arrays.asList(ChatColor.GOLD + "Fit for a king!"));
 	    gs.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Blade");
 	    gs.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
 	    gs.addEnchant(Enchantment.DURABILITY, 2, true);
 	    GoldS.setItemMeta(gs);
 	    
 	    ShapedRecipe GoldSRec = new ShapedRecipe(GoldS).shape(" % "," % "," B ").setIngredient('%', Material.GOLD_INGOT).setIngredient('B', Material.STICK);

 	    Bukkit.getServer().addRecipe(GoldSRec);
 	    
 	    
 	    // Gold Pickaxe
 		ItemStack GoldP = new ItemStack(Material.GOLD_PICKAXE);
 	    ItemMeta gp =  GoldP.getItemMeta();
 	    gp.setLore(Arrays.asList(ChatColor.GOLD + "Fit for a king!"));
 	    gp.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Pickaxe");
 	    gp.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
 	    gp.addEnchant(Enchantment.DURABILITY, 3, true);
 	    GoldP.setItemMeta(gp);

 	    ShapedRecipe GoldPRec = new ShapedRecipe(GoldP).shape("%%%"," B "," B ").setIngredient('%', Material.GOLD_INGOT).setIngredient('B', Material.STICK);

 	    Bukkit.getServer().addRecipe(GoldPRec);
 	    
 	    
 	    // Terra Blade
 		ItemStack MBlade = new ItemStack(Material.DIAMOND_HOE, 1, (byte) 4000);
 	    ItemMeta mblade = MBlade.getItemMeta();
 	    mblade.setLore(Arrays.asList(ChatColor.GOLD + "LEGENDARYYYYYYYYYY"));
 	    mblade.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Masterblade of Legends");
 	    mblade.addEnchant(Enchantment.DAMAGE_ALL, 20, true);
 	    MBlade.setItemMeta(mblade);

		ShapedRecipe MBladeRec = new ShapedRecipe(MBlade).shape("B*%","#&@","B*%").setIngredient('%', Material.REDSTONE).setIngredient('B', Material.DIAMOND).setIngredient('#', Material.DIAMOND_SWORD).setIngredient('*', Material.INK_SACK, 6).setIngredient('B', Material.DIAMOND).setIngredient('&', Material.WOOD_HOE).setIngredient('@', Material.IRON_HOE);
 	    
 	    Bukkit.getServer().addRecipe(MBladeRec);
 	    
 	    
 	    // LifeForce Chestplate
 		ItemStack MithrilChest1 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
 	    LeatherArmorMeta mithrilchest1 = (LeatherArmorMeta) MithrilChest1.getItemMeta();
 	    mithrilchest1.setLore(Arrays.asList(ChatColor.GREEN + "Blocks 90% of hits from monsters", ChatColor.GREEN + "and 75% of hits from players!"));
 	    mithrilchest1.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Lifeforce Armor");
 	    mithrilchest1.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
 	    mithrilchest1.addEnchant(Enchantment.DURABILITY, 10, true);
 	    mithrilchest1.setColor(Color.LIME);
 	    MithrilChest1.setItemMeta(mithrilchest1);

 		ShapedRecipe MithrilChestRec1 = new ShapedRecipe(MithrilChest1).shape("% %","%%%","%%%").setIngredient('%', Material.INK_SACK, 2);
 	    
 	    Bukkit.getServer().addRecipe(MithrilChestRec1);
 	    
 	    
 	    // Wood
 		ItemStack Planks = new ItemStack(Material.WOOD, 1);
 	    ItemMeta planks = Planks.getItemMeta();
 	    planks.setLore(Arrays.asList(ChatColor.GRAY + "Common."));
 	    planks.setDisplayName("" + ChatColor.GRAY + ChatColor.BOLD + "Wood Planks");
 	    Planks.setItemMeta(planks);
 	    
		ShapedRecipe PlanksRec = new ShapedRecipe(Planks).shape("%%%","%%%","%%%").setIngredient('%', Material.STICK);
 	    
 	    Bukkit.getServer().addRecipe(PlanksRec);
 	    
 	  
 	    // SHIELDS
 	   ItemStack WShield = new ItemStack(Material.SHIELD, 1);
 	   ItemMeta wshield = WShield.getItemMeta();
 	   wshield.setLore(Arrays.asList(ChatColor.GRAY + "Blocks 60% of attacks while held"));
 	   wshield.setDisplayName("" + ChatColor.GRAY + ChatColor.BOLD + "Wooden Shield");
       wshield.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
 	   wshield.addEnchant(Enchantment.DURABILITY, 1, true);
 	   WShield.setItemMeta(wshield);
 	
 	   ShapedRecipe WShieldRec = new ShapedRecipe(WShield).shape(" % ","%%%"," % ").setIngredient('%', Material.WOOD);
 	   
 	   ItemStack SShield = new ItemStack(Material.SHIELD, 1);
 	   ItemMeta sshield = SShield.getItemMeta();
 	   sshield.setLore(Arrays.asList(ChatColor.GRAY + "Blocks 70% of attacks while held"));
 	   sshield.setDisplayName("" + ChatColor.GRAY + ChatColor.BOLD + "Stone Shield");
       sshield.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
 	   sshield.addEnchant(Enchantment.DURABILITY, 2, true);
 	   SShield.setItemMeta(sshield);
 	
 	   ShapedRecipe SShieldRec = new ShapedRecipe(SShield).shape(" % ","%%%"," % ").setIngredient('%', Material.COBBLESTONE);
  
 	   ItemStack IShield = new ItemStack(Material.SHIELD, 1);
 	   ItemMeta ishield = IShield.getItemMeta();
 	   ishield.setLore(Arrays.asList(ChatColor.GRAY + "Blocks 80% of attacks while held"));
 	   ishield.setDisplayName("" + ChatColor.GRAY + ChatColor.BOLD + "Iron Shield");
       ishield.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
 	   ishield.addEnchant(Enchantment.DURABILITY, 3, true);
 	   IShield.setItemMeta(ishield);
 	   
 	   ShapedRecipe IShieldRec = new ShapedRecipe(IShield).shape(" % ","%%%"," % ").setIngredient('%', Material.IRON_INGOT);
 	   
 	   ItemStack GShield = new ItemStack(Material.SHIELD, 1);
 	   ItemMeta gshield = GShield.getItemMeta();
 	   gshield.setLore(Arrays.asList(ChatColor.GOLD + "Blocks 90% of attacks while held"));
 	   gshield.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Shield");
       gshield.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
 	   gshield.addEnchant(Enchantment.DURABILITY, 4, true);
 	   GShield.setItemMeta(gshield);
 	
 	   ShapedRecipe GShieldRec = new ShapedRecipe(GShield).shape(" % ","%%%"," % ").setIngredient('%', Material.GOLD_INGOT);
 	   
 	  //Bukkit.getServer().addRecipe(WShieldRec);
 	  //Bukkit.getServer().addRecipe(SShieldRec);
      //Bukkit.getServer().addRecipe(IShieldRec);
      //Bukkit.getServer().addRecipe(GShieldRec);
	}
}
