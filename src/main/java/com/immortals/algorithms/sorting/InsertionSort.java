package main.java.com.immortals.algorithms.sorting;

public class InsertionSort{


    private InsertionSort(){
        throw new IllegalArgumentException( );
    }


    public static void insertionSorted( int[] arr ){
        insertionSort( arr );
        System.out.print( "Insertion Sort : " );
        for ( int i: arr ) {
            System.out.print( i+" " );
        }
    }

    /* Move elements of arr[0..i-1], that are
              greater than key, to one position ahead
              of their current position */
    private static void insertionSort( int[] arr ){
        for ( int i=1 ; i<arr.length ; ++i ) {
            int key=arr[i];
            int j=i-1;
            while ( j>=0&&arr[j]>key ) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}
