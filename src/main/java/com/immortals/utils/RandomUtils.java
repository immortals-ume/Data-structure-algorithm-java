package main.java.com.immortals.utils;

import java.util.Random;

public class RandomUtils{

    private static final Random random=new Random( );

    public static int randomInt(){
        return random.nextInt( );
    }

    public static int[] randomIntArray( int size ){
        return new int[]{ randomInt() };
    }
}
