import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int n = number;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        
        System.out.println("Sum of digits of " + number + " is " + sum);
        
      
    }
}
