package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected static int min;
    protected static int max;
    protected static Random random;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override

            public Integer next() {
                //    Random r = new Random();
                return random.nextInt(max - min) + 1 + min;
            }


            private interface Collection extends Iterable<Integer> {

                public default boolean hasNext() {
                    return true;

                }
            }
        };
    }
}
