package me.krymz0n.antibot.listener;

import me.krymz0n.antibot.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Stuck implements Listener {
    private final Main plugin;

    public Stuck(Main plugin) {
        this.plugin = plugin;

    }
}
/*
    @EventHandler
    public void onJoin(PlayerJoinEvent evt) {
        Player p = evt.getPlayer();
        if (!p.hasPlayedBefore()) {

        } else {
        }
    }
    public boolean stuck() {
        return
    }

}
*/