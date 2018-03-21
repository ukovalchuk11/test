package ru.test.iterator;

public class Items {
    private int[][] value;
    private int x=0;
    private int y=0;

    public Items(int[][] value) {
        this.value = value;
    }

    public boolean hasNext(){
        return value.length - 1 > x || value[x].length > y;
    }

    public Object next(){
        if (y == value[x].length) {
            x++;
            y = 0;
        }
        return value[x][y++];
    }

}
