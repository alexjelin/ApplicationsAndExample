package treeimplementationexample;

public class TreeNode {

    protected TreeNode leftNode;
    protected TreeNode rightNode;
    private Car data;

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public Car getData() {
        return data;
    }

    public void setData(Car data) {
        this.data = data;
    }

    public TreeNode(Car data) {
        setData(data);
        rightNode = leftNode = null;
    }

    public void insertNode(Car car) {
        if (data.compareTo(car) > 0) {
            if (leftNode == null) {
                leftNode = new TreeNode(car);
            } else {
                leftNode.insertNode(car);
            }

            if (data.compareTo(car) < 0) {
                if (rightNode == null) {
                    rightNode = new TreeNode(car);
                } else {
                    rightNode.insertNode(car);
                }
            }
        }
    }

    public void print() {
        System.out.println(String.format("Year %d \n", data.getYear()));
    }
}
