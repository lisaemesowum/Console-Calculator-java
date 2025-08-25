package ConsoleCalculator;

import java.util.Scanner;

public class SwitchCase {
    //switch case is just like a menu, you want to select from
    //is a control statement that lets you execute one block of code out of many options, based on the value of a variable or expression.

    //lets show example how to create a switch
    //lets create for Day



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        switch case for a day
//        so you choose a data type you want

//        your own input

        System.out.println("Enter a number (1-7) for the day of the week: ");
//        String day = "Monday";
        int day  = input.nextInt();
//        switch case
        switch (day){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
             break;
            case 3:
                System.out.println("Wednesday");
            break;
            case 4:
                System.out.println("Thursday");
            break;
            case 5:
                System.out.println("Friday");
            break;
            case 6:
                System.out.println("Saturday");
            break;
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("Invalid day number!");
        }



    }

}

