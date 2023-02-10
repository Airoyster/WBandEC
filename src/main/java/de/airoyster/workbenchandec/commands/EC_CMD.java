package de.airoyster.workbenchandec.commands;

import de.airoyster.workbenchandec.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EC_CMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(Main.con);
            return false;
        }
        Player p = (Player) sender;

        if (p.hasPermission("system.ec")){
            if (args.length == 0) {
                p.openInventory(p.getEnderChest());
            } else {
                sender.sendMessage(Main.prefix + "§cError! §aPlease use '/ec' or '/enderchest'");
            }
        } else{
            p.sendMessage(Main.noPerms);
        }
        return false;
    }
}
