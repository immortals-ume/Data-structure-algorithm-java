package main.java.com.immortals.ds;

import main.java.com.immortals.ds.tree.BinarySearchTree;
import main.java.com.immortals.ds.tree.TreeNode;

/**
 * @author immortals-ume
 */
public class DsMain{


    public static void main( String[] args ){
        System.out.println( "TREE DATA STRUCTURE" );

        BinarySearchTree binarySearchTree=new BinarySearchTree( );
        TreeNode treeNode=null;
        binarySearchTree.binarySearchTree( 52 );
        binarySearchTree.binarySearchTree( 63 );
        binarySearchTree.binarySearchTree( 44 );
        binarySearchTree.binarySearchTree( 46 );
        binarySearchTree.binarySearchTree( 40 );
        treeNode=binarySearchTree.binarySearchTree( 42 );

        System.out.print( "INORDER TRAVERSAL :" );
        binarySearchTree.traverseInOrder( treeNode );
        System.out.print( "\n"+"POSTORDER TRAVERSAL :" );
        binarySearchTree.traversePostOrder( treeNode );
        System.out.print( "\n"+"PREORDER TRAVERSAL :" );
        binarySearchTree.traversePreOrder( treeNode );

        System.out.print( "\n"+"BFS TRAVERSAL  :" );
        binarySearchTree.bfs( treeNode );

        System.out.print( "\n"+"Minimum of BST :" );
        System.out.print( binarySearchTree.findMinimum( treeNode ) );

        System.out.print( "\n"+"Maximum of BST :" );
        System.out.print( binarySearchTree.findMaximum( treeNode ) );

        System.out.print( "\n"+"Successor in BST :" );
        System.out.print( binarySearchTree.findSuccessor( treeNode ) );

        System.out.print( "\n"+"Predecessor in BST :" );
        System.out.print( binarySearchTree.findPredecessor( treeNode ) );

        System.out.print( "\n"+"Searching an element in BST Recursively  :" );
        System.out.print( binarySearchTree.searchElementUsingRecursion( treeNode,30 ) );

        System.out.print( "\n"+"Searching an element in BST Recursively :" );
        System.out.print( binarySearchTree.searchElementUsingRecursion( treeNode,42 ) );

        System.out.print( "\n"+"Searching an element in BST Iteratively :" );
        final TreeNode treeNode1=binarySearchTree.searchElementUsingIterativeApproach( treeNode,6 );
        if ( treeNode1!=null ) {
            System.out.print( "true" );
        } else {
            System.out.print( "false" );
        }

        System.out.print( "\n"+"Searching an element in BST Iteratively :" );
        final TreeNode treeNode2=binarySearchTree.searchElementUsingIterativeApproach( treeNode,40 );
        if ( treeNode2!=null ) {
            System.out.print( "true" );
        } else {
            System.out.print( "false" );
        }

        System.out.print( "\n"+"Insert a element into TREE  :" );
        binarySearchTree.insert( treeNode,32 );
        binarySearchTree.insert( treeNode,102 );
        binarySearchTree.traverseInOrder( treeNode );

        System.out.print( "\n"+"Delete a element into TREE  :" );
        binarySearchTree.deleteNode( treeNode,32 );
        binarySearchTree.traverseInOrder( treeNode );

        System.out.print( "\n"+"Height of TREE  : " );
        System.out.print( binarySearchTree.height( treeNode ) );
    }
}
