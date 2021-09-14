import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int fact = 1;
        for (int i=1; i<=x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double sum = 0;
        for (int i=1; i<=1000; i++){   //(sum==Math.E-0.0001 || sum==Math.E+0.0001)
            double e = (1/factorial(i));
            sum+=e;
            if (e == 0){
                break;
            }
        }
        return sum;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = x;
        double m = 1;
        //double div = x/n;     // I dont get what this div does becuase did not work when i tried it.
        while (n-m > 0.00001){
            n = (n+m)/2;
            m = x/n;
        }


        return n;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        double inputdouble = scan.nextDouble();
        System.out.println("The squareroot of " + inputdouble + " is: " + babylonian(inputdouble));
        System.out.println("The value of e is roughly: " + calculateE());

        scan.close();
    }
}
