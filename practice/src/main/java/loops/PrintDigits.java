package loops;
import java.util.*;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp;

        System.out.println("The number " + num + " contains digits: ");

        while(num != 0) {
            temp = num  % 10;
            System.out.println(temp);
            num /= 10;
        }
    }
}
