package linkedlistimplementationexample;

public class Queue<E> {

    private List queue;

    public Queue() {
        queue = new List();
    }

    public void enqueue(E data) {
        queue.insertAtBack(data);
    }

    public void remove() {
        queue.removeFromFront();
    }

    public void print() {
        queue.toString1();
    }
}
