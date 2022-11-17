package org.example;

import java.util.Iterator;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Randoms randomInterator = new Randoms(90, 100);
        Iterator<Integer> iteratorR = randomInterator.iterator();
        while (iteratorR.hasNext()) {
            sleep(1500);
            Integer r = iteratorR.next();
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим.");
                break;
            }
        }
    }
}