package main.ds;

public class StackUnderFlowError extends RuntimeException{

    public StackUnderFlowError( String message ){
        super( message );
    }
}
