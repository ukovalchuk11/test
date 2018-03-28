package ru.test.set;


import ru.test.list.MyList;

import java.util.Iterator;


public class SimpleSetLinked<E> implements Iterable<E> {

    private MyList<E> myList = new MyList<E>();


    public void add(E e) {
        boolean add = true;
        for (E container : myList) {
            if (container.equals(e)) {
                add = false;
                break;
            }
        }
        if (add) {
            myList.add(e);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return myList.iterator();
    }
}
