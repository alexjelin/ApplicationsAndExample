package uprajnenie;

import javax.swing.JOptionPane;
import org.omg.CORBA.Current;

class ListNode {

    protected Object data;
    protected ListNode nextNode;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    public ListNode(Object newData) {
        setData(data);
    }

    public ListNode(Object newData, ListNode newListNode) {
        setData(data);
        nextNode = newListNode;
    }
}

public class List {

    private ListNode firstnode;
    private ListNode lastnode;
    private String name;

    public ListNode getFirstnode() {
        return firstnode;
    }

    public ListNode getLastnode() {
        return lastnode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List() {
        this.name = "list";
        firstnode = lastnode = null;
    }

    public List(String nameOfList) {
        setName(nameOfList);
        firstnode = lastnode = null;
    }

    public boolean isEmpty() {
        if (firstnode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertedInFront(Object data) {
        if (this.isEmpty()) {
            firstnode = lastnode = new ListNode(data);
        } else {
            firstnode = new ListNode(data, firstnode);
        }
    }

    public void insertedInBack(Object data) {
        if (this.isEmpty()) {
            firstnode = lastnode = new ListNode(data);
        } else {
            lastnode = lastnode.nextNode = new ListNode(data);
        }
    }

    public Object removeFromFront() {
        if (this.isEmpty()) {
            throw new EmptyLinkedListExeption("Prazen spisyk!");
        } else {
            Object firstNodeObj = firstnode.getData();
            firstnode = firstnode.getNextNode();
            return firstNodeObj;
        }
    }

    public Object removeFromBack() {
        Object obj = null;
        if (this.isEmpty()) {
            throw new EmptyLinkedListExeption("Prazen spisyk!");
        } else {
            ListNode currentNode = firstnode;
            while (currentNode != lastnode) {
                currentNode = currentNode.getNextNode();
                if (currentNode == lastnode) {
                    obj = lastnode.getData();
                    lastnode = null;
                }
            }
            return obj;
        }
    }

    @Override
    public String toString() {
        String result = "";
        if (this.isEmpty()) {
            return result = "Spisykt e prazen!";
        } else {
            ListNode current = firstnode;
            while (current != lastnode) {
                System.out.printf("1");
                current = current.getNextNode();
            }
            return result;
        }
    }

    public Object getElement(int number) {
        Object obj = null;
        int number1 = 1;
        ListNode curr = firstnode;
        if (this.isEmpty()) {
            return null;
        } else {
            while (curr != null) {
                curr = curr.getNextNode();
                number++;
                if (number == number1) {
                    obj = curr.data;
                    break;
                }
            }
            return obj;
        }
    }

    public static void size(List list) {
        ListNode currentN = list.firstnode;
        int size = 0;
        if (list.isEmpty()) {
            System.out.printf("0");
        }
        while (currentN != null) {
            size++;
            currentN = currentN.getNextNode();
        }
        System.out.printf("%d", size);
    }

    public static void main(String args[]) {
        List list1 = new List();
        list1.insertedInFront("aha");
        list1.insertedInBack("brum");
        list1.insertedInBack("7");
        list1.insertedInBack("5");
    }
}