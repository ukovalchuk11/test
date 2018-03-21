package ru.test.iterator;

import java.util.NoSuchElementException;

public class EvenNumbers {
    private int[] value;
    private int x = 0;

    public EvenNumbers(int[] value) {
        this.value = value;
    }

    public boolean hasNext() {
        boolean next = false;

        while (value.length > x) {
            if (value[x] % 2 == 0) {
                next = true;
                break;
            } else {
                x++;
            }
        }
        return next;
    }

    public Object next() {
            if (hasNext()){
                return value[x++];

        }
          throw new NoSuchElementException();
    }
}
