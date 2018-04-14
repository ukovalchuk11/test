package ru.test.set;


import static java.lang.Math.abs;

public class SetTable<E> {

    private Object[] container = new Object[10];


    public boolean add(E e) {
        boolean addAdd = false;
        if (e != null) {
            int hash = e.hashCode();
            int index = getIndexFromHash(hash);
            if(container[index] == null){
                container[index] = e;
                addAdd = true;
            }
        }
        return addAdd;
    }

    public boolean contains(E e) {
        return e != null && container[getIndexFromHash(e.hashCode())] != null;
    }

    public boolean remove(E e) {
        boolean delete = false;
        if(contains(e)){
            container[getIndexFromHash(e.hashCode())] = null;
            delete = true;
        }
        return delete;
    }

    private int getIndexFromHash(int hashcode) {
        hashcode = abs(hashcode);
        return hashcode % container.length;
    }

    private void newIndex (){
        Object[] newContainer = new Object[container.length*2];
        for (Object value : container) {
            if (value != null) {
                newContainer[getIndexFromHash(value.hashCode())] = value;
            }
        }
        container = newContainer;
    }

}
