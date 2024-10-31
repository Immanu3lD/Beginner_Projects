import java.util.*;

public class Calculator{
    public static void main(String[] args){
        // A SIMPLE CALCULATOR IN JAVA!

        Scanner input = new Scanner(System.in);

        Boolean program = true;

        while (program.equals(true)){

            System.out.print("ADD(A), SUBTRACT(S), MULTIPLY(M), DIVIDE(D): ");
            String operator = input.next();

            if (operator.equals("A")){
                System.out.print("Enter the 1st number to add: ");
                int num1 = input.nextInt();
                System.out.print("Enter the 2nd number to add: ");
                int num2 = input.nextInt();
                int num = num1 + num2;
                System.out.printf("%d + %d = %d\n", num1, num2, num);
            }
            else if (operator.equals("S")){
                System.out.print("Enter the number to subtract: ");
                int num1 = input.nextInt();
                System.out.print("Enter the number to subtracted by: ");
                int num2 = input.nextInt();
                int num = num1 - num2;
                System.out.printf("%d - %d = %d\n", num1, num2, num);
            }
            else if (operator.equals("M")){
                System.out.print("Enter the number to multiply: ");
                int num1 = input.nextInt();
                System.out.print("Enter the number to multiplied by: ");
                int num2 = input.nextInt();
                int num = num1 * num2;
                System.out.printf("%d x %d = %d\n", num1, num2, num);
            }
            else if (operator.equals("D")) {
                System.out.print("Enter the number to divide: ");
                double num1 = input.nextDouble();
                System.out.print("Enter the number to divided by: ");
                double num2 = input.nextDouble();
                double num = num1 / num2;
                System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num);
            }
            else {
                System.out.println("Enter the valid input!");
            }

            System.out.print("Do you want to do math operation?(Y/n): ");
            String dec = input.next();

            if (dec.equals("Y")){
                program = true;
            }
            else {
                program = false;
            }

        }

        System.out.println("Bye!");

        input.close();
    }
}
