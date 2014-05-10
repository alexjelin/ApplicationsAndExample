package pkg2razadacha;

import java.util.Random;

public class ListTest {

    public static List updateBankAccountList(List accList) {
        Random rand = new Random();
        int randomBalance = rand.nextInt(100);

        Iterator obj = accList.getIterator();
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

    public static void bankReport(List accountList) {
        Iterator obj = accountList.getIterator();
        int counter = 1;
        do {
            if (counter == 1) {
                obj.toFirst();
            } else {
                obj.next();
            }
            ListNode currentListNode = obj.current();
            System.out.println(currentListNode.toString());
        } while (obj.end() != true);
    }

    public static void main(String args[]) {
        List list = new List(); // create the List container

        // insert integers in list
        list.insertAtFront(new AccountRecord(1, "Ivan", "Ivanov", 0.00));
        list.print();
        list.insertAtFront(new AccountRecord(2, "Ivan", "Ivanov", 10.00));
        list.print();
        list.insertAtBack(new AccountRecord(3, "Ivan", "Ivanov", 20.00));
        list.print();
        list.insertAtBack(new AccountRecord(4, "Ivan", "Ivanov", 30.00));
        list.print();

        // remove objects from list; print after each removal
        try {
            Object removedObject = list.removeFromFront();
            System.out.printf("%s removed\n", removedObject);
            list.print();

            removedObject = list.removeFromFront();
            System.out.printf("%s removed\n", removedObject);
            list.print();

            removedObject = list.removeFromBack();
            System.out.printf("%s removed\n", removedObject);
            list.print();

            removedObject = list.removeFromBack();
            System.out.printf("%s removed\n", removedObject);
            list.print();
        } // end try
        catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        } // end catch
    } // end main
} // end class ListTest

