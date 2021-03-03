package src.day45_Exceptions;

import java.time.LocalTime;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("Time for 15 minutes of break!");
    }

    public BreakTimeException(String msg){
        super(msg);
    }

}


class Test{
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        if(currentTime.equals( LocalTime.of(10, 45) )){
            throw new BreakTimeException();
        }else if(currentTime.equals(LocalTime.of(11,45))){
            throw new BreakTimeException();
        }

    }
}