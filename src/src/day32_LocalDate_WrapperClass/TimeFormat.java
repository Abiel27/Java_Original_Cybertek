package src.day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

/*
LocalDate:
    year: yyyy
    month: MM (number), MMM(three letters of month), MMMM(full name)
    days: dd
    name of day: E(three letters) , EEEE (full name)

LocalTime:
    hours: hh
    minutes: mm
    seconds: ss
    am/pm: a

 */
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");

        LocalDate today = LocalDate.now();  //2020-11-23
        System.out.println(today);

        System.out.println(today.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime now = LocalTime.now();

        System.out.println(now);

        System.out.println(  now.format(tf) );

        LocalTime t1 = LocalTime.of(23, 35, 55);
        System.out.println(t1);
        System.out.println(t1.format(tf));

        //

        // Monday, 12:40 PM,  Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

        LocalDateTime dt1 = LocalDateTime.now();

        System.out.println(dt1);
        System.out.println(dt1.format(dtf));


        // task:

        LocalDate tomorrow =  LocalDate.of(2020, 11, 24);
        System.out.println(tomorrow.format(df));

        boolean r1 = today.isBefore(tomorrow); // true
        boolean r2 = today.isAfter(tomorrow);  // false

        System.out.println(r1);
        System.out.println(r2);

        // calculate the age
                        // 2020-11-23      2020
        int currentYear = LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(2000, 5, 19);

        int age = currentYear - DofB.getYear();

        System.out.println(age);

        System.out.println(DofB.plusDays(10));

        LocalDate rightNow = LocalDate.now();

        LocalDate holidayBreak = rightNow.plusDays(2);

        System.out.println(holidayBreak);


        LocalTime time = LocalTime.now();
        LocalTime lunchBreak = time.plusMinutes(15);

        System.out.println(lunchBreak.format(tf));

        System.out.println("===============================================");

        LocalTime classStarts = LocalTime.of(10, 0);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println(firstBreak);

        LocalTime secondBreak = firstBreak.plusHours(1);
        System.out.println(secondBreak);

        LocalTime thirdBreak = secondBreak.plusHours(1).plusMinutes(15);
        System.out.println(thirdBreak);

        LocalTime afternoonClass = thirdBreak.plusHours(1).plusMinutes(15);
        System.out.println("Come back at: "+afternoonClass.format(tf));



    }


}
