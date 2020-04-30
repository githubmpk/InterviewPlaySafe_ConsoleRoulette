package com.playsafe.gamestudio.java.consoleroulette;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.DoubleUnaryOperator;

/**
 * Created by Kirthan on 4/30/2020.
 */
public class RouletteGameProcessing {

    public static void read(int winnumber)
    {
        System.out.println("Number : " +winnumber);
        Path path = Paths.get("src/main/resources/rouletteplayers.txt");
        try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){

            //Read from the stream
            String currentLine = null;
            String name = null;
            String parts[] = null;
            String secondPiece = null;
            String partstwo[] = null;
            String betNumber = null;
            int betIntNumber;
            String amountinbet = null;
            Double amountinbetDoubleType;
            String oddEvenWon = null;
            double amountWon;
            System.out.println("Player" +"                  " +"Bet" +"                " +"Outcome"
                    +"               ");
            while((currentLine = reader.readLine()) != null){
                parts = currentLine.split(" ", 2);
                name = String.format(parts[0]);
                secondPiece = String.format(parts[1]);
                partstwo = secondPiece.split(" ", 2);
                betNumber = String.format(partstwo[0]);
                amountinbet = String.format(partstwo[1]);
                amountinbetDoubleType = Double.parseDouble(amountinbet);
                if("EVEN".equalsIgnoreCase(betNumber) || "ODD".equalsIgnoreCase(betNumber)){
                    if(winnumber % 2 == 0){
                        oddEvenWon = "EVEN";
                    }else {
                        oddEvenWon = "ODD";
                    }
                    if(betNumber.equals(oddEvenWon)){
                        amountinbetDoubleType = amountinbetDoubleType * 2;
                        System.out.println(name +"                  " +betNumber +"                " +"WIN"
                                +"               " +amountinbetDoubleType);
                    }else {
                        System.out.println(name +"                  " +betNumber +"                " +"LOSE"
                                +"               " +"0.0");
                    }
                }else {
                    betIntNumber = Integer.parseInt(betNumber);
                    if(betIntNumber == winnumber){
                        amountinbetDoubleType = amountinbetDoubleType * 32;
                        System.out.println(name +"                  " +betNumber +"                " +"WIN"
                                +"               " +amountinbetDoubleType);
                    }else {
                        System.out.println(name +"                  " +betNumber +"                " +"LOSE"
                                +"               " +"0.0");
                    }
                }

            }
        }catch(IOException ex){
            ex.printStackTrace();
        }


    }
}