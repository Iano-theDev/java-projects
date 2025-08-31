package loops;
import java.util.*;
import java.lang.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int length  = getLength(num);
        isArmstrong(num, length);
    }

    public static int getLength(int num) {
        int count = 0;
        int temp;

        while (num != 0) {
            temp = num % 10;
            count++;
            num /= 10;
        }
        return count;
    }

    public static void isArmstrong(int num, int expo) {
        double sum = 0;
        int temp = num;
        int rem;
        boolean isArm = false;
        while (temp != 0 ) {
            rem = temp % 10;
            sum = Math.pow(Double.valueOf(rem), Double.valueOf(expo));
            temp /= 10;
        }
        isArm = (num == (int) sum);
        System.out.println("Its is " + isArm + " that " +  num + " is an Armstrong number");

    }
}
