package com.java.main.ds;

import com.java.main.ds.stack.Stack;
import com.java.main.ds.tree.Tree;
import com.java.main.ds.tree.TreeNode;

import static com.java.main.utils.RandomUtils.randomInt;

public class DsMain{


    public static void main( String[] args ){
        final int MAX_SIZE=10;
        int[] test=new int[MAX_SIZE];

        System.out.println( "STACK DATA STRUCTURE" );

        Stack stack=new Stack( MAX_SIZE );
        System.out.println( stack.isFull( ) );
        System.out.println( stack.isEmpty( ) );
        System.out.println( stack.peek( ) );
        for ( int i=0 ; i<test.length ; i++ ) {
            test[i]=randomInt( );
        }
        for ( final int j: test ) {
            System.out.println( stack.push( j ) );
        }
        System.out.println( stack.pop( ) );

        System.out.println( "TREE DATA STRUCTURE" );
        Tree tree=new Tree( );
        TreeNode treeNode=null;
        tree.binarySearchTree( 5 );
        tree.binarySearchTree( 6 );
        treeNode=tree.binarySearchTree( 4 );
        System.out.print( "INORDER TRAVERSAL : " );
        tree.traverseInOrder( treeNode );
        System.out.print( "\n"+"POSTORDER TRAVERSAL : " );
        tree.traversePostOrder( treeNode );
        System.out.print( "\n"+"PREORDER TRAVERSAL : " );
        tree.traversePreOrder( treeNode );
        System.out.print( "\n"+"BFS TRAVERSAL : " );
        tree.printLevelOrder( treeNode );
    }
}
