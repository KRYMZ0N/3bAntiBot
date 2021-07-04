package me.krymz0n.antibot.command;

import me.krymz0n.antibot.Main;
import me.krymz0n.antibot.listener.Join;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class AntiBot implements CommandExecutor {
    private final Main plugin;

    public AntiBot(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (args[0].startsWith(Join.token.toString().replace("[", "").replace("]", ""))) {
            p.sendMessage("Success!");
            Join.token.clear();
        } else {
            p.kickPlayer("Please join back and authenticate yourself using the token provided to you!");
            System.out.println("Player did not type /antibot " + Join.token.toString().replace("[", "").replace("]", ""));
            if (Bukkit.getOnlinePlayers().size() == 0) {
                Join.token.clear();
            }
        }
        return false;
    }
}
