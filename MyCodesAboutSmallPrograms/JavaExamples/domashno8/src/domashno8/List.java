package domashno8;

import java.util.Random;

class ListNode {

    public boolean equals(ListNode node, ListNode node2) {
        if (node.equals(node2)) {
            return true;
        } else {
            return false;
        }
    }
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

    private ListNode firstNode;
    private ListNode lastNode;
    private String name; // string like "list" used in printing

    // constructor creates empty List with "list" as the name
    public List() {
        this("list");
    } // end List no-argument constructor

    // constructor creates an empty List with a name
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    } // end List one-argument constructor

    public List(List copy) {
        this(copy.name);
    }
    // insert Object at front of List

    public List(AccountRecord[] arrAccounts) {
        this.firstNode = new ListNode(arrAccounts[0]);
        ListNode current = this.firstNode.nextNode;
        for (int i = 1; i < arrAccounts.length; i++) {
            current = new ListNode(arrAccounts[i]);
            current = current.nextNode;
        }
    }

    private class ListIterator implements Interator {

        private ListNode current;

        public ListNode getCurrent() {
            return current;
        }

        public void setCurrent(ListNode current) {
            this.current = current;
        }

        public ListNode current() {
            return this.current;
        }

        public boolean end() {
            if (current == lastNode) {
                return true;
            } else {
                return false;
            }
        }
// returns true when the currently selected ListNode is the last node

        public boolean hasNext() {
            if (current == lastNode) {
                return true;
            } else {
                return false;
            }
        }

        public void next() {
            if (end() != true) {
                current = current.getNext();
            }
        }// moves to the next ListNode, if the current ListNode is not the last

        public void toFirst() {
            current = firstNode;
        }
// makes the fist ListNode to be the currently selected 

        public void toLast() {
            current = lastNode;
        }
    }

    public Interator getInterator() {
        return new ListIterator();
    }

    public void insertAtFront(AccountRecord insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same object
        {
            firstNode = lastNode = new ListNode(insertItem);
        } else // firstNode refers to new node
        {
            firstNode = new ListNode(insertItem, firstNode);
        }
    } // end method insertAtFront

    public int size() {
        int size = 1;
        ListNode currentEl = firstNode;
        while (currentEl != lastNode) {
            currentEl = currentEl.getNext();
            size++;
        }
        return size;
    }

    public AccountRecord[] toArray() {
        AccountRecord[] arr = new AccountRecord[this.size()];
        ListNode current = firstNode;
        for (int i = 0; i < arr.length; i++) {
            arr[0] = current.getObject();
            current = current.getNext();
        }

        return arr;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int size = size();
        ListNode current = firstNode;

        while (size() != 0) {
            result.append(String.format("%s \n", current.data.toString()));
            current = current.getNext();
            size--;
        }

        return result.toString();
    }

    public List updateBankAccountList(List accList) {
        Random rand = new Random();
        int randomBalance = rand.nextInt(100);

        Interator obj = accList.getInterator();
        int counter = 1;
        do {
            if (counter == 1) {
                obj.toFirst();
            } else {
                obj.next();
            }
            ListNode currentListNode = obj.current();
            int newBalance1 = (int) currentListNode.data.getBalance() + randomBalance;
            currentListNode.data.setBalance(newBalance1);
        } while (obj.end() != true);
        return accList;
    }

    public void bankReport(List accountList) {
        Interator obj = accountList.getInterator();
        int counter = 1;
        do {
            if (counter == 1) {
                obj.toFirst();
            } else {
                obj.next();
            }
            ListNode currentListNode = obj.current();
            if (currentListNode.data.getBalance() > 50) {
                System.out.println(currentListNode.toString());
            }
        } while (obj.end() != true);
    }

    public void insertAtBack(AccountRecord insertItem) {
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
} // end class List
