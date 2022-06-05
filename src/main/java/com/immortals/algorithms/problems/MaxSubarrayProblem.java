package main.java.com.immortals.algorithms.problems;

/**
 * The Maximum Subarray Problem using
 * 1. Divide And Conquer Technique -> StackOverflow wtf....
 * <p>
 * 2. kadane Algorithm
 */
public class MaxSubarrayProblem{


    private MaxSubarrayProblem(){
        throw new IllegalArgumentException( );
    }

    public static void maxSubarrayProblemDivideAndConquer( int[] arr,int low,int high ){
        System.out.print( maxSubarrayProblem( arr,low,high ) );

    }

    public static void maxSubarrayProblemKadaneAlgorithm( int[] arr ){

        System.out.print( "Maximum Subarray : "+maxSubarray( arr ) );
    }

    private static int maxSubarray( int[] arr ){
        int size=arr.length;
        int maxSoFar=Integer.MIN_VALUE;
        int maxEndingHere=0;

        for ( int i=0 ; i<size ; i++ ) {
            maxEndingHere=maxEndingHere+arr[i];
            if ( maxSoFar<maxEndingHere )
                maxSoFar=maxEndingHere;
            if ( maxEndingHere<0 )
                maxEndingHere=0;
        }
        return maxSoFar;
    }

    private static int maxSubarrayProblem( int[] arr,int low,int high ){
        int maxSubarray;
        int mid=(low+high/2);
        if ( low==high ) {
            maxSubarray=arr[low];
        } else {
            int maxLeftRight=Integer.max( maxSubarrayProblem( arr,low,mid ),maxSubarrayProblem( arr,mid+1,high ) );
            maxSubarray=Integer.max( maxLeftRight,
                    findMaxCrossingSubarray( arr,low,mid,high ) );
        }
        return maxSubarray;
    }

    private static int findMaxCrossingSubarray( int[] arr,int low,int mid,int high ){
        int leftSum=Integer.MIN_VALUE;
        int sum=0;
        for ( int i=mid ; i>=low ; i-- ) {
            sum=sum+arr[i];
            if ( sum>leftSum ) {
                leftSum=sum;
            }
        }
        sum=0;
        int rightSum=Integer.MIN_VALUE;
        for ( int i=mid+1 ; i<=high ; i++ ) {
            sum=sum+arr[i];
            if ( sum>rightSum )
                rightSum=sum;
        }
        return Integer.max( leftSum+rightSum,
                Integer.max( leftSum,rightSum ) );
    }


}
