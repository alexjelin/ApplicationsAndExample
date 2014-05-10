package treeimplementationwithgenerics;

public class Tree<E extends Comparable<? super E>> {

    protected TreeNode<E> root;

    public Tree(E data) {
        this.root = new TreeNode<E>(data);
    }

    public Tree() {
        this.root = null;
    }

    public void insertNode(E data) {
        if (this.root == null) {
            root = new TreeNode<E>(data);
        } else {
            root.insert(data);
        }
    }

    public void preorderTraveral(TreeNode<E> root) {
        if (root == null) {
            return;
        }

        root.printNode();
        preorderTraveral(root.leftNode);
        preorderTraveral(root.rightNode);
    }

    public void innorderTraveral(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        preorderTraveral(root.leftNode);
        root.printNode();
        preorderTraveral(root.rightNode);
    }
}
