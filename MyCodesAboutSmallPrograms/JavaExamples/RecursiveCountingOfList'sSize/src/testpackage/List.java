package testpackage;

// class to represent one node in a list
class ListNode {
    // package access members; List can access these directly

    Object data; // data for this node
    ListNode nextNode; // reference to the next node in the list

    // constructor creates a ListNode that refers to object
    ListNode(Object object) {
        this(object, null);
    } // end ListNode one-argument constructor 

    // constructor creates ListNode that refers to 
    // Object and to next ListNode
    ListNode(Object object, ListNode node) {
        data = object;
        nextNode = node;
    } // end ListNode two-argument constructor

    // return reference to data in node
    Object getObject() {
        return data; // return Object in this node
    } // end method getObject

    // return reference to next node in list
    ListNode getNext() {
        return nextNode; // get next node
    } // end method getNext
} // end class ListNode

// class List definition
public class List {

    private ListNode firstNode;
    private ListNode lastNode;
    private String name; // string like "list" used in printing
    private ListNode oldNode;
    private int size = 0;

    public ListNode getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(ListNode firstNode) {
        this.firstNode = firstNode;
    }

    public ListNode getLastNode() {
        return lastNode;
    }

    public void setLastNode(ListNode lastNode) {
        this.lastNode = lastNode;
    }
    
    // constructor creates empty List with "list" as the name

    public List() {
        this("list");
    } // end List no-argument constructor

    // constructor creates an empty List with a name
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    } // end List one-argument constructor

    public int size() {
        if (isEmpty()) {
            System.out.println("Listat e s daljina 0!");
        } else {
            if (size == 0) {
                oldNode = this.firstNode;
            }
            oldNode = oldNode.getNext();
            size++;
            if (oldNode == lastNode) {
            } else {
                this.size();
            }
        }
        return this.size;
    }
    // insert Object at front of List

    public void insertAtFront(Object insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same object
        {
            firstNode = lastNode = new ListNode(insertItem);
        } else // firstNode refers to new node
        {
            firstNode = new ListNode(insertItem, firstNode);
        }
    } // end method insertAtFront

    // insert Object at end of List
    public void insertAtBack(Object insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same Object
        {
            firstNode = lastNode = new ListNode(insertItem);
        } else // lastNode's nextNode refers to new node
        {
            lastNode = lastNode.nextNode = new ListNode(insertItem);
        }
    } // end method insertAtBack

    // remove first node from List
    public Object removeFromFront() throws EmptyListException {
        if (isEmpty()) // throw exception if List is empty
        {
            throw new EmptyListException(name);
        }

        Object removedItem = firstNode.data; // retrieve data being removed

        // update references firstNode and lastNode 
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }

        return removedItem; // return removed node data
    } // end method removeFromFront

    // remove last node from List
    public Object removeFromBack() throws EmptyListException {
        if (isEmpty()) // throw exception if List is empty
        {
            throw new EmptyListException(name);
        }

        Object removedItem = lastNode.data; // retrieve data being removed

        // update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else // locate new last node
        {
            ListNode current = firstNode;

            // loop while current node does not refer to lastNode
            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }

            lastNode = current; // current is new lastNode
            current.nextNode = null;
        } // end else

        return removedItem; // return removed node data
    } // end method removeFromBack

    // determine whether list is empty
    public boolean isEmpty() {
        return firstNode == null; // return true if list is empty
    } // end method isEmpty

    // get the first element contents
    public Object peekFirst() {
        return (firstNode == null) ? null : firstNode.getObject(); // return Object in firstNode
    } // end method peekFirst

    // get the first element contents
    public Object peekLast() {
        return (lastNode == null) ? null : lastNode.getObject(); // return Object in lastNode
    } // end method peekLast()

    @Override
    public String toString() {
        String result;
        result = String.format(oldNode.getObject().toString());
        oldNode = oldNode.getNext();

        if (size == 0) {
            oldNode = this.firstNode;
        }
        oldNode = oldNode.getNext();
        size++;
        if (oldNode == lastNode) {
        } else {
            this.toString();
        }
        return result;
    }

    public static void main(String args[]) {
        List test = new List("List");
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(55);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        test.insertAtFront(node1);
        test.insertAtBack(node3);
        test.insertAtBack(node3);
        test.insertAtBack(node3);
        test.insertAtBack(node3);
        test.insertAtBack(node3);
        test.insertAtBack(node3);
        test.insertAtBack(node5);
        test.insertAtBack(node3);
        test.insertAtBack(node4);
        test.insertAtBack(node3);

        IntList test2 = new IntList("someList");
        test2.insertAtFront(1);
        test2.insertAtBack(2);
        test2.insertAtBack(3);
        boolean sum = test2.contains(1);
        System.out.printf("%b",sum);

    }
} // end class List

