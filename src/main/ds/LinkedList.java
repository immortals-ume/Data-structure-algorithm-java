package main.ds;

public class LinkedList{

    public Node head;

    /* This function prints contents of linked list starting from head */
    public void printList(){
        Node node=head;
        while ( node!=null ) {
            System.out.print( node.data+" " );
            node=node.next;
        }
    }
}
