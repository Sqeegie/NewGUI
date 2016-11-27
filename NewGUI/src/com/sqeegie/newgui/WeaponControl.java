package com.sqeegie.newgui;

import static org.bukkit.ChatColor.BOLD;
import static org.bukkit.ChatColor.GOLD;
import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.RED;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@SuppressWarnings("unused")
public class WeaponControl implements Listener{
	
	@EventHandler
	public void onPlayerEvent(PlayerInteractEvent e) {
		
		final Player p = e.getPlayer();
		
		if (e.getAction().equals(Action.LEFT_CLICK_AIR)) {
			ItemStack tool = e.getItem();
			if(tool == null) {
                return;
            }
			
			ItemMeta toolData = tool.getItemMeta();
			if (toolData == null) {
				return;
			}
			
			if (tool.getType().equals(Material.DIAMOND_SWORD)) {
				if (toolData.getDisplayName().contains("Adamantite Sword")) {
					p.sendMessage("This is an adamant Sword!");
				}
			}
		}
	}
	
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent e) {
		if(e.getDamager() instanceof Player) {
			
			Player p = (Player) e.getDamager();
			ItemStack handItem = p.getItemInHand();
			ItemMeta handMeta = p.getItemInHand().getItemMeta();
			
			if(handItem.getType() == Material.DIAMOND_SWORD) {
				if (handMeta.getDisplayName().contains("Adamantite Sword")) {
					e.setDamage((double) 1);
				}
			}
		}
	}
}
