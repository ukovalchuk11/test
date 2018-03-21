package ru.test.generic;

import java.util.Arrays;

public class SimpleArray<T> {
    private Object[] objects;
    private int index = 0;

    public int getIndex() {
        return index;
    }
    public SimpleArray(int size){
        this.objects = new Object[size];
    }

    public void add(T value){
        this.objects[index++] = value;
    }

    public void update(int position, T newValue){
        this.objects[position] = newValue;
    }

    public void delete(int position){
        if(objects != null ){
            for(int i = position; i < objects.length-1; i++){
                objects[i] = objects [i+1];
            }
            objects = Arrays.copyOf(objects,objects.length);
            objects[objects.length-1] = 0;

        }
        index --;
    }

    public T get(int position){
        return (T) this.objects[position];
    }
}
