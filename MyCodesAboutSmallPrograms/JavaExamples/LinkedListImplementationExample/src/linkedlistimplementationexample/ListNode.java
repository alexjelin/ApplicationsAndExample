package linkedlistimplementationexample;

public class ListNode<E> {

    protected E data;
    protected ListNode<E> nextNode;

    public E getData() {
        return data;
    }

    public ListNode<E> getNextNode() {
        return nextNode;
    }

    public ListNode(E data, ListNode<E> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public ListNode() {
        this.data = null;
        this.nextNode = null;
    }

    public ListNode(E data) {
        this.data = data;
    }
    
}
