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
        System.out.println(manageTime(()->arrayListMaster.fill(arraySize)) + " ms");
    }

    private long manageTime(Runnable function){
        long start = System.nanoTime();
        function.run();
        return System.nanoTime() - start;
    }
}
