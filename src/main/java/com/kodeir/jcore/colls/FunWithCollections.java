package com.kodeir.jcore.colls;

import com.kodeir.commons.IOWorker;

/**
 * Created by sryabinin on 17.05.2017.
 */
public class FunWithCollections {

    private ArrayListMaster arrayListMaster;

    public FunWithCollections(){
        arrayListMaster = new ArrayListMaster();
    }

    public void measure(){
        System.out.println("Enter array size: ");
        int arraySize = IOWorker.parseInt();
        if (arraySize > 0) {
            System.out.print("Int: ");
            System.out.println(manageTime(() -> arrayListMaster.fillWithInt(arraySize)) + " s");
            System.out.print("Obj: ");
            System.out.println(manageTime(() -> arrayListMaster.fillWithObj(arraySize)) + " s");
        } else {
            System.out.println("Please enter array size > 0");
        }
    }

    private double manageTime(Runnable function){
        long start = System.nanoTime();
        function.run();
        long elapsed = System.nanoTime() - start;
        return ( (double)elapsed / 1000000000.0);
    }
}
