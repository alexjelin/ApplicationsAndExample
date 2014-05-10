package heapimplementation;

import java.util.ArrayList;

public class Heap<E extends Comparable<E>> {

    private ArrayList<E> heap;

    public Heap() {
        heap = new ArrayList<E>();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public static int leftChildIndex(int index) {
        return (2 * index) + 1;
    }

    public static int parentChildIndex(int index) {
        return (2 - index) / 2;
    }

    public static int rightChildIndex(int index) {
        return (2 * index) + 2;
    }

    public void add(E target) {
        heap.add(target);

    }

    public void filterUp(int index) {
        int parent = parentChildIndex(index);
        while (parent >= 0) {
            if (heap.get(index).compareTo(heap.get(parent)) < 0) {
                swap(index, parent);
                index = parent;
                parent = parentChildIndex(index);
            } else {
                return;
            }
        }
    }

    protected void filterDown(int index) {
        while (index < heap.size()) {
            int left = leftChildIndex(index);
            int right = rightChildIndex(index);
            int smallest = index;

            if ((left < heap.size()) && (heap.get(left).compareTo(heap.get(smallest))) < 0) {
                smallest = left;
            }
            if ((right < heap.size()) && (heap.get(right).compareTo(heap.get(smallest))) < 0) {
                smallest = right;
            }
            if (index == smallest) {
                return;
            }
            swap(index, smallest);
            index = smallest;
        }
    }

    public E remove() {
        E result = heap.get(0);
        E lastElement = heap.remove(heap.size() - 1);
        if (heap.size() > 0) {
            heap.set(0, lastElement);
        }

        filterDown(0);
        return result;
    }

    protected void swap(int i, int j) {
        E temp = heap.get(i);
        heap.set(i, heap.get(i));
        heap.set(j, temp);
    }

    protected Heap(ArrayList<E> unsortedData) {
        heap = new ArrayList<>();
        for (E e : unsortedData) {
            heap.add(e);
        }
        for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
            filterDown(i);
        }
    }

    public static <E extends Comparable<E>> void heapsot(ArrayList<E> heap) {
        Heap<E> test = new Heap<>();
        for (int i = 0; i < heap.size(); i++) {
            heap.set(i, heap.remove(i));
        }


    }
}
