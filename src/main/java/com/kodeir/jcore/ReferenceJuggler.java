package com.kodeir.jcore;

/**
 * Created by Sergei "Kodeir" Riabinin on 14/03/17.
 */
public class ReferenceJuggler {

    private int instanceVar1;
    private String instanceVar2;

    public ReferenceJuggler(){
        ocaBookExample();
        messingWithVariables();
    }

    private void messingWithVariables() {
        System.out.println("-- Messing with variables: ");
        System.out.println("instance variable, int, default: " + instanceVar1);
        System.out.println("instance variable, String, default: " + instanceVar2);
        int instanceVar1;
        /*
        local variable should be defined before use:
        Error:(21, 66) java: variable instanceVar1 might not have been initialized
        instance variable is not active in this case
        */
        //System.out.println("instance variable, int, default: " + instanceVar1);
    }

    private void ocaBookExample() {
        System.out.println("-- Messing with example from OCA book: ");
        String one,two;
        one = "a";
        System.out.println("one = a: " + one);
        two = "b";
        System.out.println("two = b: " + two);
        one = two;
        System.out.println("one = two: " + one);
        String three = one;
        System.out.println("three = one: " + three);
        one = null;
        System.out.println("one = null: " + one + ", " + two + ", " + three);
    }

}
