package ru.test.list;

public class SimpleQueue<T> extends MyList<T> {
    private Node<T> first = null;
    private Node<T> last = null;

    public T poll() {
        T value = null;
        if (first != null) {
            value = first.getValue();
            first = first.getNext();
        }
        return value;

    }

    public void push(T value) {
        if (first == null) {
            first = new Node<>(value);
            last = first;
        } else {
            last.setNext(new Node<>(value));
            last = last.getNext();
        }
    }
}
