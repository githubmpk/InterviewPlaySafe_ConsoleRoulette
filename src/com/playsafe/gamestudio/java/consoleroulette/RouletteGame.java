package com.playsafe.gamestudio.java.consoleroulette;

import java.util.Random;
import java.util.Scanner;

public class RouletteGame {

    public static int RouletteGameWinner() {
        Random generator = new Random();

        int winnumber = generator.nextInt(37);
        return winnumber;

    }
}