package main.java.com.immortals.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree{


    private TreeNode root;

    private TreeNode createTree( TreeNode current,int data ){

        if ( current==null ) {
            return new TreeNode( data );
        }
        if ( data<=current.data ) {
            current.left=createTree( current.left,data );
        }
        if ( data>=current.data ) {
            current.right=createTree( current.right,data );
        }
        return current;
    }

    public TreeNode binarySearchTree( int data ){
        root=createTree( root,data );
        return root;
    }

    public void traverseInOrder( TreeNode node ){

        if ( node!=null ) {
            traverseInOrder( node.left );
            visit( node );
            traverseInOrder( node.right );
        }
    }

    private void visit( TreeNode node ){
        System.out.print( " "+node.data );
    }

    public void traversePreOrder( TreeNode node ){

        if ( node!=null ) {
            visit( node );
            traversePreOrder( node.left );
            traversePreOrder( node.right );
        }
    }

    public void traversePostOrder( TreeNode node ){

        if ( node!=null ) {
            traversePostOrder( node.left );
            traversePostOrder( node.right );
            visit( node );
        }
    }

    /**
     * BFS Implementation On a Tree
     */
    public void bfs( TreeNode root ){
        Queue< TreeNode > queue=new LinkedList<>( );
        queue.add( root );
        while ( !queue.isEmpty( ) ) {
            TreeNode tempNode=queue.poll( );
            System.out.print( tempNode.data+" " );
            if ( tempNode.left!=null ) {
                queue.add( tempNode.left );
            }
            if ( tempNode.right!=null ) {
                queue.add( tempNode.right );
            }
        }
    }

    /**
     * Searching a element in BST , recursive approach
     */
    public boolean searchElementUsingRecursion( TreeNode node,int key ){
        boolean response;
        if ( node==null )
            return false;

        if ( key==node.data ) {
            return true;
        }
        if ( key<node.data ) {
            response=searchElementUsingRecursion( node.left,key );
        } else {
            response=searchElementUsingRecursion( node.right,key );
        }
        return response;
    }


    public TreeNode searchElementUsingIterativeApproach( TreeNode node,int key ){
        while ( node!=null&&key!=node.data ) {
            if ( key<node.data ) {
                node=node.left;
            } else {
                node=node.right;
            }
        }
        return node;
    }

    public int minimumTree( TreeNode node ){
        if ( node==null ) {
            return Integer.MIN_VALUE;
        }
        while ( node.left!=null ) {
            node=node.left;
        }
        return node.data;
    }

    public int maximumTree( TreeNode node ){
        if ( node==null ) {
            return Integer.MIN_VALUE;
        }
        while ( node.right!=null ) {
            node=node.right;
        }
        return node.data;
    }
}
