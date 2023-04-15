
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 9, 2023
* MacOS 13.2
*/
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysAwayDaigh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
//        	 prompts user for day and month of birth
        		System.out.println("Enter your birth month as a number (1-12)");
             int userMonth = in.nextInt();
             System.out.println("Enter the day you were born");
             int userBirthDay = in.nextInt(); 
//             gets the birthday
             LocalDate birthday = LocalDate.of(LocalDate.now().getYear(), userMonth, userBirthDay);
//             calls method and prints results
             int calculateDays = calculateDaysUntilBirthday(birthday);
             System.out.println("There are " + calculateDays + "until your next birthday");
         } 
        catch(InputMismatchException e) {
        	System.out.println("Error, Invalid input. please enter the month and day as numbers");
        }
    }

    public static int calculateDaysUntilBirthday(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthday.withYear(today.getYear());
        
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        int days = 0;
        while (today.isBefore(nextBirthday)) {
            days++;
            today = today.plusDays(1);
        }

        return days;
    }
}


