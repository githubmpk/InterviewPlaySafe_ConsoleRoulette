package com.playsafe.gamestudio.java.consoleroulette;

public class Main {

    public static void main(String[] args) {
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new com.playsafe.gamestudio.java.consoleroulette.Timer(), 0, 30000);
    }
}
