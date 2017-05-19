package com.kodeir.jcore;

import com.kodeir.commons.IOWorker;
import com.kodeir.jcore.colls.FunWithCollections;

/**
 * Created by Sergei Riabinin on 14.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        System.out.println("_ _ _ Choose: _ _ _");
        System.out.println("_ 1. Collections; ");
        System.out.println("_ 2. Other checks; ");
        System.out.println("_ 0. Exit ");
        switch ( IOWorker.parseInt()) {
            case 1 : startCollections();
                break;
            case 2 : checkInitialization();
                break;
            case 0 : System.exit(0);
                break;
            default: System.out.println(" Invalid option! ");
                menu();
                break;
        }
    }

    private static void checkInitialization(){
        System.out.println("*** check initialization order ***");
        new InitializationOrder();
        System.out.println();

        System.out.println("*** check references ***");
        new ReferenceJuggler();
        System.out.println();

        System.out.println("*** check finalize ***");
        SimpleFinalize simpleFinalize = new SimpleFinalize();
        System.out.println();

        menu();
    }

    private static void startCollections(){
        System.out.println("*** Collections checks ***");
        FunWithCollections funWithCollections = new FunWithCollections();
        funWithCollections.measure();
        System.out.println();

        menu();
    }

}
