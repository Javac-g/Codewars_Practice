package BinaryTree;

public class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(Node l, Node r, int v) {
        left = l;
        right = r;
        value = v;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public int getValue(){
        return value;
    }
}