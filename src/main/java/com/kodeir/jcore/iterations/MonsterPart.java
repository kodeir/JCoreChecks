package com.kodeir.jcore.iterations;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Sergei "Kodeir" Riabinin on 16/03/17.
 */
public class MonsterPart implements Iterable {

    @Override
    public Iterator iterator() {
        return new MonsterIterator();
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
