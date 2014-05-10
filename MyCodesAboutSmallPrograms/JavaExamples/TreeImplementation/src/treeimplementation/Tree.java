// Fig. 17.17: Tree.java
// Definition of class TreeNode and class Tree.
package treeimplementation;

// class TreeNode definition

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class TreeNode {

    // package access members
    TreeNode leftNode; // left node  
    int data; // node value
    TreeNode rightNode; // right node

    // constructor initializes data and makes this a leaf node
    public TreeNode(int nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    } // end TreeNode constructor

    // locate insertion point and insert new node; ignore duplicate values
    public void insert(int insertValue) {
        // insert in left subtree
        if (insertValue < data) {
            // insert new TreeNode
            if (leftNode == null) {
                leftNode = new TreeNode(insertValue);
            } else // continue traversing left subtree
            {
                leftNode.insert(insertValue);
            }
        } // end if
        else if (insertValue > data) // insert in right subtree
        {
            // insert new TreeNode
            if (rightNode == null) {
                rightNode = new TreeNode(insertValue);
            } else // continue traversing right subtree
            {
                rightNode.insert(insertValue);
            }
        } // end else if
    } // end method insert
} // end class TreeNode

// class Tree definition
public class Tree {

    private TreeNode root;
    
    private int getSum(TreeNode node){
        if(node==null)
        {
            return 0;
        }
        return node.data+getSum(node.leftNode)+getSum(node.rightNode);
    }

    private int getSize(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        return 1+getSize(node.leftNode)+getSize(node.rightNode);        
    }
    
    public int getSize(){
        return getSize(root);
    }
    
    public double getAverage(){
        return (double)getSum()/(double)getSize();
    }
    
    
    public int getSum(){
        return getSum(root);
    }
    
    private int getDepht(TreeNode node, int cnt, int max) {
        if (node == null) {
            return max;
        }
        int currentMax = max;
        if (cnt > max) {
            currentMax = max;
        }
        int leftResult = getDepht(node.leftNode, cnt + 1, currentMax);
        currentMax = leftResult > currentMax ? leftResult : currentMax;
        int rightResult = getDepht(node.rightNode, cnt + 1, currentMax);
        currentMax = rightResult > currentMax ? rightResult : currentMax;
        return currentMax;
    }

    public int getDepht() {
        return this.getDepht(root, 1, -1);
    }
public void writeToFile(String FileNama) throws IOException
{
    try{
    File f=new File(FileNama);
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
    out.writeObject(root);
    
    }
    catch(IOException io){
        throw new IOException(io.toString());
    }
    
}

private void f(TreeNode node, DataOutputStream s) throws IOException{
  s.writeInt(node.data);
  f(node.leftNode,s);
  f(node.rightNode,s);
}

private void fread(TreeNode node, DataInputStream s) throws IOException{
  s.readInt();
  fread(node.leftNode,s);
  fread(node.rightNode,s);
}
    // constructor initializes an empty Tree of integers
    public Tree() {
        root = null;
    } // end Tree no-argument constructor

    // insert a new node in the binary search tree
    public void insertNode(int insertValue) {
        if (root == null) {
            root = new TreeNode(insertValue); // create the root node here
        } else {
            root.insert(insertValue); // call the insert method
        }
    } // end method insertNode

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    } // end method preorderTraversal

    // recursive method to perform preorder traversal
    private void preorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.printf("%d ", node.data); // output node data
        preorderHelper(node.leftNode);       // traverse left subtree
        preorderHelper(node.rightNode);      // traverse right subtree
    } // end method preorderHelper

    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    } // end method inorderTraversal

    // recursive method to perform inorder traversal
    private void inorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderHelper(node.leftNode);        // traverse left subtree
        System.out.printf("%d ", node.data); // output node data
        inorderHelper(node.rightNode);       // traverse right subtree
    } // end method inorderHelper

    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    } // end method postorderTraversal

    // recursive method to perform postorder traversal
    private void postorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        postorderHelper(node.leftNode);      // traverse left subtree
        postorderHelper(node.rightNode);     // traverse right subtree
        System.out.printf("%d ", node.data); // output node data
    } // end method postorderHelper
} // end class Tree

