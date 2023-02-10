package de.airoyster.workbenchandec.commands;

import de.airoyster.workbenchandec.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WB_CMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("system.wb")) {
                if (args.length == 0) {
                    //p.openWorkbench(null, true);
                    p.openWorkbench(p.getLocation(), true);
                    return true;
                } else {
                    sender.sendMessage(Main.prefix + "§cError! §aPlease use '/wb' or '/workbench'");
                }
            } else {
                p.sendMessage(Main.noPerms);
            }
        } else {
            sender.sendMessage(Main.con);
            return false;
        }
        return false;
    }
}