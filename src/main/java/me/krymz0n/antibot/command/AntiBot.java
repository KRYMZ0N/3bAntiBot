package me.krymz0n.antibot.command;

import me.krymz0n.antibot.Main;
import me.krymz0n.antibot.util.Token;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;

public class AntiBot implements CommandExecutor {
    private final Main plugin;

    public AntiBot(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("antibot").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (args[0].startsWith(Token.parseToken)) {
            p.sendMessage("ttest complete");
        } else {
            p.kickPlayer("Please join back and authenticate yourself using the token provided to you!");
        }
        return false;
    }
}
