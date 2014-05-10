package treeimplementation;

// Fig. 17.18: TreeTest.java
// This program tests class Tree.
import java.util.Random;

public class TreeTest {

    public static void main(String args[]) {
        Tree tree = new Tree();
        int value;
        Random randomNumber = new Random();
        System.out.println("Inserting the following values: ");

        // insert 10 random integers from 0-99 in tree 
        for (int i = 1; i <= 10; i++) {
            value = randomNumber.nextInt(100);
            System.out.print(value + " ");
            tree.insertNode(value);
        } // end for
        System.out.println("\n\nPreorder traversal");
        tree.preorderTraversal(); // perform preorder traversal of tree

        System.out.println("\n\nInorder traversal");
        tree.inorderTraversal(); // perform inorder traversal of tree

        System.out.println("\n\nPostorder traversal");
        tree.postorderTraversal(); // perform postorder traversal of tree
        System.out.println();
        tree.insertNode(5);
        tree.insertNode(1);
        tree.insertNode(50);
        tree.insertNode(1);
        tree.insertNode(1);
        int size = tree.getDepht();
        System.out.println(tree.getAverage());


    } // end main
} // end class TreeTest
/**
 * ************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 * ***********************************************************************
 */
