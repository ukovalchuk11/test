package ru.test.generic;


import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractStore<T extends Base> implements Store<T> {

    private SimpleArray<T> array;


    protected AbstractStore(int size) {
        this.array = new SimpleArray<T>(size);
    }

    @Override
    public void add(T model) {
        array.add(model);
    }

    @Override
    public boolean replace(String id, T model) {
        int position = indexOf(id);
        if (position >= 0) {
            array.update(position, model);
            return true;
        } else return false;
    }

    @Override
    public boolean delete(String id) {
        int position = indexOf(id);
        if (position >= 0) {
            array.delete(position);
            return true;
        } else return false;
    }

    private int indexOf(String id) {
        int r = -1;
        for (int i = 0; i <= array.getIndex(); i++) {
            if (id.equals(array.get(i).getId())) {
                r = i;
                break;
            }
        }
        return r;
    }

    @Override
    public T findById(String id) {
        if (array.getIndex() > 0) {
            for (int i = 0; i <= array.getIndex(); i++) {
                if (id.equals(array.get(i).getId())) {
                    return array.get(i);
                }
            }
        }
        return null;


    }
}
