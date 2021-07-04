package me.krymz0n.antibot;

import me.krymz0n.antibot.command.AntiBot;
import me.krymz0n.antibot.listener.Join;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("test");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);
        pm.registerEvents(new Join(this), this);

        getCommand("antibot").setExecutor(new AntiBot(this));

    }

    @Override
    public void onDisable() {
        System.out.println("test");
    }
}
