package loops;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num  = sc.nextInt();
        int temp;
        int sum = 0;
        while(num != 0)
        {
            temp = num % 10;
            sum += temp;
            num /= 10;
        }
        System.out.println("Total sum of digits is: " + sum);
    }
}
