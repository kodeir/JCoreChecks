package com.kodeir.jcore.iterations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sergei "Kodeir" Riabinin on 16/03/17.
 */
public class BigMonster implements Iterable<MonsterPart>{

    List<MonsterPart> parts;

    public BigMonster(int partsNumber){
        System.out.println("..creating monster");
        parts = new ArrayList<>();
        for (int i = 0; i < partsNumber; i++){
            parts.add(new MonsterPart("angry monster part", false));
        }
        System.out.println("..monster created with " + partsNumber + " parts");
    }

    @Override
    public Iterator<MonsterPart> iterator() {
        Iterator<MonsterPart> partIterator = parts.iterator();
        return null;
    }
}
