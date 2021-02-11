/*
 * Written by Donte Littlejohn
 */

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Random r = new Random();
		int	num1Count = 0;
		int num2Count = 0;
		int num3Count = 0;
		int num4Count = 0;
		int num5Count = 0;
		int num6Count = 0;
		
		//Greeting message
		System.out.println("Enter the number of times a 6 sided die should be rolled");

		//Prompt user for number of times the die is rolled. If number is less than or equal to zero end program.
		int numOfDieRolls = keyboard.nextInt();
		keyboard.nextLine();
		if(numOfDieRolls <= 0)
		{
			System.out.println("Number must be a positive integer greater than 0.");
			System.exit(0);
		}
		
		/*
		 *  Generate a random number between the values 1 and 6.
		 *  Store count for each time a value is chosen.
		 *  Print to user what number was rolled - <<number>> was rolled
		 */		
		for(int i = 0; i < numOfDieRolls; i++) {
			int roll = r.nextInt(6) + 1;
			
			if(roll == 1) 
			{
				num1Count++;
				System.out.println(roll + " was rolled");
			}
			else if(roll == 2) 
			{
				num2Count++;
				System.out.println(roll + " was rolled");
			}
			else if(roll == 3) 
			{
				num3Count++;
				System.out.println(roll + " was rolled");
			}
			else if(roll == 4) 
			{
				num4Count++;
				System.out.println(roll + " was rolled");
			}
			else if(roll == 5) 
			{
				num5Count++;
				System.out.println(roll + " was rolled");
			}
			else if(roll == 6) 
			{
				num6Count++;
				System.out.println(roll + " was rolled");
			}
		}
		
		//Print to user the number of times each number was rolled - <<number>>: <<timesRolled>>
		System.out.println("One: " + num1Count);
		System.out.println("Two: " + num2Count);
		System.out.println("Three: " + num3Count);
		System.out.println("Four: " + num4Count);
		System.out.println("Five: " + num5Count);
		System.out.println("Six: " + num6Count);
		
		keyboard.close();
	}

}
