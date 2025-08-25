package ConsoleCalculator;


import java.util.Scanner;

public class ConsoleCalculator {
    Scanner scan = new Scanner(System.in);

    //first
//    the add method
    public static int add (int a , int b){
        return a + b;
//        System.out.println(4,5);
    }


//    the subtract method
    public static int subtract(int a , int b){
        return a - b;
    }

//    the multiplication method
    public static int multiply(int a , int b){
        return a * b;
    }

//    the division
    //divide method doesn't check for division by zero, which will cause an ArithmeticException
    public static double divide(double a , double b){
//        return a / b;
        if(b == 0){
            System.out.println("Error: Underfined");
            return 0;
        }
        return a /b;
    }


}
