import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Declares variables
        int optionChoice;
        double valueOne, valueTwo, calculationResult;

        // Prompts to input values
        System.out.print("Enter first operand : ");
        valueOne = scnr.nextDouble();
        System.out.print("Enter second operand : ");
        valueTwo = scnr.nextDouble();

        // Calculator menu screen appears
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Input operation choice
        System.out.println("Which operation do you want to perform?");
        optionChoice = scnr.nextInt();

        // Calculation result outputs based on operation choice
        switch (optionChoice){
            case 1: calculationResult = valueOne + valueTwo; // Outputs first number plus second number
                System.out.println("The result of the operation is " +
                                    calculationResult + ". Goodbye!");
                break;
            case 2: calculationResult = valueOne - valueTwo; // Outputs first number minus second number
                System.out.println("The result of the operation is " +
                                    calculationResult + ". Goodbye!");
                break;
            case 3: calculationResult = valueOne * valueTwo; // Outputs first number times second number
                System.out.println("The result of the operation is " +
                                    calculationResult + ". Goodbye!");
                break;
            case 4: calculationResult = valueOne / valueTwo; // Outputs first number divided by second number
                System.out.println("The result of the operation is " +
                                    calculationResult + ". Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid selection! Terminating program.");
        }

    }
}
