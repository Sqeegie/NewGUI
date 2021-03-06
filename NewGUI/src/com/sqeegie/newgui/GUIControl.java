package com.sqeegie.newgui;

import static org.bukkit.ChatColor.*;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

@SuppressWarnings("unused")
public class GUIControl implements Listener {
		
	@EventHandler 
    public void InventoryClick(InventoryClickEvent e) {
		
        if(e.getCurrentItem() == null) {
            return;
        }
        
        Player p = (Player) e.getWhoClicked();
        Inventory inv = p.getInventory();
        ItemStack clicked = e.getCurrentItem();
        ItemMeta clickedData = clicked.getItemMeta();
        
        /** Controls Smelting Menu **/
        
        if(e.getInventory().getTitle().contains("Smelting Menu")) {
        
            e.setCancelled(true);
            
            // Smelt Bronze
            if(e.getCurrentItem().getType() == Material.CLAY_BRICK) {  
            	if (clickedData.getLore().contains(DARK_PURPLE + "Click to smelt!")) {
                	ItemStack BronzeIngot = new ItemStack(Material.CLAY_BRICK, 1);
      	            ItemMeta B = BronzeIngot.getItemMeta();
      	            B.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            B.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            BronzeIngot.setItemMeta(B);
      	            
      	            ItemStack CopperOre = new ItemStack(Material.REDSTONE_ORE, 1);
    	            ItemMeta C = CopperOre.getItemMeta();
    	            C.setDisplayName("" + ChatColor.WHITE + "Copper Ore");
    	            CopperOre.setItemMeta(C);

    	            ItemStack TinOre = new ItemStack(Material.CLAY, 1);
      	            ItemMeta T = TinOre.getItemMeta();
      	            T.setDisplayName("" + ChatColor.WHITE + "Tin Ore");
      	            TinOre.setItemMeta(T);
    	            
      	            // Can currently smelt infinitely if there's unnamed ore in their inventory, since the following code only removes the named ore upon smelting.
    	            if(p.getInventory().contains(Material.REDSTONE_ORE, 1) && p.getInventory().contains(Material.CLAY, 1)) {
    	            	p.playSound(p.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 10, 1);
    	                p.getInventory().addItem(BronzeIngot);
    	                p.getInventory().removeItem(CopperOre);
    	                p.getInventory().removeItem(TinOre);
    	            	p.sendMessage(ChatColor.GREEN + "You smelted a Bronze ingot!");
                    
    	            }
    	            else {
    	            	p.sendMessage(ChatColor.RED + "You need more materials to do that!");
    	            }
            	}
            }
            // Smelt Iron
            else if(e.getCurrentItem().getType() == Material.IRON_INGOT) {    
            	if (clickedData.getLore().contains(DARK_PURPLE + "Click to smelt!")) {
    	        	ItemStack IronIngot = new ItemStack(Material.IRON_INGOT, 1);
      	            ItemMeta I = IronIngot.getItemMeta();
      	            I.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            I.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            IronIngot.setItemMeta(I);
      	            
      	            ItemStack IronOre = new ItemStack(Material.IRON_ORE, 1);
    	            ItemMeta IO = IronOre.getItemMeta();
    	            IO.setDisplayName("" + ChatColor.WHITE + "Iron Ore");
    	            IronOre.setItemMeta(IO);
    	            
    	            ItemStack Coal = new ItemStack(Material.COAL, 1);
      	            ItemMeta C = Coal.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Coal");
      	            Coal.setItemMeta(C);
    	            
      	            // Can currently smelt infinitely if there's unnamed ore in their inventory, since the following code only removes the named ore upon smelting.
    	            if(p.getInventory().contains(Material.IRON_ORE, 1) && p.getInventory().contains(Material.COAL, 1)) {  	            
    	            	p.playSound(p.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 10, 1);
    	            	p.getInventory().addItem(IronIngot);
    	                p.getInventory().removeItem(IronOre);
    	                p.getInventory().removeItem(Coal);
    	            	p.sendMessage(ChatColor.GREEN + "You smelted an Iron ingot!");
    	            }
    	            else {
    	            	p.sendMessage(ChatColor.RED + "You need more materials to do that!");
    	            }
            	}
            }
            // Smelt Gold
            else if(e.getCurrentItem().getType() == Material.GOLD_INGOT) {    
            	if (clickedData.getLore().contains(DARK_PURPLE + "Click to smelt!")) {
            		ItemStack GoldIngot = new ItemStack(Material.GOLD_INGOT, 1);
      	            ItemMeta G = GoldIngot.getItemMeta();
      	            G.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            G.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Gold"));
      	            GoldIngot.setItemMeta(G);
      	            
      	            ItemStack GoldOre = new ItemStack(Material.GOLD_ORE, 1);
    	            ItemMeta GO = GoldOre.getItemMeta();
    	            GO.setDisplayName("" + ChatColor.GREEN + "Gold Ore");
    	            GoldOre.setItemMeta(GO);
    	            
    	            ItemStack Coal = new ItemStack(Material.COAL, 2);
      	            ItemMeta C = Coal.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Coal");
      	            Coal.setItemMeta(C);
    	            
      	            // Can currently smelt infinitely if there's unnamed ore in their inventory, since the following code only removes the named ore upon smelting.
    	            if(p.getInventory().contains(Material.GOLD_ORE, 1) && p.getInventory().contains(Material.COAL, 2)) {  	            
    	            	p.playSound(p.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 10, 1);
    	            	p.getInventory().addItem(GoldIngot);
    	                p.getInventory().removeItem(GoldOre);
    	                p.getInventory().removeItem(Coal);
    	            	p.sendMessage(ChatColor.GREEN + "You smelted a Gold ingot!");
    	            }
    	            else {
    	            	p.sendMessage(ChatColor.RED + "You need more materials to do that!");
    	            }
            	}
            
            }
            // Smelt Mithril
            else if(e.getCurrentItem().getType() == Material.GHAST_TEAR) {   
            	if (clickedData.getLore().contains(DARK_PURPLE + "Click to smelt!")) {
    	        	ItemStack MithrilIngot = new ItemStack(Material.GHAST_TEAR);
    	  	        ItemMeta M = MithrilIngot.getItemMeta();
    	  	        M.setDisplayName("" + ChatColor.GREEN + "Mithril Ingot");
    	  	        M.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mithril"));
    	  	        MithrilIngot.setItemMeta(M);
    	  	            
    	  	        ItemStack MithrilOre = new ItemStack(Material.LAPIS_ORE, 1);
    		        ItemMeta MO = MithrilOre.getItemMeta();
    		        MO.setDisplayName("" + ChatColor.GREEN + "Mithril Ore");
    		        MithrilOre.setItemMeta(MO);
    		        
    		        ItemStack Coal = new ItemStack(Material.COAL, 3);
    	  	        ItemMeta C = Coal.getItemMeta();
    	  	        C.setDisplayName("" + ChatColor.WHITE + "Coal");
    	  	        Coal.setItemMeta(C);
    		        
      	            // Can currently smelt infinitely if there's unnamed ore in their inventory, since the following code only removes the named ore upon smelting.
    		        if(p.getInventory().contains(Material.LAPIS_ORE, 1) && p.getInventory().contains(Material.COAL, 3)) {  	            
    		        	p.playSound(p.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 10, 1);
    		        	p.getInventory().addItem(MithrilIngot);
    		            p.getInventory().removeItem(MithrilOre);
    		            p.getInventory().removeItem(Coal);
    		            p.sendMessage(ChatColor.GREEN + "You smelted a Mithril ingot!");
    		        }    
    		        else {
    		        	p.sendMessage(ChatColor.RED + "You need more materials to do that!");
    		        }
            	}
            }
            // Smelt Adamantite
            else if(e.getCurrentItem().getType() == Material.PRISMARINE_SHARD) {    
            	if (clickedData.getLore().contains(DARK_PURPLE + "Click to smelt!")) {
    	        	ItemStack AdamantiteIngot = new ItemStack(Material.PRISMARINE_SHARD);
      	            ItemMeta A = AdamantiteIngot.getItemMeta();
      	            A.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            A.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            AdamantiteIngot.setItemMeta(A);
      	            
      	           ItemStack AdamantiteOre = new ItemStack(Material.PRISMARINE, 1);
    	            ItemMeta AO = AdamantiteOre.getItemMeta();
    	            AO.setDisplayName("" + ChatColor.GREEN + "Adamantite Ore");
    	            AdamantiteOre.setItemMeta(AO);
    	            
    		        ItemStack Coal = new ItemStack(Material.COAL, 4);
    	  	        ItemMeta C = Coal.getItemMeta();
    	  	        C.setDisplayName("" + ChatColor.WHITE + "Coal");
    	  	        Coal.setItemMeta(C);
    	            
      	            // Can currently smelt infinitely if there's unnamed ore in their inventory, since the following code only removes the named ore upon smelting.
    	            if(p.getInventory().contains(Material.PRISMARINE, 1) && p.getInventory().contains(Material.COAL, 4)) {  	            
    	            	p.playSound(p.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 10, 1);
    	            	p.getInventory().addItem(AdamantiteIngot);
    	                p.getInventory().removeItem(AdamantiteOre);
    	                p.getInventory().removeItem(Coal);
    	            	p.sendMessage(ChatColor.GREEN + "You smelted an Adamantite ingot!");
    	            }
    	            else {
    	            	p.sendMessage(ChatColor.RED + "You need more materials to do that!");
    	            }
            	}
            }
            
            // Smelt Crystal
            else if(e.getCurrentItem().getType() == Material.DIAMOND) {    
            	if (clickedData.getLore().contains(DARK_PURPLE + "Click to smelt!")) {
    	        	ItemStack CrystalIngot = new ItemStack(Material.DIAMOND);
      	            ItemMeta C = CrystalIngot.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            CrystalIngot.setItemMeta(C);
      	            
      	           ItemStack CrystalOre = new ItemStack(Material.DIAMOND_ORE, 1);
    	            ItemMeta CO = CrystalOre.getItemMeta();
    	            CO.setDisplayName("" + ChatColor.GREEN + "Crystal Ore");
    	            CrystalOre.setItemMeta(CO);
    	            
    		        ItemStack Coal = new ItemStack(Material.COAL, 4);
    	  	        ItemMeta c = Coal.getItemMeta();
    	  	        c.setDisplayName("" + ChatColor.WHITE + "Coal");
    	  	        Coal.setItemMeta(C);
    	            
      	            // Can currently smelt infinitely if there's unnamed ore in their inventory, since the following code only removes the named ore upon smelting.
    	            if(p.getInventory().contains(Material.DIAMOND_ORE, 1) && p.getInventory().contains(Material.COAL, 4)) {  	            
    	            	p.playSound(p.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 10, 1);
    	            	p.getInventory().addItem(CrystalIngot);
    	                p.getInventory().removeItem(CrystalOre);
    	                p.getInventory().removeItem(Coal);
    	            	p.sendMessage(ChatColor.GREEN + "You refined a piece of Crystal!");
    	            }
    	            else {
    	            	p.sendMessage(ChatColor.RED + "You need more materials to do that!");
    	            }
            	}
            }
		
        }
        
        /** Controls Smithing Menu **/
        
        if(e.getInventory().getTitle().contains("Smithing Menu")) {
        	e.setCancelled(true); 

            if(e.getCurrentItem() == null){
                return;
            }
            else if(e.getCurrentItem().getType() == Material.CLAY_BRICK) {  
            	p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BUTTON_CLICK_ON, 10, 1);
	        	SmithingInfo.openBronzeSmith(p);
            }
            else if(e.getCurrentItem().getType() == Material.IRON_INGOT) {    
            	p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BUTTON_CLICK_ON, 10, 1);
            	SmithingInfo.openIronSmith(p);
            }
            else if(e.getCurrentItem().getType() == Material.GOLD_INGOT) {    
            	p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BUTTON_CLICK_ON, 10, 1);
            	SmithingInfo.openGoldSmith(p);
            }
            else if(e.getCurrentItem().getType() == Material.GHAST_TEAR) {    
            	p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BUTTON_CLICK_ON, 10, 1);
            	SmithingInfo.openMithrilSmith(p);
            }
            else if(e.getCurrentItem().getType() == Material.PRISMARINE_SHARD) {    
            	p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BUTTON_CLICK_ON, 10, 1);
            	SmithingInfo.openAdamantiteSmith(p);
            }
            else if(e.getCurrentItem().getType() == Material.DIAMOND) {    
            	p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BUTTON_CLICK_ON, 10, 1);
            	SmithingInfo.openCrystalSmith(p);
            }
        }
        
        /** Controls Smithing Sub-Items Menu back arrow **/
        
        if(e.getInventory().getTitle().contains("Bronze Items") || e.getInventory().getTitle().contains("Iron Items") || e.getInventory().getTitle().contains("Gold Items") || e.getInventory().getTitle().contains("Mithril Items") || e.getInventory().getTitle().contains("Adamantite Items") || e.getInventory().getTitle().contains("Crystal Items")) {
            e.setCancelled(true); 

            if(e.getCurrentItem() == null) {
                return;
            }
            else if(e.getCurrentItem().getType() == Material.ARROW) {  
            	p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 10, 1);
            	NewGUI.openSmithGUI(p);
            }
        }
        
        /** Controls all Smithing sub-items menu purchases **/
        
        // BRONZE
        if(e.getInventory().getTitle().contains("Bronze Items")) {
            e.setCancelled(true); 

            if(e.getCurrentItem() == null) {
                return;
            }
            // Bronze Axe
            else if(clicked.getType() == Material.WOOD_AXE) {
            	if(clickedData.getDisplayName().contains("Bronze Axe") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.WOOD_AXE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Bronze Axe");
            	    i.setLore(Arrays.asList(GOLD + "Basic tree-chopping tool", "", RED + "Lvl " + Costs.useBronzeAxe + " Woodcutting required"));
            	    I.setItemMeta(i);
            	    
            	    ItemStack Cost = new ItemStack(Material.CLAY_BRICK, 2);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.CLAY_BRICK, 2)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Bronze Sword
            else if(clicked.getType() == Material.WOOD_SWORD) { 
            	if(clickedData.getDisplayName().contains("Bronze Sword") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.WOOD_SWORD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Bronze Sword");
            	    i.setLore(Arrays.asList(GOLD + "Basic slashing machine", "", RED + "Lvl " + Costs.useBronzeSword + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.CLAY_BRICK, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.CLAY_BRICK, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Bronze Mace
            else if(clicked.getType() == Material.WOOD_SPADE) { 
            	if(clickedData.getDisplayName().contains("Bronze Mace") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.WOOD_SPADE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Bronze Mace");
            	    i.setLore(Arrays.asList(GOLD + "Basic bashing tool", "", RED + "Lvl " + Costs.useBronzeMace + " Attack required"));
            	    I.setItemMeta(i);
            		
            		ItemStack Cost = new ItemStack(Material.CLAY_BRICK, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.CLAY_BRICK, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Bronze Shield
            else if (clicked.getType() == Material.SHIELD) {
            	if(clickedData.getDisplayName().contains("Bronze Shield") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.SHIELD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Bronze Shield");
            	    i.setLore(Arrays.asList(GOLD + "Basic blocking utility", "", RED + "Lvl " + Costs.useBronzeShield + " Defense required"));
            	    I.setItemMeta(i);
            	    
            	    ItemStack Cost = new ItemStack(Material.CLAY_BRICK, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.CLAY_BRICK, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Bronze Boots
            else if(clicked.getType() == Material.LEATHER_BOOTS) { 
            	if(clickedData.getDisplayName().contains("Bronze Boots") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.LEATHER_BOOTS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Bronze Boots");
            	    i.setLore(Arrays.asList(GOLD + "Basic footwear", "", RED + "Lvl " + Costs.useBronzeBoots + " Defense Required"));
            	    I.setItemMeta(i);

            	    ItemStack Cost = new ItemStack(Material.CLAY_BRICK, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            Cost.setItemMeta(C);
            	    
      	            // Can currently smith infinitely if there's unnamed ingot in their inventory, since the following code only removes the named ingots upon smithing.
            		if(p.getInventory().contains(Material.CLAY_BRICK, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Bronze Helmet
            else if(clicked.getType() == Material.LEATHER_HELMET) { 
            	if(clickedData.getDisplayName().contains("Bronze Helmet") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.LEATHER_HELMET, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Bronze Helmet");
            	    i.setLore(Arrays.asList(GOLD + "Basic headgear", "", RED + "Lvl " + Costs.useBronzeHelmet + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.CLAY_BRICK, 5);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.CLAY_BRICK, 5)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Bronze Leggings
            else if(clicked.getType() == Material.LEATHER_LEGGINGS) { 
            	if(clickedData.getDisplayName().contains("Bronze Legplates") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.LEATHER_LEGGINGS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Bronze Legplates");
            	    i.setLore(Arrays.asList(GOLD + "Basic chaps", "", RED + "Lvl " + Costs.useBronzeLeggings + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.CLAY_BRICK, 7);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.CLAY_BRICK, 7)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Bronze Chestplate
            else if(clicked.getType() == Material.LEATHER_CHESTPLATE) { 
            	if(clickedData.getDisplayName().contains("Bronze Chestplate") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Bronze Chestplate");
            	    i.setLore(Arrays.asList(GOLD + "Basic heart-protection", "", RED + "Lvl " + Costs.useBronzeChestplate + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.CLAY_BRICK, 8);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Bronze Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of bronze"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.CLAY_BRICK, 8)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
        }
        

        // IRON
        if(e.getInventory().getTitle().contains("Iron Items")) {
            e.setCancelled(true); 

            if(e.getCurrentItem() == null) {
                return;
            }
            // Iron Axe
            else if(clicked.getType() == Material.IRON_AXE) {  
            	if(clickedData.getDisplayName().contains("Iron Axe") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.IRON_AXE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Iron Axe");
            	    i.setLore(Arrays.asList(GOLD + "Modern tree-chopping tool", "", RED + "Lvl " + Costs.useIronAxe + " Woodcutting required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.IRON_INGOT, 2);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.IRON_INGOT, 2)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Iron Sword
            else if(clicked.getType() == Material.IRON_SWORD) { 
            	if(clickedData.getDisplayName().contains("Iron Sword") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.IRON_SWORD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Iron Sword");
            	    i.setLore(Arrays.asList(GOLD + "Modern slashing machine", "", RED + "Lvl " + Costs.useIronSword + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.IRON_INGOT, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.IRON_INGOT, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Iron Mace
            else if(clicked.getType() == Material.IRON_SPADE) { 
            	if(clickedData.getDisplayName().contains("Iron Mace") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.IRON_SPADE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Iron Mace");
            	    i.setLore(Arrays.asList(GOLD + "Modern bashing tool", "", RED + "Lvl " + Costs.useIronMace + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.IRON_INGOT, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.IRON_INGOT, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Iron Shield
            else if(clicked.getType() == Material.SHIELD) { 
            	if(clickedData.getDisplayName().contains("Iron Shield") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.SHIELD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Iron Shield");
            	    i.setLore(Arrays.asList(GOLD + "Modern blocking utility", "", RED + "Lvl " + Costs.useIronShield + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.IRON_INGOT, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.IRON_INGOT, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Iron Boots
            else if(clicked.getType() == Material.IRON_BOOTS) { 
            	if(clickedData.getDisplayName().contains("Iron Boots") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.IRON_BOOTS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Iron Boots");
            	    i.setLore(Arrays.asList(GOLD + "Modern footwear", "", RED + "Lvl " + Costs.useIronBoots + " Defense Required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.IRON_INGOT, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.IRON_INGOT, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Iron Helmet
            else if(clicked.getType() == Material.IRON_HELMET) { 
            	if(clickedData.getDisplayName().contains("Iron Helmet") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.IRON_HELMET, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Iron Helmet");
            	    i.setLore(Arrays.asList(GOLD + "Modern headgear", "", RED + "Lvl " + Costs.useIronHelmet + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.IRON_INGOT, 5);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.IRON_INGOT, 5)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Iron Leggings
            else if(clicked.getType() == Material.IRON_LEGGINGS) { 
            	if(clickedData.getDisplayName().contains("Iron Legplates") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.IRON_LEGGINGS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Iron Legplates");
            	    i.setLore(Arrays.asList(GOLD + "Modern chaps", "", RED + "Lvl " + Costs.useIronLeggings + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.IRON_INGOT, 7);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.IRON_INGOT, 7)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Iron Chestplate
            else if(clicked.getType() == Material.IRON_CHESTPLATE) { 
            	if(clickedData.getDisplayName().contains("Iron Chestplate") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.IRON_CHESTPLATE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GRAY + BOLD + "Iron Chestplate");
            	    i.setLore(Arrays.asList(GOLD + "Modern heart-protection", "", RED + "Lvl " + Costs.useIronChestplate + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.IRON_INGOT, 8);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.WHITE + "Iron Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of Iron"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.IRON_INGOT, 8)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else{
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
        }
        

        // ADAMANTITE
        if(e.getInventory().getTitle().contains("Adamantite Items")) {
            e.setCancelled(true); 

            if(e.getCurrentItem() == null) {
                return;
            }
            // Adamantite Axe
            else if(clicked.getType() == Material.DIAMOND_AXE) {  
            	if(clickedData.getDisplayName().contains("Adamantite Axe") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Adamantite Axe");
            	    i.setLore(Arrays.asList(GOLD + "Mighty tree-chopping tool!", "", RED + "Lvl " + Costs.useAdamantiteAxe + " Woodcutting required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.PRISMARINE_SHARD, 2);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.PRISMARINE_SHARD, 2)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Adamantite Sword
            else if(clicked.getType() == Material.DIAMOND_SWORD) {  
            	if(clickedData.getDisplayName().contains("Adamantite Sword") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_SWORD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Adamantite Sword");
            	    i.setLore(Arrays.asList(GOLD + "Mighty slashing machine!", "", RED + "Lvl " + Costs.useAdamantiteSword + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.PRISMARINE_SHARD, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.PRISMARINE_SHARD, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Adamantite Mace
            else if(clicked.getType() == Material.DIAMOND_SPADE) {  
            	if(clickedData.getDisplayName().contains("Adamantite Mace") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_SPADE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Adamantite Mace");
            	    i.setLore(Arrays.asList(GOLD + "Mighty bashing tool!", "", RED + "Lvl " + Costs.useAdamantiteMace + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.PRISMARINE_SHARD, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.PRISMARINE_SHARD, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Adamantite Shield
            else if(clicked.getType() == Material.SHIELD) {  
            	if(clickedData.getDisplayName().contains("Adamantite Shield")  && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.SHIELD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Adamantite Shield");
            	    i.setLore(Arrays.asList(GOLD + "Mighty blocking utility!", "", RED + "Lvl " + Costs.useAdamantiteShield + " defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.PRISMARINE_SHARD, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.PRISMARINE_SHARD, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Adamantite Boots
            else if(clicked.getType() == Material.DIAMOND_BOOTS) {  
            	if(clickedData.getDisplayName().contains("Adamantite Boots") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_BOOTS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Adamantite Boots");
            	    i.setLore(Arrays.asList(GOLD + "Mighty footwear!", "", RED + "Lvl " + Costs.useAdamantiteBoots + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.PRISMARINE_SHARD, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.PRISMARINE_SHARD, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Adamantite Helmet
            else if(clicked.getType() == Material.DIAMOND_HELMET) {  
            	if(clickedData.getDisplayName().contains("Adamantite Helmet") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_HELMET, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Adamantite Helmet");
            	    i.setLore(Arrays.asList(GOLD + "Mighty headgear!", "", RED + "Lvl " + Costs.useAdamantiteHelmet + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.PRISMARINE_SHARD, 5);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.PRISMARINE_SHARD, 5)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Adamantite Leggings
            else if(clicked.getType() == Material.DIAMOND_LEGGINGS) {  
            	if(clickedData.getDisplayName().contains("Adamantite Legplates") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Adamantite Legplates");
            	    i.setLore(Arrays.asList(GOLD + "Mighty chaps!", "", RED + "Lvl " + Costs.useAdamantiteLeggings + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.PRISMARINE_SHARD, 7);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.PRISMARINE_SHARD, 7)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Adamantite Chestplate
            else if(clicked.getType() == Material.DIAMOND_CHESTPLATE) {  
            	if(clickedData.getDisplayName().contains("Adamantite Chestplate") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Adamantite Chestplate");
            	    i.setLore(Arrays.asList(GOLD + "Mighty heart-protection!", "", RED + "Lvl " + Costs.useAdamantiteChestplate + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.PRISMARINE_SHARD, 8);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Adamantite Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Adamantite"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.PRISMARINE_SHARD, 8)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
        }
        
        // MYTHRIL
        if(e.getInventory().getTitle().contains("Mythril Items")) {
            e.setCancelled(true); 

            if(e.getCurrentItem() == null) {
                return;
            }
            // Mythril Axe
            else if(clicked.getType() == Material.DIAMOND_AXE) {
            	if(clickedData.getDisplayName().contains("Mythril Axe") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Mythril Axe");
            	    i.setLore(Arrays.asList(GOLD + "Mighty tree-chopping tool!", "", RED + "Lvl " + Costs.useMithrilAxe + " Woodcutting required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GHAST_TEAR, 2);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Mythril Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mythril"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GHAST_TEAR, 2)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Mythril Sword
            else if(clicked.getType() == Material.DIAMOND_SWORD) {  
            	if(clickedData.getDisplayName().contains("Mythril Sword") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_SWORD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Mythril Sword");
            	    i.setLore(Arrays.asList(GOLD + "Mighty slashing machine!", "", RED + "Lvl " + Costs.useMithrilSword + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GHAST_TEAR, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Mythril Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mythril"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GHAST_TEAR, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Mythril Mace
            else if(clicked.getType() == Material.DIAMOND_SPADE) {  
            	if(clickedData.getDisplayName().contains("Mythril Mace") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_SPADE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Mythril Mace");
            	    i.setLore(Arrays.asList(GOLD + "Mighty bashing tool!", "", RED + "Lvl " + Costs.useMithrilMace + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GHAST_TEAR, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Mythril Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mythril"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GHAST_TEAR, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Mythril Shield
            else if(clicked.getType() == Material.SHIELD) {  
            	if(clickedData.getDisplayName().contains("Mythril Shield") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.SHIELD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Mythril Shield");
            	    i.setLore(Arrays.asList(GOLD + "Mighty blocking utility!", "", RED + "Lvl " + Costs.useMithrilShield + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GHAST_TEAR, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Mythril Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mythril"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GHAST_TEAR, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Mythril Boots
            else if(clicked.getType() == Material.DIAMOND_BOOTS) {  
            	if(clickedData.getDisplayName().contains("Mythril Boots") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_BOOTS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Mythril Boots");
            	    i.setLore(Arrays.asList(GOLD + "Mighty footwear!", "", RED + "Lvl " + Costs.useMithrilBoots + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GHAST_TEAR, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Mythril Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mythril"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GHAST_TEAR, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Mythril Helmet
            else if(clicked.getType() == Material.DIAMOND_HELMET) {  
            	if(clickedData.getDisplayName().contains("Mythril Helmet") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_HELMET, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Mythril Helmet");
            	    i.setLore(Arrays.asList(GOLD + "Mighty headgear!", "", RED + "Lvl " + Costs.useMithrilHelmet + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GHAST_TEAR, 5);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Mythril Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mythril"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GHAST_TEAR, 5)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Mythril Leggings
            else if(clicked.getType() == Material.DIAMOND_LEGGINGS) {  
            	if(clickedData.getDisplayName().contains("Mythril Legplates") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Mythril Legplates");
            	    i.setLore(Arrays.asList(GOLD + "Mighty chaps!", "", RED + "Lvl " + Costs.useMithrilLeggings + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GHAST_TEAR, 7);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Mythril Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mythril"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GHAST_TEAR, 7)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Mythril Chestplate
            else if(clicked.getType() == Material.DIAMOND_CHESTPLATE) {  
            	if(clickedData.getDisplayName().contains("Mythril Chestplate") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Mythril Chestplate");
            	    i.setLore(Arrays.asList(GOLD + "Mighty heart-protection!", "", RED + "Lvl " + Costs.useMithrilChestplate + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GHAST_TEAR, 8);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Mythril Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Mythril"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GHAST_TEAR, 8)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
        }

        
        // GOLD
        if(e.getInventory().getTitle().contains("Gold Items")) {
            e.setCancelled(true); 

            if(e.getCurrentItem() == null) {
                return;
            }
            // Gold Axe
            else if(clicked.getType() == Material.GOLD_AXE) {  
            	if(clickedData.getDisplayName().contains("Gold Axe") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.GOLD_AXE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Gold Axe");
            	    i.setLore(Arrays.asList(GOLD + "Mighty tree-chopping tool!", "", RED + "Lvl " + Costs.useGoldAxe + " Woodcutting required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GOLD_INGOT, 2);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Gold"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GOLD_INGOT, 2)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Gold Sword
            else if(clicked.getType() == Material.GOLD_SWORD) {  
            	if(clickedData.getDisplayName().contains("Gold Sword") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.GOLD_SWORD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Gold Sword");
            	    i.setLore(Arrays.asList(GOLD + "Mighty slashing machine!", "", RED + "Lvl " + Costs.useGoldSword + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GOLD_INGOT, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Gold"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GOLD_INGOT, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Gold Mace
            else if(clicked.getType() == Material.GOLD_SPADE) {  
            	if(clickedData.getDisplayName().contains("Gold Mace") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.GOLD_SPADE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Gold Mace");
            	    i.setLore(Arrays.asList(GOLD + "Mighty bashing tool!", "", RED + "Lvl " + Costs.useGoldMace + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GOLD_INGOT, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Gold"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GOLD_INGOT, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Gold Shield
            else if(clicked.getType() == Material.SHIELD) {  
            	if(clickedData.getDisplayName().contains("Gold Shield") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.SHIELD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Gold Shield");
            	    i.setLore(Arrays.asList(GOLD + "Mighty blocking utility!", "", RED + "Lvl " + Costs.useGoldShield + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GOLD_INGOT, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Gold"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GOLD_INGOT, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Gold Boots
            else if(clicked.getType() == Material.GOLD_BOOTS) {  
            	if(clickedData.getDisplayName().contains("Gold Boots") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.GOLD_BOOTS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Gold Boots");
            	    i.setLore(Arrays.asList(GOLD + "Mighty footwear!", "", RED + "Lvl " + Costs.useGoldBoots + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GOLD_INGOT, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Gold"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GOLD_INGOT, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Gold Helmet
            else if(clicked.getType() == Material.GOLD_HELMET) {  
            	if(clickedData.getDisplayName().contains("Gold Helmet") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.GOLD_HELMET, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Gold Helmet");
            	    i.setLore(Arrays.asList(GOLD + "Mighty headgear!", "", RED + "Lvl " + Costs.useGoldHelmet + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GOLD_INGOT, 5);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Gold"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GOLD_INGOT, 5)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Gold Leggings
            else if(clicked.getType() == Material.GOLD_LEGGINGS) {  
            	if(clickedData.getDisplayName().contains("Gold Legplates") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.GOLD_LEGGINGS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Gold Legplates");
            	    i.setLore(Arrays.asList(GOLD + "Mighty chaps!", "", RED + "Lvl " + Costs.useGoldLeggings + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GOLD_INGOT, 7);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Gold"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GOLD_INGOT, 7)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Gold Chestplate
            else if(clicked.getType() == Material.GOLD_CHESTPLATE) {  
            	if(clickedData.getDisplayName().contains("Gold Chestplate") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.GOLD_CHESTPLATE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Gold Chestplate");
            	    i.setLore(Arrays.asList(GOLD + "Mighty heart-protection!", "", RED + "Lvl " + Costs.useGoldChestplate + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.GOLD_INGOT, 8);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Gold Ingot");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A bar of smelted Gold"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.GOLD_INGOT, 8)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
        }
        

        // CRYSTAL
        if(e.getInventory().getTitle().contains("Crystal Items")) {
            e.setCancelled(true); 

            if(e.getCurrentItem() == null) {
                return;
            }
            // Crystal Axe
            else if(clicked.getType() == Material.DIAMOND_AXE) {  
            	if(clickedData.getDisplayName().contains("Crystal Axe") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_AXE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Crystal Axe");
            	    i.setLore(Arrays.asList(GOLD + "Mighty tree-chopping tool!", "", RED + "Lvl " + Costs.useCrystalAxe + " Woodcutting required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.DIAMOND, 2);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.DIAMOND, 2)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Crystal Sword
            else if(clicked.getType() == Material.DIAMOND_SWORD) {  
            	if(clickedData.getDisplayName().contains("Crystal Sword") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_SWORD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Crystal Sword");
            	    i.setLore(Arrays.asList(GOLD + "Mighty slashing machine!", "", RED + "Lvl " + Costs.useCrystalSword + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.DIAMOND, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.DIAMOND, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Crystal Mace
            else if(clicked.getType() == Material.DIAMOND_SPADE) {  
            	if(clickedData.getDisplayName().contains("Crystal Mace") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_SPADE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Crystal Mace");
            	    i.setLore(Arrays.asList(GOLD + "Mighty bashing tool!", "", RED + "Lvl " + Costs.useCrystalMace + " Attack required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.DIAMOND, 3);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.DIAMOND, 3)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Crystal Shield
            else if(clicked.getType() == Material.SHIELD) {  
            	if(clickedData.getDisplayName().contains("Crystal Shield") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.SHIELD, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Crystal Shield");
            	    i.setLore(Arrays.asList(GOLD + "Mighty blocking utility!", "", RED + "Lvl " + Costs.useCrystalShield + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.DIAMOND, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.DIAMOND, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Crystal Boots
            else if(clicked.getType() == Material.DIAMOND_BOOTS) {  
            	if(clickedData.getDisplayName().contains("Crystal Boots") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_BOOTS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Crystal Boots");
            	    i.setLore(Arrays.asList(GOLD + "Mighty footwear!", "", RED + "Lvl " + Costs.useCrystalBoots + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.DIAMOND, 4);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.DIAMOND, 4)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Crystal Helmet
            else if(clicked.getType() == Material.DIAMOND_HELMET) {  
            	if(clickedData.getDisplayName().contains("Crystal Helmet") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_HELMET, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Crystal Helmet");
            	    i.setLore(Arrays.asList(GOLD + "Mighty headgear!", "", RED + "Lvl " + Costs.useCrystalHelmet + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.DIAMOND, 5);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.DIAMOND, 5)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Crystal Leggings
            else if(clicked.getType() == Material.DIAMOND_LEGGINGS) {  
            	if(clickedData.getDisplayName().contains("Crystal Legplates") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Crystal Legplates");
            	    i.setLore(Arrays.asList(GOLD + "Mighty chaps!", "", RED + "Lvl " + Costs.useCrystalLeggings + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.DIAMOND, 7);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.DIAMOND, 7)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
            // Crystal Chestplate
            else if(clicked.getType() == Material.DIAMOND_CHESTPLATE) {  
            	if(clickedData.getDisplayName().contains("Crystal Chestplate") && clickedData.getLore().contains(GOLD + "Bars Required: ")) {
            		ItemStack I = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
            	    ItemMeta i = I.getItemMeta();
            	    i.setDisplayName("" + GREEN + BOLD + "Crystal Chestplate");
            	    i.setLore(Arrays.asList(GOLD + "Mighty heart-protection!", "", RED + "Lvl " + Costs.useCrystalChestplate + " Defense required"));
            	    I.setItemMeta(i);
            		
            	    ItemStack Cost = new ItemStack(Material.DIAMOND, 8);
      	            ItemMeta C = Cost.getItemMeta();
      	            C.setDisplayName("" + ChatColor.GREEN + "Crystal");
      	            C.setLore(Arrays.asList(ChatColor.GRAY + "A piece of refined Crystal"));
      	            Cost.setItemMeta(C);
            	    
            		if(p.getInventory().contains(Material.DIAMOND, 8)) {
            			p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 1);
            			inv.removeItem(Cost);
            			inv.addItem(I);
            		}
            		else {
            			p.sendMessage(RED + "You need more materials to make that!");
            		}
            	}
            }
        }
	}
	
	/** Handles player interactions with openable blocks **/
	
	@EventHandler
	public void onPlayerEvent(PlayerInteractEvent e){
		final Player player = e.getPlayer();
		
		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {		
			if (player.isSneaking() != true) { // Player isn't sneaking
				
				// Proceed normally
				
				Material b = e.getClickedBlock().getType();
				
				if (b.equals(Material.FURNACE) || b.equals(Material.BURNING_FURNACE)) {
			    	e.setCancelled(true);
			    	NewGUI.openSmeltGUI(player);
			    }
			    if (b.equals(Material.WORKBENCH)) {
				    e.setCancelled(true);
			    }
			    if (b.equals(Material.ANVIL)) {
			    	e.setCancelled(true);
			    	NewGUI.openSmithGUI(player);
			    }
			    if (b.equals(Material.CHEST)) {
			    	e.setCancelled(true);
				}
				if (b.equals(Material.TRAPPED_CHEST)) {
					e.setCancelled(true);
				}
			}
			else if (player.isSneaking()) { // Player is sneaking
				
				if (e.isBlockInHand() != true) { // Doesn't have a block in-hand
					if (player.isOp()) { // Player is op
						// Open default menu
					}
					else { // Player isn't op

						// Proceed normally
						
						Material b = e.getClickedBlock().getType();
						    
						if (b.equals(Material.FURNACE) || b.equals(Material.BURNING_FURNACE)) {
						    e.setCancelled(true);
						    NewGUI.openSmeltGUI(player);
						}
						if (b.equals(Material.WORKBENCH)) {
							e.setCancelled(true);
						}
						if (b.equals(Material.ANVIL)) {
							e.setCancelled(true);
							NewGUI.openSmithGUI(player);
						}
						if (b.equals(Material.CHEST)) {
							e.setCancelled(true);
						}
						if (b.equals(Material.TRAPPED_CHEST)) {
							e.setCancelled(true);
						}
					}
				}
				else { // Does have a block in-hand
					// Skip GUI opening because the player is placing a block
				}
			}
		}
	}
}
