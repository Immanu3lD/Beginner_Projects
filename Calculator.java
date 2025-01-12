import java.util.*;

public class calculator{
	
    public static void main(String[] args){
        // A SIMPLE CALCULATOR IN JAVA!

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.print("ADD(A), SUBTRACT(S), MULTIPLY(M), DIVIDE(D): ");
            String operator = input.next().toLowerCase();

            if (operator.equals("a")){
            	try {
            	    System.out.print("Enter the 1st number to add: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the 2nd number to add: ");
                    double num2 = input.nextDouble();
                    double num = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num);
            	}
            	catch (InputMismatchException e) {
            		System.out.println("Enter only numbers plz!");
            		System.out.println(e);
            		
                    String dec = input.next().toLowerCase();

                    if (dec.equals("y")){
                        continue;
                    }
                    else {
                        break;
                    }
            	}
            }
            else if (operator.equals("s")){
            	try {
            		System.out.print("Enter the number to subtract: ");
            		double num1 = input.nextDouble();
            		System.out.print("Enter the number to subtracted by: ");
            		double num2 = input.nextDouble();
            		double num = num1 - num2;
            		System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num);
            	}
            	catch (InputMismatchException e) {
            		System.out.println("Enter only numbers plz!");
            		System.out.println(e);
            		
            		String dec = input.next().toLowerCase();

                    if (dec.equals("y")){
                        continue;
                    }
                    else {
                        break;
                    }	
            	}
            }
            else if (operator.equals("m")){
            	try {
            		System.out.print("Enter the number to multiply: ");
            		double num1 = input.nextDouble();
            		System.out.print("Enter the number to multiplied by: ");
            		double num2 = input.nextDouble();
            		double num = num1 * num2;
            		System.out.printf("%.2f x %.2f = %.2f\n", num1, num2, num);
            	}
            	catch (InputMismatchException e) {
            		System.out.println("Enter only numbers plz!");
            		System.out.println(e);
            		
            		String dec = input.next().toLowerCase();

                    if (dec.equals("y")){
                        continue;
                    }
                    else {
                        break;
                    }   
            	}
            }
            else if (operator.equals("d")) {
            	try {
            	    System.out.print("Enter the number to divide: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the number to divided by: ");
                    double num2 = input.nextDouble();
                    double num = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num);
            	}
            	catch (InputMismatchException e) {
            		System.out.println("Enter only numbers plz!");
            		System.out.println(e);
            		
            		String dec = input.next().toLowerCase();

                    if (dec.equals("y")){
                        continue;
                    }
                    else {
                        break;
                    }
            	}
            }
            else {
                System.out.println("Enter the valid input!");
            }

            System.out.print("Do you want to do math operation?(Y/n): ");
            String dec = input.next().toLowerCase();

            if (dec.equals("y")){
                continue;
            }
            else {
                break;
            }

        }

        System.out.println("Bye!");

        input.close();
    }
    
}
