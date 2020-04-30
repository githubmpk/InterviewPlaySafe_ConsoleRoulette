package com.playsafe.gamestudio.java.consoleroulette;

import java.util.TimerTask;

public class Timer extends TimerTask {
    public void run() {

        int winnuber = RouletteGame.RouletteGameWinner();
        RouletteGameProcessing.read(winnuber);
    }
}
