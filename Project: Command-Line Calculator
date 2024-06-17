Project: Command-Line Calculator
public class Calculator {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <operation> <operand1> <operand2>");
            return;
        }

        String operation = args[0];
        double operand1 = Double.parseDouble(args[1]);
        double operand2 = Double.parseDouble(args[2]);
        
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + add(operand1, operand2));
                break;
            case "subtract":
                System.out.println("Result: " + subtract(operand1, operand2));
                break;
            case "multiply":
                System.out.println("Result: " + multiply(operand1, operand2));
                break;
            case "divide":
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result: " + divide(operand1, operand2));
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
