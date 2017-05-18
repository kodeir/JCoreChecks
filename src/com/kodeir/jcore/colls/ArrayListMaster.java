package com.kodeir.jcore.colls;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by sryabinin on 17.05.2017.
 */
public class ArrayListMaster {

    private List<Integer> defaultIntArray = new ArrayList<>();

    public void fill(int arraySize){
        Random random = new Random();
        for (int i = 0; i < arraySize; i++){
            defaultIntArray.add(random.nextInt(arraySize));
        }
        defaultIntArray.toString();
    }

}
