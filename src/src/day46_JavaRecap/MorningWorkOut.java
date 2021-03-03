package src.day46_JavaRecap;

public class MorningWorkOut {

    public static void main(String[] args) {

        for(int i = 1; i <= 30; i++) {
            System.out.println("Push Up "+i);
            sleep(1.5);
        }

        System.out.println("============================");

        for(int i = 1; i <= 20; i++){
            System.out.println("Pull Up "+i);
            sleep(2.5);
        }


    }


    public static void sleep(double seconds){ // 2.5

        try {
            // (long) (2500.0)
            Thread.sleep((long) (seconds * 1000));
        }catch (InterruptedException e){

        }

    }

}

/*
MorningWorkOut:
		1. Do 30 push ups
				try pausing 1.5 seconds in each

		2. Do 20 Pull up
				try pausing 2.5 seconds in each
 */
