package de.airoyster.workbenchandec;

import de.airoyster.workbenchandec.commands.EC_CMD;
import de.airoyster.workbenchandec.commands.WB_CMD;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static String con = "§cThe console can't use the command";
    public static String noPerms = ChatColor.AQUA +"WBEC| " + "§cFor this you don't have permissions!";
    public static String prefix = ChatColor.AQUA +"WBEC| ";

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("§aWBEC| activatet!");

        getCommand("ec").setExecutor(new EC_CMD());
        getCommand("wb").setExecutor(new WB_CMD());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("§aWBEC| deactivatet!");
    }
}
