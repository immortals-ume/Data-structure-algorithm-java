package com.java.main.ds.linkedlist;

public class LinkedList{

    public Node head;

    public void printList(){
        Node node=head;
        while ( node!=null ) {
            System.out.print( node.data+" " );
            node=node.next;
        }
    }
}
