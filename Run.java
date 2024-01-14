package module4option1;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		//Declare scanner and array for user input
		Scanner scnr = new Scanner(System.in);
		float[] numbers = {0, 0, 0, 0, 0};
		float sum = 0;

		

		//Loop 5 times, preventing possibility of infinite loop
		for(int i =0; i < 5;i++) {
			System.out.println("Enter a floating point value");
			//While loop to re-prompt user if incorrect type entered
			while(!scnr.hasNextFloat()) {
				
				System.out.println("Invalid Entry: " + scnr.nextLine() + ". Try again");
			}
			//After while loop condition is met, store next float in numbers array and add to sum
			numbers[i] = scnr.nextFloat();
			sum += numbers[i];

		}
		scnr.close(); //Close scanner to save resources
		
		//Sort numbers in ascending order to get min/max
		Arrays.sort(numbers);
		
		//Print information
		System.out.println("Total: " + sum);
		System.out.println("Average: " + sum / 5);
		System.out.println("Maximum: " + numbers[4]);
		System.out.println("Minimum: " + numbers[0]);
		//System.out.print("20% Interest on Total: ");
		System.out.printf("20 Percent Interest on Total: %,.2f", sum * 0.20);
		System.out.println();
		
		
		
	}
}
