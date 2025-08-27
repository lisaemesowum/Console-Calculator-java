package ConsoleCalculator;


// so i will use compile-time polymorphism because Each operation can work with different types of numbers
// after i learnt polymorphism

import java.util.Scanner;

public class ConsoleCalculator {
    Scanner scan = new Scanner(System.in);

    //first
//    the add method
    // Overloaded methods for addition
    public static int  add (int  a , int  b){
        return a + b;
//        System.out.println(4,5);
    }
    public  static double add(double a, double b) {
        return a + b;
    }


    // Overloaded methods for subtraction
    public static int   subtract(int  a , int  b){
        return a - b;
    }
    public static  double subtract(double a, double b) {
        return a - b;
    }


    // Overloaded methods for multiplication
    public  static int multiply(int a, int b) {
        return a * b;
    }

    public static double  multiply(double  a , double  b){
        return a * b;
    }


    // Overloaded methods for division
    //    the division
    //divide method doesn't check for division by zero, which will cause an ArithmeticException
    public static int divide(int a , int b){
        if(b == 0){
            System.out.println("Error: Undefined");
            return 0;
        }
        return a / b;
    }

    public static double divide(double a , double b){
        if(b == 0){
            System.out.println("Error: Underfined");
            return 0;
        }
        return a /b;
    }

    // Overloaded methods for modulus
    //    modulus operator   % meaning “remainder.” in real calculator
//    It returns the remainder of a division operation between two numbers.
    public static int modulus(int a , int b){
//        return a / b;
        if(b == 0){
            System.out.println("Error: Undefined");
            return 0;
        }
        return a % b;
    }
    public static double modulus(double a , double b){
//        return a / b;
        if(b == 0){
            System.out.println("Error: Undefined");
            return 0;
        }
        return a % b;
    }

    // Overloaded methods for changeSign
    //real calculator we have changeSign +/-
    //only take one parameter and just flip its sign
//    public static int changeSign(int a) {
//        return -a;
//    }
//    public static double  changeSign(double  a ){
//        return -a;
//    }


}
