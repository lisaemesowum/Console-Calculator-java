package ConsoleCalculator;

import java.util.Scanner;

import static ConsoleCalculator.ConsoleCalculator.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println(add(5,7));
//        System.out.println(subtract(58888,6669));
//        System.out.println(multiply(50,60));
//        System.out.println( divide(10 , 0));

//                                for the display
        System.out.println("*************************Console Calculator ***********************************");
//                                    Then the input area
//                    To display emoji in HP  press windows key and the ; -(semicolon key) together;
        System.out.println("Enter Your First Number🔢:");
        double a = input.nextDouble();

//                For choosing the operator
        System.out.println("Enter Operator: (+, -, *, /, % ) ");   //removed +/-
        //so this connect to the switch case
         String Operator = input.next();

        System.out.println("Enter Your Second Number🔢: ");
        double b = input.nextDouble();

        //now lets store the answer of the variable
        double result = 0;

//        lets use switch case
        // Call the methods from ConsoleCalculator
//        because we did not use the  main so do everything
        switch (Operator){
            case "+":
                result =  ConsoleCalculator.add(a,b);                  //so add both numbers and store it in the result variable
            break;
            case "-":
                result = ConsoleCalculator.subtract(a,b);
            break;
            case "*":
                result = ConsoleCalculator.multiply(a,b);
            break;
            case "/":
                result = ConsoleCalculator.divide(a,b);
            break;
            case "%":
                result = ConsoleCalculator.modulus(a,b);
            break;
//            case "+/-":     //new case for sign change
//                result  = ConsoleCalculator.changeSign(a);
//                break;
            default:
                System.out.println("invalid Operator! choose from these");
                return;
        }

        System.out.println("Result is : " + result);





















    }

}
