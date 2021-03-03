package src.day45_Exceptions;

public class LunchBreakException  extends RuntimeException{

    public LunchBreakException(){
        super("It's time for lunch");
    }

    public LunchBreakException(String msg){
        super(msg);
    }

}
