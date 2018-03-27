package ru.test.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleSet<E> implements Iterable<E> {

    private Object[] container = new Object[10];
    private int index = 0;



    public void add(E e) {
        boolean value = true;
        if (container.length <= index) {
            container = Arrays.copyOf(container, index * 2);
        }
        for (int i = 0; i < container.length; i++) {
            if (e.equals(container[i])) {
                value = false;
                break;
            }
        }
        if (value) {
            container[index++] = e;
        }

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int x = 0;

            @Override
            public boolean hasNext() {
                return index > x;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) container[x++];
            }

        };


    }
}
