package ru.test.list;

public class Node<T> {
    private T value;
    private Node<T> next;

    private Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    Node first = new Node<>(1);
    Node two = new Node<>(2);
    Node third = new Node<>(3);
    Node four = new Node<>(4);

    boolean hasCycle(Node first) {
        if (first == null) {
            return false;
        }
        Node slow = first;
        Node fast = first;

        while (true){

        }


    }
}
