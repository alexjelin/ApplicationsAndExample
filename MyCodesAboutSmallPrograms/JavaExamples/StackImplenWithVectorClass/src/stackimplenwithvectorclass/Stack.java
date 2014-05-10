package stackimplenwithvectorclass;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Stack<T> implements List<T> {

    Vector<T> stack;

    public Stack() {
        this.stack = new Vector<>();
    }

    public void push(T object) {
        this.stack.add(0, object);
    }

    public T peek() {
        return this.stack.firstElement();
    }

    public void pop() {
        this.stack.remove(0);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return stack.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return stack.iterator();
    }

    @Override
    public Object[] toArray() {
        return stack.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return stack.toArray(a);
    }

    @Override
    public boolean add(T e) {
        return stack.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return stack.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return c.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return stack.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return stack.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return stack.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return stack.removeAll(c);
    }

    @Override
    public void clear() {
        stack.clear();
    }

    @Override
    public T get(int index) {
        return stack.get(index);
    }

    @Override
    public T set(int index, T element) {
        return stack.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        stack.add(index, element);
    }

    @Override
    public T remove(int index) {
        return stack.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return stack.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return stack.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return stack.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return stack.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return stack.subList(fromIndex, toIndex);
    }
}
