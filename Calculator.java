import java.util.Scanner; // importing scanner class for user input.

public class Calculator { // defining Calculator class

	public static void main(String[] args) { // defining main function

		Scanner input = new Scanner(System.in); // instantiation of scanner class as input.

		boolean program = true; // declaring a boolean variable as program and assigning as TRUE.

		while(program) // creating a while loop for repetition.
		{
			System.out.print("ADD(A), SUBTRACT(S), MULTIPLY(M), DIVIDE(D): "); // asking the user for operation.
			String operation = input.next().toLowerCase();			   // storing the given value in the variable 'operation' and making it lower case.

			if(operation.equals("a")) // checking the condition of 'operation' equals to 'a'.
			{
				try // using try block to catch Exceptions.
				{
					System.out.print("Enter the number to add: "); // asking the user for the 1st number to add.
					double n1 = input.nextDouble();                // storing the given value in the variable 'n1' of data type double.
					System.out.print("Enter the another number to add: "); // asking the user for the 2nd number to add.
					double n2 = input.nextDouble();			       // storing the given value in the variable 'n2' of data type double.

					double n = n1 + n2; // storing the sum of 'n1' and 'n2' in the variable 'n' of data type double.

					System.out.printf("%.2f + %.2f = %.2f\n", n1, n2, n); // format printing the variables with the precision of 2.
				}
				catch(InputMismatchException e) // catching exception if the given value is other than numbers.
				{
					System.err.println("Enter only numbers plz!"); // printing out the message as a error.
					String decision = input.next().toLowerCase();  // asking the user for to do math operation, storing it in the variable 'decision' and making it lower case (line: 101).
				}
			}

			else if(operation.equals("s")) // checking the condition of 'operation' equals to 's'.
			{
				try // using try block to catch Exceptions.
				{
					System.out.print("Enter the number to subtract: "); // asking the user for the 1st number to subtract.
					double n1 = input.nextDouble();			    // storing the given value in the variable 'n1' of data type double.
					System.out.print("Enter the number to subtracted by: "); // asking the user for the 2nd number to subtract.
					double n2 = input.nextDouble();				 // storing the given value in the variable 'n2' of data type double.

					double n = n1 - n2; // storing the subtracted value of 'n1' and 'n2' in the variable 'n' of data type double.

					System.out.printf("%.2f - %.2f = %.2f\n", n1, n2, n); // format printing the variables with the precision of 2.
				}
				catch(InputMismatchException e) // catching exception if the given value is other than numbers.
				{
					System.err.println("Enter only numbers plz!"); // printing out the message as a error.
					String decision = input.next().toLowerCase();  // asking the user for to do math operation, storing it in the variable 'decision' and making it lower case (line: 101).
				}
			}

			else if(operation.equals("m")) // checking the condition of 'operation' equals to 'm'.
			{
				try // using try block to catch Exceptions.
				{
					System.out.print("Enter the number to multiply: "); // asking the user for the 1st number to multiply.
					double n1 = input.nextDouble(); 		    // storing the given value in the variable 'n1' of data type double.
					System.out.print("Enter the number to multiplied by: "); // asking the user for the 2nd number to subtract.
					double n2 = input.nextDouble(); 			 // storing the given value in the variable 'n2' of data type double.

					double n = n1 * n2; // storing the multiplied value of 'n1' and 'n2' in the variable 'n' of data type double.

					System.out.printf("%.2f x %.2f = %.2f\n", n1, n2, n); // format printing the variables with the precision of 2.
				}
				catch(InputMismatchException e) // catching exception if the given value is other than numbers.
				{
					System.err.println("Enter only numbers plz!"); // printing out the message as a eroor.
					String decision = input.next().toLowerCase();  // asking the user for to do math operation, storing it in the variable 'decison' and making it lower case (line: 101).
				}
			}

			else if(operation.equals("d")) // checking the condition of 'operation' equals to 'd'.
			{
				try // using try block to catch Exceptions.
				{
					System.out.print("Enter the number to divide: "); // asking the user for the 1st number to divide.
					double n1 = input.nextDouble();			  // storing the given value in the variable 'n1' of data type double.
					System.out.print("Enter the number to divided by: "); // asking the user for the 2nd number to subtract.
					double n2 = input.nextDouble(); 		      // storing the given value in the variable 'n2' of data type double.

					double n = n1 / n2; // storing the divided value of 'n1' and 'n2' in the variable 'n' of data type double.

					System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, n); // format printing the variables with the precison of 2.
				}
				catch(InputMismatchException e) // catching exception if the given value is other than numbers.
				{
					System.err.println("Enter only number plz!"); // printing out the message as a error.
					String decision = input.next().toLowerCase(); // asking the user for to do math operation, storing it in the variable 'decison' and making it lower case (lower 101).
				}
			}

			else 					       // block of code under ELSE statement is executed when above conditions are false.
			{
				System.err.println("Invalid Option!"); // printing the message as error.
			}

			System.out.print("Do you want do math operation?(Y/n): "); // asking the user for to do math operation.
			String decision = input.next().toLowerCase();              // asking the user for to do math operation, storing it in the variable 'decision' and making it lower case.

			if(decision.equals("y")) // checking the condition of 'decision' equals to 'y'.
			{
				program = true; // assigning the variable 'program' as TRUE. (This will continue the loop. Because WHILE loop is executed over and over when the condition is TRUE)
			}
			else // block of code under ELSE statement is executed when above condition is false.
			{
				program = false; // assigning the variable 'program' as FALSE. (This will exit the loop. Because WHILE loop is executed when the condition is TRUE, and not executed when FALSE) 
			}

		}

		System.out.println("Bye!"); // finally printing "Bye!" at the end of the program.

		input.close(); // Close the Scanner to release resources.

	}

}
