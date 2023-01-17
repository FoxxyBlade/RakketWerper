package com.foxdev.abilitys;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RakketWerper implements Listener {

    @EventHandler
    public void onRakket(PlayerInteractEvent e) {

        Player p = e.getPlayer();

        if (e.getAction() == Action.RIGHT_CLICK_AIR) {
            if (p.getInventory().getItemInMainHand().getType().equals(Material.FIREWORK_ROCKET)) ;


            Block block = p.getTargetBlock(null, 100);
            Location bl = block.getLocation();
            p.getWorld().createExplosion(bl, 50, true);
        }


    }

}
