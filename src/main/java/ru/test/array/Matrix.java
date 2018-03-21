package ru.test.array;

import ru.test.generic.SimpleArray;

public class Matrix {
     static int[][] multiple(int size){
        int[][] q = new int[size][size];
        for (int i = 1; i < size; i++){
            for (int j = 1; j < size; j++){
                q[i][j]= i*j;
            }
        }
        return toOut(q);
    }

    static int[][] toOut(int[][] data){
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j <data.length; j++) {
                System.out.printf ("%4d",data[i][j]);

            }
            System.out.println();
        }
        return data;
    }

    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray(6);
        simpleArray.add(1);
        simpleArray.add(3);
        simpleArray.add(5);
        simpleArray.add(7);
        simpleArray.add(9);
        //simpleArray.update(0,0);
        System.out.println(simpleArray.getIndex());
        int position = 0 ;

        while(simpleArray.getIndex() > position){

            System.out.print(simpleArray.get(position)+ " ");
            position++;
        }
//        System.out.print(simpleArray.get(0)+ " ");
//        System.out.print(simpleArray.get(1)+ " ");
//        System.out.print(simpleArray.get(2)+ " ");
//        System.out.print(simpleArray.get(3)+ " ");
//        System.out.print(simpleArray.get(4)+ " ");
//        System.out.println();
//        multiple(8);
    }
}

