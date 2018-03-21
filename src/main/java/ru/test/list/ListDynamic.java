package ru.test.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListDynamic<E> implements Iterable<E> {

    private Object[] container = new Object[10];

    private int index = 0;

    private int modCount = 0;

    public void add(E e){
        if(container.length <= index){
            container = Arrays.copyOf(container, index*2);
        }
        modCount++;
        container[index++] = e;

    }

    public E get(int x){

        return (E) this.container[x];

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int expectedModCount = modCount;
            private int x = 0;

            @Override
            public boolean hasNext() {
                count();
                return index > x;
            }

            @Override
            public E next() {
                count();
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return (E) container[x++];
            }

            private void count(){
                if(modCount < expectedModCount || modCount > expectedModCount){
                    throw new ConcurrentModificationException();
                }
            }
        };


    }
}
