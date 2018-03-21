package ru.test.iterator;

import java.util.NoSuchElementException;

public class Primes {
    private int [] value;
    private int index = 0;

    public Primes(int[] value) {
        this.value = value;

    }

    private boolean isPrime(int number){
        boolean prime = true;
        if(number <= 1){
            prime = false;
        }else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }


    public boolean hasNext(){
        boolean next = false;

        while (value.length > index) {
            if (isPrime(value[index])) {
                next = true;
                break;
            } else {
                index++;
            }
        }
        return next;
    }
    public Object next(){
        if(hasNext()){
            return value[index++];
        }
        throw new NoSuchElementException();
    }
}
