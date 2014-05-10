package test2example;

import java.io.Serializable;

public class TreeNode<T> implements Serializable{

    protected TreeNode leftNode;
    protected TreeNode rightNode;
    private T data;

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode(T exampleData) {
        this.data = exampleData;
        leftNode = rightNode = null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s \n", data.toString()));
        return builder.toString();
    }

    public void insertObj(T obj) {
        if (obj.equals(this.data)) {
            if (leftNode == null) {
                leftNode = new TreeNode(obj);
            } else {
                leftNode.insertObj(obj);
            }
        } else {
            if (rightNode == null) {
                rightNode = new TreeNode(obj);
            } else {
                rightNode.insertObj(obj);
            }
        }
    }
}
