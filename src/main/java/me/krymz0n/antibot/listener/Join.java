package me.krymz0n.antibot.listener;

import me.krymz0n.antibot.Main;
import me.krymz0n.antibot.util.Token;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    private final Main plugin;

    public Join(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent evt) {
        Player p = evt.getPlayer();
        if (!p.hasPlayedBefore()) {
            p.sendMessage("Your authentication token is: " + Token.parseToken);
            p.sendMessage("please authenticate yourself using /antibot (Your token)");
        }
    }
}
