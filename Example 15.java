import java.util.Scanner;

public class GradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better try again.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

         }
}
