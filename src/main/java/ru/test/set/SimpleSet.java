package ru.test.set;

import ru.test.list.ListDynamic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleSet<E> implements Iterable<E> {
    
    private ListDynamic<E> listDynamic = new ListDynamic<E>();


    public void add(E e) {
       if(!listDynamic.contain(e)){
           listDynamic.add(e);
       }
    }

    @Override
    public Iterator<E> iterator() {
        return listDynamic.iterator();
    }
}
