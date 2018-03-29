package ru.test.set;


import ru.test.list.MyList;

import java.util.Iterator;


public class SimpleSetLinked<E> implements Iterable<E> {

    private MyList<E> myList = new MyList<E>();

    public void add(E e) {
        if(!contain(e)) {
            myList.add(e);
        }
    }

    public boolean contain(E e) {
        for (E container : myList) {
            if (e != null && container.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return myList.iterator();
    }
}
