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
        double a = input.nextInt();   

        System.out.println("Enter Operator (+, -, *, /, % ) ");
        String Operator = input.next();   //connecting the variable with the switch case


        System.out.println("Enter Your Second Number🔢:");
        double b = input.nextInt();

        double result = 0;

//        switch case
        switch(Operator){
            case "+":
                result =  ConsoleCalculator.add(a , b);
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
            default:
                System.out.println("❌ Invalid operator entered!");
        }
        System.out.println("Result: " + result);























    }

}
