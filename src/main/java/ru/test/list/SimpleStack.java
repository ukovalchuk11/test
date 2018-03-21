package ru.test.list;

public class SimpleStack<T> extends MyList<T> {

    private Node<T> number = null;

    public T poll() {
        T value = null;
        if (number != null) {
            value = number.getValue();
            number = number.getNext();
        }
        return value;
    }

    public void push(T value) {
        if (number == null) {
            number = new Node<>(value);
        } else {
            Node<T> element = new Node<>(value);
            element.setNext(number);
            number = element;
        }

    }


}
