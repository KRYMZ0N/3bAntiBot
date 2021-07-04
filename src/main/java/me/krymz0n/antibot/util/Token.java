package me.krymz0n.antibot.util;

import me.krymz0n.antibot.Main;
import org.bukkit.event.Listener;

import java.util.Random;

public class Token implements Listener {

    public static Integer getRandomInt(Integer max) {
        Random ran = new Random();
        return ran.nextInt(max);
    }
}
