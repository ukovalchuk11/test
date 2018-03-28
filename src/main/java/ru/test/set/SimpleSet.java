package ru.test.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleSet<E> implements Iterable<E> {

    private Object[] container = new Object[10];
    private int index = 0;
    private boolean value = true;

    public void add(E e) {

        if (container.length <= index) {
            container = Arrays.copyOf(container, index * 2);
        }
        contain(e);
        if(value) {
            container[index++] = e;
        }
    }

    private void contain(E e) {

        for (int i = 0; i < index; i++) {
            while (container[i] != null) {
                if (container[i].equals(e)) {
                    value = false;
                    break;
                }

            }
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
