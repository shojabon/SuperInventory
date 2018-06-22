package com.shojabon.sinventory;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class SuperInventory extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("test")) {
            Player p = (Player) sender;
            Bukkit.broadcastMessage("test");
            p.openInventory(new SInventory(3, "test inventory").setItem(new int[]{1, 2, 3, 4, 5}, new ItemStack(Material.STONE)).build());
        }
        return false;
    }

}
