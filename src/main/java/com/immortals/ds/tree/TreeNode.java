package main.java.com.immortals.ds.tree;

/**
 * @author immortals-ume
 */
public class TreeNode{


    public int data;

    public TreeNode left;

    public TreeNode right;

    public TreeNode parent;

    public TreeNode(){}


    public TreeNode( int data ){
        this.data=data;
        left=null;
        right=null;
        parent=null;
    }
}
