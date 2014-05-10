package pkg2razadacha;
// class to represent one node in a list
import com.sun.xml.internal.ws.api.pipe.NextAction;
import java.util.Random;

class ListNode {
    // package access members; List can access these directly

    AccountRecord data; // data for this node
    ListNode nextNode; // reference to the next node in the list

    // constructor creates a ListNode that refers to object
    ListNode(AccountRecord object) {
        this(object, null);
    } // end ListNode one-argument constructor 

    // constructor creates ListNode that refers to 
    // Object and to next ListNode
    ListNode(AccountRecord object, ListNode node) {
        data = new AccountRecord(object);
        nextNode = node;
    } // end ListNode two-argument constructor

    // return reference to data in node
    AccountRecord getObject() {
        return data; // return Object in this node
    } // end method getObject

    // return reference to next node in list
    ListNode getNext() {
        return nextNode; // get next node
    } // end method getNext
} // end class ListNode

// class List definition
public class List {

    private class ListIterator implements Iterator {

        private ListNode current;

        public ListNode getData() {
            return this.current;
        }

        public ListIterator() {
            this.current = firstNode;
        }

        @Override
        public ListNode current() {
            return this.current;
        }

        @Override
        public boolean end() {
            if (current.equals(lastNode)) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public void next() {
            if (current != lastNode) {
                current = current.getNext();
            }
        }

        @Override
        public void toFirst() {
            current = firstNode;
        }

        @Override
        public void toLast() {
            current = lastNode;
        }
    }

    public Iterator getIterator() {
        return new ListIterator();
    }
   
    //--------------------------------------
    private ListNode firstNode;
    private ListNode lastNode;
    private String name; // string like "list" used in printing
    private int size = 0;
    private List newList;

    // constructor creates empty List with "list" as the name
    public List() {
        this("list");
    } // end List no-argument constructor

    // constructor creates an empty List with a name
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    } // end List one-argument constructor
    //---------------

    public List(List list) {
        this(list.name);
    }
    //---------------
//---------------------

    public List(AccountRecord[] arrAccounts) {
        int counter = 0;
        while (counter < arrAccounts.length) {
            if (counter == 0) {
                firstNode = new ListNode(arrAccounts[0]);
            }
            if (counter != 0) {
                insertAtFront(arrAccounts[counter]);
            }
            counter++;
        }
        size = counter++;
    }
    //----------------
//----------------

    public List append(List listToAppend) {
        AccountRecord telustObekt = listToAppend.firstNode.getObject();
        while (listToAppend.size >= 0) {
            this.insertAtBack(telustObekt);
            ListNode nextElement = listToAppend.firstNode.getNext();
            telustObekt = nextElement.getObject();
            listToAppend.removeFromFront();
        }
        return this;
    }
//------------------
//------------------

    public List delDoubles() {
        boolean cont = true;
        while (cont) {
            if (this.firstNode == this.lastNode) {
                cont = false;
            }
            if (this.firstNode.data.getAccount() == this.firstNode.getNext().data.getAccount()) {
                this.removeFromFront();
            }
        }
        return this;
    }
    //------------------------

    public AccountRecord removeAt(int position) {
        int counter = 1;
        ListNode nextNode = null;

        if (position >= size || position <= 1) {
            return null;
        } else {
            while (counter != position) {
                ListNode currentNode = this.firstNode;
                nextNode = currentNode.getNext();
                this.removeFromFront();
                counter++;
            }
            AccountRecord thisObj = nextNode.getObject();
            return thisObj;
        }
    }

    public void insertAt(int pos, AccountRecord accountrecord) {
        int counter = 1;
        ListNode nextNode = null;

        if (pos >= size) {
            this.lastNode.data = accountrecord;
        }
        if (pos <= counter) {
            System.err.println("Nepravilna poziciq na element!");
        } else {
            while (counter != pos) {
                ListNode currentNode = this.firstNode;
                nextNode = currentNode.getNext();
                this.removeFromFront();
                counter++;
            }
            nextNode.data = accountrecord;
        }
    }

    public AccountRecord[] toArray() {
        AccountRecord[] array = new AccountRecord[this.size];
        while (this != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = this.firstNode.getObject();
                this.removeFromFront();
            }
        }
        return array;
    }

    public boolean equals(ListNode node) {
        if (node == null) {
            return false;
        }
        if (this.firstNode.equals(node)) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return this.size;
    }
    // insert Object at front of List

    public void insertAtFront(AccountRecord insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same object
        {
            firstNode = lastNode = new ListNode(insertItem);
        } else // firstNode refers to new node
        {
            firstNode = new ListNode(insertItem, firstNode);
        }
        size += 1;
    } // end method insertAtFront

    // insert Object at end of List
    public void insertAtBack(AccountRecord insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same Object
        {
            firstNode = lastNode = new ListNode(insertItem);
        } else // lastNode's nextNode refers to new node
        {
            lastNode = lastNode.nextNode = new ListNode(insertItem);
        }
        size += 1;
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
        size--;

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
        size--;
        return removedItem; // return removed node data
    } // end method removeFromBack

    // determine whether list is empty
    public boolean isEmpty() {
        return firstNode == null; // return true if list is empty
    } // end method isEmpty

    // output list contents
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s\n", name);
            return;
        } // end if

        System.out.printf("The %s is: ", name);
        ListNode current = firstNode;

        // while not at end of list, output current node's data
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        } // end while

        System.out.println("\n");
    } // end method print

    @Override
    public String toString() {
        String result = "";
        while (this != null) {
            result += String.format("%s \n", this.firstNode.getObject().toString());
            this.removeFromFront();
        }
        return result;
    }
} // end class List
