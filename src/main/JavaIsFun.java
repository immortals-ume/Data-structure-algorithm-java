package main;

import main.algorithms.problems.MaxSubarrayProblem;
import main.algorithms.problems.StrassenMatrixMultiplication;
import main.algorithms.searching.BinarySearch;
import main.algorithms.searching.LinearSearch;
import main.algorithms.sorting.BubbleSort;
import main.algorithms.sorting.InsertionSort;



public class JavaIsFun{


    public static void main( String[] args ){


        BinarySearch.searchElement( new int[]{ 3,4,5,24,2,42,2442,432 },24 );

        BinarySearch.searchElement( new int[]{ 3,4,5,24,2,42,2442,432 },0,
                new int[]{ 3,4,5,24,2,42,2442,432 }.length-1,32 );

        LinearSearch.searchElement( new int[]{ 3,4,5,24,2,42,2442,432 },24 );

        System.out.println( " " );

        BubbleSort.bubbleSorted( new int[]{ 64,23,143,94,132,387,284,2763 } );

        System.out.println( " " );

        InsertionSort.insertionSorted( new int[]{ 64,23,143,94,132,387,284,2763 } );

        System.out.println( " " );

        //MaxSubarrayProblem.maxSubarrayProblemDivideAndConquer( new int[]{ 64,23,143,94},0,new int[]{ 64,23,143,94}
        // .length-1 ); // Stack Overflow Error Needs to be Checked

        MaxSubarrayProblem.maxSubarrayProblemKadaneAlgorithm( new int[]{ 64,23,143,94,-93,203,-436 } );

        System.out.println( " " );

        StrassenMatrixMultiplication.multiply2DArrays( new int[][]{ { 1,2,3,4 },
                { 4,3,0,1 },
                { 5,6,1,1 },
                { 0,2,5,6 } },new int[][]{ { 1,0,5,1 },
                { 1,2,0,2 },
                { 0,3,2,3 },
                { 1,2,1,2 } } );


    }
}
