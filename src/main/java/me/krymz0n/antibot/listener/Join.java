package me.krymz0n.antibot.listener;

import me.krymz0n.antibot.Main;
import me.krymz0n.antibot.util.Token;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashSet;

import static me.krymz0n.antibot.util.Token.getRandomInt;

public class Join implements Listener {
    public static HashSet<Integer> token = new HashSet<>();
    public static String formattedToken = String.valueOf(token)
            .replace("[", " ");  //remove the right bracket
    private final Main plugin;

    public Join(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent evt) {
        if (Join.token.size() >= 1) {
            Join.token.remove(1);
            System.out.println("var 1");
            Player p = evt.getPlayer();
            p.sendMessage("Your authentication token is: " + token.toString().replace("[", "").replace("]", ""));
            p.sendMessage("please authenticate yourself using /antibot (Your token)");
        } else {
            token.add(getRandomInt(999));
            evt.getPlayer().sendMessage("Your authentication token is: " + token.toString().replace("[", "").replace("]", ""));
            evt.getPlayer().sendMessage("please authenticate yourself using /antibot (Your token)");
            System.out.println("var 2");
        }
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent evt) {
        Join.token.clear();
    }
}
