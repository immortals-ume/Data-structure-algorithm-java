package main.ds;

/**
 * Implements Stack Data Structure
 * LIFO last in first out
 */
public class Stack{

    private final int[] arr;

    private final int size;

    private int top;

    //Args Constructor
    public Stack( int size ){
        arr=new int[size];
        this.size=size;
        top=-1;
    }

    /**
     * To check whether the stack is empty or not
     *
     * @return true if empty otherwise false
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * to check whether the stack is full or not
     *
     * @return true if full otherwise false
     */
    public boolean isFull(){
        return top==size-1;
    }

    /**
     * @return value of the top most element of the stack without deleting that element from the stack
     */
    public int peek(){
        int element=0;
        if ( isEmpty( ) ) {
            throw new StackUnderFlowError( "stack is empty" );
        } else {
            element=findElementAt( size-1 );
        }
        return element;
    }

    private int calculateElementCount(){
        return arr.length;
    }

    private int findElementAt( int i ){

        int elementData;
        if ( i>calculateElementCount( ) ) {
            throw new ArrayIndexOutOfBoundsException( "array index is out of bound exception occurred" );
        } else {
            elementData=arr[i];
        }
        return elementData;
    }

    public boolean push( int data ){
        if ( isFull( ) ) {
            throw new StackOverflowError( "stack is full" );
        } else {
            arr[++top]=data;
        }
        return true;
    }

    public int pop(){
        if ( isEmpty( ) ) {
            throw new StackUnderFlowError( "no element to pop!" );
        }
        return arr[top--];
    }
}
