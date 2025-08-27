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
        String first = input.next();

        System.out.println("Enter Operator (+, -, *, /, % ) ");
        String Operator = input.next();   //connecting the variable with the switch case


        System.out.println("Enter Your Second Number🔢:");
        String second = input.next();

//        double result = 0;

//        because we used int and double in the polymorphism then we use if else statement
        if(first.contains(".") || second.contains(".")){     //The contains() method checks whether a string contains a sequence of characters.
            double a = Double.parseDouble(first);    //Double.parseDouble this ia a java built in method to convert String to double number
            double b = Double.parseDouble(second);
            double result = 0;
            switch(Operator){
                case "+":
                    result =  ConsoleCalculator.add ( a, b);
                    break;
                case "-":
                    result = ConsoleCalculator.subtract( a,b);
                    break;
                case "*":
                    result = ConsoleCalculator.multiply(a,b);
                    break;
                case "/":
                    result = ConsoleCalculator.divide(a,b);
//                    result = ConsoleCalculator.divide((double) a, (double) b);
                    break;
                case "%":
                    result = ConsoleCalculator.modulus(a,b);
                    break;
                default:
                    System.out.println("❌ Invalid operator entered!");
                  return;
            }
            }else{
            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);
            int result = 0;
            switch(Operator){
                case "+":
                    result =  ConsoleCalculator.add( a,  b);
                    break;
                case "-":
                    result = ConsoleCalculator.subtract(a,b);
                    break;
                case "*":
                    result = ConsoleCalculator.multiply(a,b);
                    break;
                case "/":
//                 result = ConsoleCalculator.divide(a,b);
                    // cast to double to avoid integer division
                    System.out.println("Result: " + ((double) a / b));     //this the only way i can do it for the divide
//                    int result1 = result;
                    break;
                case "%":
                    result = ConsoleCalculator.modulus(a,b);
                    break;
                default:
                    System.out.println("❌ Invalid operator entered!");
                    return;
            }
            System.out.println("Result: " + result);
        }



















    }

}
