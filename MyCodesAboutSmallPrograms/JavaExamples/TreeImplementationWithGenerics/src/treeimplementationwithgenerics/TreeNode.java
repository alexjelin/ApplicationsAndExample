package treeimplementationwithgenerics;

public class TreeNode<E extends Comparable<? super E>> {

    protected TreeNode<E> leftNode;
    protected TreeNode<E> rightNode;
    protected E data;

    public TreeNode<E> getLeftNode() {
        return leftNode;
    }

    public TreeNode<E> getRightNode() {
        return rightNode;
    }

    public E getData() {
        return data;
    }

    public TreeNode(E example) {
        data = example;
        leftNode = rightNode = null;
    }

    public void insert(E value) {
        if (value.compareTo(data) < 0) {
            if (leftNode == null) {
                leftNode = new TreeNode<E>(value);
            } else {
                leftNode.insert(value);
            }
        }

        if (value.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new TreeNode<E>(value);
            } else {
                rightNode.insert(value);
            }
        }
    }

    public void printNode() {
        System.out.println(String.format("%s", data));
    }
}
