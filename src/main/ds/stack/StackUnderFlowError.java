package main.ds.stack;

public class StackUnderFlowError extends RuntimeException{

    public StackUnderFlowError( String message ){
        super( message );
    }
}
