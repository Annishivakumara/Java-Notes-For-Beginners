import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int n = number;// for garbage value  collection
        do {
            sum =sum+n % 10;
            n /= 10;
        } while (n != 0);
        
        System.out.println("Sum of digits of " + number + " is " + sum);
        
      
    }
}
