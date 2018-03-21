package ru.test.iterator;

public class ItemsOne {
    private int[] value;
    private int x=0;
    private int y=0;

    public ItemsOne(int[] value) {
        this.value = value;
    }

    public boolean hasNext(){
        return value.length > x;
    }

    public Object next() {
        return value[x++];
    }
    }

