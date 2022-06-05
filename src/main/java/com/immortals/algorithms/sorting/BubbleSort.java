package main.java.com.immortals.algorithms.sorting;

public class BubbleSort{


    private BubbleSort(){
        throw new IllegalArgumentException( );
    }


    private static void bubbleSort( int[] arr ){
        for ( int i=0 ; i<arr.length-1 ; i++ )
            for ( int j=0 ; j<arr.length-i-1 ; j++ )
                if ( arr[j]>arr[j+1] ) {
                    // swap arr[j+1] and arr[j]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
    }

    public static void bubbleSorted( int[] arr ){
        bubbleSort( arr );
        System.out.print( "Bubble Sort : " );
        for ( int i: arr ) {
            System.out.print( i+" " );
        }
    }
}
