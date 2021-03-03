package src.Office_Hours.Practice_12_09_2020;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        student1.setInfo("Edrees", 25, 'M');
          //   student1.schoolName = "MIT";
              CybertekStudent.schoolName= "MIT";  // prefered way

        CybertekStudent student2 = new CybertekStudent();
        student2.setInfo("Liubov", 24, 'F');

        System.out.println(student1);
        System.out.println(student2);


    }

}
