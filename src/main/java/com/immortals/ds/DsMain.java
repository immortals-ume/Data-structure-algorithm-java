package main.java.com.immortals.ds;

import main.java.com.immortals.ds.tree.Tree;
import main.java.com.immortals.ds.tree.TreeNode;

public class DsMain{


    public static void main( String[] args ){
        System.out.println( "TREE DATA STRUCTURE" );

        Tree tree=new Tree( );
        TreeNode treeNode=null;
        tree.binarySearchTree( 52 );
        tree.binarySearchTree( 63 );
        tree.binarySearchTree( 44 );
        tree.binarySearchTree( 46 );
        tree.binarySearchTree( 40 );
        treeNode=tree.binarySearchTree( 42 );

        System.out.print( "INORDER TRAVERSAL : " );
        tree.traverseInOrder( treeNode );
        System.out.print( "\n"+"POSTORDER TRAVERSAL : " );
        tree.traversePostOrder( treeNode );
        System.out.print( "\n"+"PREORDER TRAVERSAL : " );
        tree.traversePreOrder( treeNode );

        System.out.print( "\n"+"BFS TRAVERSAL  : " );
        tree.bfs( treeNode );

        System.out.print( "\n"+"Minimum of BST : " );
        System.out.print( tree.findMinimum( treeNode ) );

        System.out.print( "\n"+"Maximum of BST : " );
        System.out.print( tree.findMaximum( treeNode ) );

        System.out.print( "\n"+"Successor in BST: " );
        System.out.print( tree.findSuccessor( treeNode ) );

        System.out.print( "\n"+"Predecessor in BST: " );
        System.out.print( tree.findPredecessor( treeNode ) );

        System.out.print( "\n"+"Searching an element in BST Recursively  : " );
        System.out.print( tree.searchElementUsingRecursion( treeNode,30 ) );

        System.out.print( "\n"+"Searching an element in BST Recursively : " );
        System.out.print( tree.searchElementUsingRecursion( treeNode,42 ) );

        System.out.print( "\n"+"Searching an element in BST Iteratively: " );
        final TreeNode treeNode1=tree.searchElementUsingIterativeApproach( treeNode,6 );
        if ( treeNode1!=null ) {
            System.out.print( "true" );
        } else {
            System.out.print( "false" );
        }

        System.out.print( "\n"+"Searching an element in BST Iteratively: " );
        treeNode=tree.searchElementUsingIterativeApproach( treeNode,40 );
        if ( treeNode!=null ) {
            System.out.print( "true" );
        } else {
            System.out.print( "false" );
        }


    }
}
