package linkedlistimplementationexample;

public class Stack<E> {

    private List stack;

    public Stack(String name) {
        stack = new List(name);
    }

    public void push(E data) {
        stack.insertAtFront(data);
    }

    public void pop() {
        this.stack.removeFromFront();
    }

    public void print() {
        stack.toString1();
    }

    public boolean stackIsEmpty() {
        return stack.isEmpty();
    }
}
