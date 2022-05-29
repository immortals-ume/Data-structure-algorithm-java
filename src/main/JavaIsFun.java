package main;

import main.algorithms.searching.BinarySearch;
import main.algorithms.searching.LinearSearch;
import main.algorithms.sorting.BubbleSort;
import main.ds.Stack;

import static main.utils.RandomUtils.randomInt;



public class JavaIsFun{


    public static void main( String[] args ){

        BinarySearch.searchElement( new int[]{ 3,4,5,24,2,42,2442,432 },24 );
        BinarySearch.searchElement( new int[]{ 3,4,5,24,2,42,2442,432 },0,
                new int[]{ 3,4,5,24,2,42,2442,432 }.length-1,32 );

        LinearSearch.searchElement( new int[]{ 3,4,5,24,2,42,2442,432 },24 );

        BubbleSort.bubbleSorted( new int[]{ 64,23,143,94,132,387,284,2763 } );

        Stack stack = new Stack(randomInt());
        stack.push( randomInt() );
        stack.pop();
        stack.peek();
        stack.isEmpty();
        stack.isFull();
    }
}
