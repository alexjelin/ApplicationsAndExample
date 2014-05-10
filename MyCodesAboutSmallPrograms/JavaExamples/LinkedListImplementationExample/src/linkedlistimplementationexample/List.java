package linkedlistimplementationexample;

public class List<E> {

    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String nameOfList;

    public ListNode<E> getFirstNode() {
        return firstNode;
    }

    public ListNode<E> getLastNode() {
        return lastNode;
    }

    public List(String nameOfList) {
        this.nameOfList = nameOfList;
    }

    public List() {
        this.nameOfList = "List";
        this.firstNode = this.lastNode = null;
    }

    public boolean isEmpty() {
        boolean isempty = false;
        if (firstNode == null) {
            return isempty = true;
        } else {
            return isempty;
        }
    }

    public void insertAtFront(E data) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(data);
        } else {
            firstNode = new ListNode<E>(data, firstNode);
        }
    }

    public void insertAtBack(E data) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<>(data);
        } else {
            lastNode = lastNode.nextNode = new ListNode<>(data);
        }
    }

    public void removeFromFront() {
        if (isEmpty()) {
            firstNode = lastNode = null;
        } else {
            this.firstNode = firstNode.nextNode;
        }
    }

    public void removeFromBack() {
        if (isEmpty()) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> currentNode = firstNode;
            while (currentNode != lastNode) {
                currentNode = currentNode.nextNode;
            }

            lastNode = currentNode;
            currentNode.nextNode = null;
        }
    }
    public void toString1() {
        ListNode<E> currentNode = firstNode;
        while (currentNode != null) {
            System.out.println(String.format("%s \n", currentNode.data));
            currentNode=currentNode.nextNode;
        }
    }
}
