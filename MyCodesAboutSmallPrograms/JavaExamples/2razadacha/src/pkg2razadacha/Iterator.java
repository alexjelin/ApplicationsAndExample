package pkg2razadacha;

public interface Iterator {

   ListNode current(); // returns the currently selected ListNode

    boolean end();
// returns true when the currently selected ListNode is the last node

    void next(); // moves to the next ListNode, if the current ListNode is not the last

    void toFirst();
// makes the fist ListNode to be the currently selected 

    void toLast();
// makes the last ListNode to be the currently selected
}
