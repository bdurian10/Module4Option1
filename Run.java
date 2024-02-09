package module4option1;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		//Declare scanner and create an array for user input. Initialize array with zeroes as a default.
		Scanner scnr = new Scanner(System.in);
		float[] numbers = {0, 0, 0, 0, 0};
		float sum = 0;
		
		//Declare interest rate as a final variable set to 20%
		final double INTEREST_RATE = 0.20;

		//Loop through the array, prompting user for a floating point each time
		for(int i =0; i < numbers.length;i++) {
			
			System.out.println("Enter a floating point value");
			
			//This is a while loop to re-prompt user if an incorrect data type is entered. 
			//Condition of while loop checks if Scanner has a float. 
			//If not, the code body informs the user of the error and asks for another input
			while(!scnr.hasNextFloat()) {
				
				System.out.println("Invalid Entry: " + scnr.nextLine() + ". Try again");
				
			}
			
			//After while loop condition is met, store next float in numbers array and add to sum
			numbers[i] = scnr.nextFloat();
			sum += numbers[i];

		}
		
		//Close scanner once it is no longer needed
		scnr.close();
		
		//Sort numbers in ascending order. This will ensure the minimum 
		//is at index 0 and maximum is at index 4.
		Arrays.sort(numbers);
		
		//Print information
		System.out.println("Total: " + sum);
		
		//Average can be obtained through dividing by numbers.length
		System.out.println("Average: " + sum / numbers.length);
		
		/*
		 * This code returns the number in the final index of the numbers array. 
		 *If the program ever changes the quantity of numbers
		 * the user enters, this code will not need to be modified.
		*/
		System.out.println("Maximum: " + numbers[numbers.length - 1]);
		
		//The minimum value will be at the 0 index
		System.out.println("Minimum: " + numbers[0]);
		
		//Multiply sum by INTEREST_RATE to calculate interest
		System.out.printf("20 Percent Interest on Total: %,.2f\n", sum * INTEREST_RATE);
		
	}
}
