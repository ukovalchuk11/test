package ru.test.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Converter {
     public Iterator<Integer> convert(Iterator<Iterator> it) {
        return new Iterator<Integer>() {

            private Iterator<Integer> iterator = it.next();

            @Override
            public boolean hasNext() {
                if (iterator.hasNext()) {
                    return true;
                }
                if(it.hasNext()){
                    iterator = it.next();
                    return true;
                }  else {
                    return false;
                }
            }

            @Override
            public Integer next() {
                if(iterator.hasNext()) {
                    return iterator.next();
                }
                throw new NoSuchElementException();
            }
        };
    }
}
