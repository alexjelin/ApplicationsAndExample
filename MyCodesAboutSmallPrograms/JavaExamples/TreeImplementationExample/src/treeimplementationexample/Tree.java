package treeimplementationexample;

public class Tree {
    
    private TreeNode root;
    private String name;
    
    public TreeNode getRoot() {
        return root;
    }
    
    public void setRoot(TreeNode root) throws IllegalAccessException {
        if (root != null) {
            this.root = root;
        } else {
            throw new IllegalAccessException("grymnah ye");
        }
    }
    
    public Tree() {
        name = "nzm si imeto";
        this.root = null;
    }
    
    public Tree(Car car) {
        root = new TreeNode(car);
    }
    
    public void insertNode(Car carNode) {
        if (root == null) {
            root = new TreeNode(carNode);
        } else {
            root.insertNode(carNode);
        }
    }
    
    public void inorderTraversal(TreeNode root) {
        if (this.root == null) {
            return;
        } else {
            System.out.println(String.format("%d \n", root.getData().getYear()));
            inorderTraversal(root.leftNode);
            inorderTraversal(root.rightNode);
        }
    }
}
