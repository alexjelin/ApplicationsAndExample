package stackimpwithgenerics;

import java.util.EmptyStackException;

public class Stack<E> {

    private final int size;
    private int top;
    private E[] elements;

    public Stack() {
        this.size = 10;
    }

    public Stack(int size) {
        this.size = size > 0 ? size : 10;
        top = -1;

        elements = (E[]) new Object[size];
    }

    public void push(E value) {
        if (top == size - 1) {
            System.out.format("Stack is full!");
        }

        elements[++top] = value;
    }

    public E pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }

        return elements[top--];
    }
    
}