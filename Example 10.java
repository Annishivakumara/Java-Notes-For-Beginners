import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the coordinates
        System.out.print("Enter the x-coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate: ");
        double y = scanner.nextDouble();

        // Determine the quadrant
        if (x > 0 && y > 0)
         {
            System.out.println("The point (" + x + ", " + y + ") is in the First Quadrant.");
        } 
            else if (x < 0 && y > 0){
            System.out.println("The point (" + x + ", " + y + ") is in the Second Quadrant.");
        }
           else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the Third Quadrant.");
        }
          else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the Fourth Quadrant.");
        }
          else if (x == 0 && y != 0) {
            System.out.println("The point (" + x + ", " + y + ") is on the y-axis.");
        }
         else if (x != 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") is on the x-axis.");
        }
        else {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        }

        
    }
}
