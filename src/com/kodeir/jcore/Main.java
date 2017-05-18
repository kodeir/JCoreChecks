package com.kodeir.jcore;

import com.kodeir.jcore.colls.FunWithCollections;

/**
 * Created by Sergei Riabinin on 14.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        checkInitialization();
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

        System.out.println("*** check Collections ***");
        FunWithCollections funWithCollections = new FunWithCollections();
        funWithCollections.measure();
        System.out.println();
    }

}
