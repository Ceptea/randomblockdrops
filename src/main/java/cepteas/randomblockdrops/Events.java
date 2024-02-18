package cepteas.randomblockdrops;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class Events implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        int length = Material.values().length;
        Material value = Material.values()[new Random().nextInt(length)];

        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(value));
        event.setDropItems(false);



    }
}
