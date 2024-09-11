import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        
        double area = length * width;

     
        System.out.println("\n Area of the rectangle with length " + length + " and width  " + width + " is! " + area);

    
    }
}
