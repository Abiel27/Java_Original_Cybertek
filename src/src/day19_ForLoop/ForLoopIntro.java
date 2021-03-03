package src.day19_ForLoop;

/*
for( initialization; Condition ; Iterator){
					statements;
		}
 */
public class ForLoopIntro {

    public static void main(String[] args) {


        for(int i =1;  i <= 10;  i++ ){
            System.out.println("hello");

        }

        System.out.println("======================================");

        String name = "Cybertek School";

        for(int i =5; i > 0 ; i-- ){ // i: 5, 4, 3, 2, 1, 0
            System.out.println(name); // 1, 2, 3, 4, 5
        }


        System.out.println("Hello Batch 21");

    }

}
