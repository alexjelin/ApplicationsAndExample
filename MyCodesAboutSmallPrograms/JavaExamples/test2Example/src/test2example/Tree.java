package test2example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Tree<T>  implements Serializable{

    public TreeNode<T> root;

    public Tree() {
        this.root = null;
    }

    public boolean isEmpty() {
        if (root == null) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(T Obj) {
        if (root == null) {
            root = new TreeNode<T>(Obj);
        } else {
            this.root.insertObj(Obj);
        }
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

    public void writeToFile(String FileNama) throws IOException {
            File f = new File(FileNama);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
            out.writeObject(root);
    }
      
    public int getSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSize(node.leftNode) + getSize(node.rightNode);
    }

    public int getSize1() {
        return getSize(root);
    }
    
    public void getPostOrderMethod(){
        this.postorder(root);
    }
    public void postorder(TreeNode<T> node){
        if(node==null){
            return;
        }
        postorder(node.leftNode);
        postorder(node.rightNode);
        System.out.printf("%s \n", node.getData());
    }
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        Tree<Integer> testTree=new Tree<>();
        testTree.insert(5);
        testTree.insert(8);
        testTree.insert(88);
        testTree.insert(785);
       int size=testTree.getSize(testTree.root);
       System.out.printf("%d \n",size);
       testTree.getPostOrderMethod();
       int depth=testTree.getDepht(testTree.root, 1, -1);
        System.out.printf("%d \n",depth);
        testTree.writeToFile("txt.txt");
        testTree.readToFile("txt.txt");
    }

}
