package main.ds;

import main.ds.tree.Tree;

import static main.utils.RandomUtils.randomInt;

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

    }
}
