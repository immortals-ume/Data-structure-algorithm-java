package main.java.com.immortals.ds.tree;

/**
 * Represents A Binary Tree Node
 */
public class TreeNode{


    public final int data;

    public TreeNode left;

    public TreeNode right;

    public TreeNode parent;

    public TreeNode( int data ){
        this.data=data;
        left=null;
        right=null;
        parent=null;
    }
}
