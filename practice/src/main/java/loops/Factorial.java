package loops;
import java.lang.*;

public class Factorial {
    public static void main(String[] args) {
        // get the number from the args, parse to int and store in a variable
        // confirm that the input is a valid integer
        if (args.length == 1) {
            int num = Integer.parseInt(args[0]);
            // loop while decrementing till we get to 1
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of: " + num + " = " + factorial);
        } else {
            System.out.println("Invalid Arguments, Closing Program.");
        }
    }
}
