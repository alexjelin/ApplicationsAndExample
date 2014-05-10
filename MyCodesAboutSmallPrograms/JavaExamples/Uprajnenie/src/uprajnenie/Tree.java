package uprajnenie;

class TreeNode {

    private TreeNode leftNode;
    private TreeNode rightNode;
    private int data;
    
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
    
    public int getData() {
        return data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public TreeNode(int nodeData) {
        this.data = nodeData;
        leftNode = rightNode = null;
    }
    
    public void insert(int nodeData) {
        if (nodeData < data) {
            if (leftNode == null) {
                leftNode = new TreeNode(nodeData);
            } else {
                leftNode.insert(nodeData);
            }
        } else if (nodeData > data) {
            if (rightNode == null) {
                rightNode = new TreeNode(nodeData);
            } else {
                rightNode.insert(nodeData);
            }            
        }
    }
}

public class Tree {

    private TreeNode root;
    
    public Tree() {
        this.root = null;
    }
    
    public void insertRoot(int root) {
        if (this.root == null) {
            this.root = new TreeNode(root);
        } else {
            this.root.insert(root);
        }
    }
    
    public void preorder(TreeNode node){
        if(node==null){
            return;
        }
        else{
            preorder(node.getLeftNode());
            preorder(node.getRightNode());
        }
    }
    
    public void inorder(TreeNode node)
    {
         if(node==null){
            return;
        }
        else{
            inorder(node.getLeftNode());
            inorder(node.getRightNode());
        }
    }
    
    public void postOrder(TreeNode node)
    {
         if(node==null){
            return;
        }
        else{
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
        }
    }   
}
