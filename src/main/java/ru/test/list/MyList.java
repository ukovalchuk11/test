package ru.test.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<E> implements Iterable<E> {

    private Node<E> first = null;
    private Node<E> last = null;
    private int modCount = 0;
    private int size = 0;

    public static class Node<E> {
        private E value = null;
        private Node<E> next;
        private Node<E> prev;

        public Node(Node<E> prev, E value, Node<E> next ) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(E value){
            this.value = value;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }

    public void add(E value){
        Node<E> lastElement = last;
        Node<E> newValue = new Node<E>(lastElement, value, null);
        last = newValue;
        if(lastElement == null){
            first = newValue;
        }else{
            lastElement.next = newValue;
        }
        modCount++;
        size++;
    }

    public E get(int index){
        Node<E> element = first;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for(int i =0; i < index; i++ ){
            element = element.getNext();
        }
        return element.getValue();
    }

        @Override
        public Iterator<E> iterator() {
            return new Iterator<E>() {
                private int expectedModCount = modCount;
                Node<E> element = first;

                @Override
                public boolean hasNext() {
                    checkForModCount();
                    return element != null;
                }

                @Override
                public E next() {
                    checkForModCount();
                    if(!hasNext()){
                        throw new NoSuchElementException();
                    }
                    E value = element.getValue();
                    element=element.getNext();
                    return value;
                }

                private void checkForModCount(){
                    if(modCount != expectedModCount){
                        throw new ConcurrentModificationException();
                    }
                }
            };
        }

    }


