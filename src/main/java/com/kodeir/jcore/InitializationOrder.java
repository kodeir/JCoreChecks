package com.kodeir.jcore;

/**
 * Created by Sergei Riabinin on 14.03.2017.
 */
public class InitializationOrder {

    public InitializationOrder(){
        System.out.print("-- constructor: ");
        System.out.print(str1 + "; ");
        System.out.print(str2 + "; ");
        System.out.print(str3 + "; ");
        System.out.print(str4 + "; ");
        System.out.println();
    }

    private String str4 = "str4";

    {
        System.out.print("--block: ");
        System.out.print(str4 + "; ");
        /*
        Error:(12, 28) java: illegal forward reference
        System.out.println(str3);
        */
        System.out.println();
    }

    public final static String str1 = "str1";

    private String str3 = "str3";

    static {
        System.out.print("--static block: ");
        System.out.print(str1 + "; ");
        /*
        Error:(12, 28) java: illegal forward reference
        System.out.println(str2);
        */
        System.out.println();
    }

    public final static String str2 = "str2";

}
