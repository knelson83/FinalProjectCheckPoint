
package com.mycompany.weighlossprogram;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author kiwin
 */
public class StoredObjects {

	public static void main(String[] args) throws IOException {
		
		
		String name;
		double currentWeight, goalWeight, milesWalked;
		int numObjects = 0;
		String UserName;
		
		try ( PrintWriter outputFile = new PrintWriter("C:\\blankfile.txt")) {
			for (int i = 1; i <= numObjects; i++) {

				System.out.print("Enter your name: ");
				UserName = keyboard.nextLine();

				outputFile.println(UserName);
			}
			outputFile.close();
			System.out.println("Data written to the file.");


		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = keyboard.nextLine();

		keyboard.nextDouble();

		System.out.print("Enter your current weight: ");
		currentWeight = keyboard.nextDouble();

		System.out.print("Enter your goal weight: ");
		goalWeight = keyboard.nextDouble();

		System.out.print("Enter number of miles walked today: ");
		milesWalked = keyboard.nextDouble();

		
		}
	}
}

	

	

