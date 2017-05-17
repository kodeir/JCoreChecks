package com.kodeir.jcore.colls;

/**
 * Created by sryabinin on 17.05.2017.
 */
public class FunWithCollections {

    public FunWithCollections(){
        ArrayListMaster arrayListMaster = new ArrayListMaster();
        System.out.println(manageTime(()->arrayListMaster.fill()) + " ms");
    }

    public long manageTime(Runnable function){
        long start = System.nanoTime();
        function.run();
        return System.nanoTime() - start;
    }
}
