package ru.test.list;

public class Node<T> {
    private T value;
    public Node<T> next;



    public Node(T value) {
        this.value = value;
    }

    public Node() {

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


    public boolean hasCycle(Node first) {
        if (first == null) {
            return false;
        }
        Node slow = first;
        Node fast = first;

        while (true) {
            slow = slow.next;

            if (fast.next != null) {
                fast = fast.next.next;
            } else
                return false;

            if (slow == null || fast == null) {
                return false;
            }
            if (slow == fast) {
                return true;
            }
        }
    }
}
