package ConsoleCalculator;


import java.util.Scanner;

public class ConsoleCalculator {
    Scanner scan = new Scanner(System.in);

    //first
//    the add method
    public static double add (double  a , double  b){
        return a + b;
//        System.out.println(4,5);
    }


//    the subtract method
    public static double  subtract(double  a , double  b){
        return a - b;
    }

//    the multiplication method
    public static double  multiply(double  a , double  b){
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
//    modulus operator   % meaning “remainder.” in real calculator
//    It returns the remainder of a division operation between two numbers.
     public static double modulus(double a , double b){
//        return a / b;
    if(b == 0){
        System.out.println("Error: Underfined");
        return 0;
    }
    return a % b;
}
//real calculator we have changeSign +/-
    //only take one parameter and just flip its sign
public static double  changeSign(double  a , double  b){
    return -a;
}

}
