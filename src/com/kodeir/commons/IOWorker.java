package com.kodeir.commons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sryabinin on 18.05.2017.
 */
public class IOWorker {

    public static String readFromInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            return s;
        } catch (IOException e) {
            System.err.println("Invalid Format! " + e);
            return "";
        }
    }

    public static int parseInt(){
        try{
            int i = Integer.parseInt(readFromInput());
            return i;
        }catch(NumberFormatException e){
            System.err.println("Invalid Format! " + e);
            return -1;
        }
    }
}
