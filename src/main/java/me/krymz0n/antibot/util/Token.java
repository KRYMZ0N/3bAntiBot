package me.krymz0n.antibot.util;

import java.util.Random;

public class Token {

    private static Random random;
    public static int token = random.nextInt(900) + 100;
    public static String parseToken = String.valueOf(token);
}
