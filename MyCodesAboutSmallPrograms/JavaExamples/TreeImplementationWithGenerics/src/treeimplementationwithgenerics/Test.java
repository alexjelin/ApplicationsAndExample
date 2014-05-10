package treeimplementationwithgenerics;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Tree<Integer> test = new Tree<>(5);
        test.insertNode(8);
        test.insertNode(4);
        test.insertNode(5);
        test.insertNode(6);
        test.insertNode(7);
        test.preorderTraveral(test.root);
        System.out.println();
        System.out.println();
        test.innorderTraveral(test.root);
    }
}
