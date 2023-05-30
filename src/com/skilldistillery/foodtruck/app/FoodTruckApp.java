package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.util.Scanner;

public class FoodTruckApp {
	Scanner input = new Scanner(System.in);
	private FoodTruck[] fleet = new FoodTruck[5];
	private int currentNumberOfTruck = 0;
	private boolean keepAsking = true;
	double rating;
	double sum = 0;
	double avg = 0;
	double maxNum = 0;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.startProgram();
	}

	public void startProgram() {
		for (int index = 0; index < 5; index++) {
			System.out.println("Enter the name of the food truck, otherwise enter quit to exit");
			String name = input.nextLine();
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("What is the food type?");
			String foodType = input.nextLine();
			System.out.println("What is the rating?");
			double rating = input.nextDouble();
			input.nextLine();

			FoodTruck truck = new FoodTruck(name, foodType, rating);
			// System.out.println(truck);
			fleet[index] = truck;
			currentNumberOfTruck++;
			System.out.println(fleet[index]);

		}
		while (keepAsking) {
			System.out.println("1. List all food trucks.\n" + "2. See the average rating of trucks you entered.\n"
					+ "3. Display the highest-rated food truck.\n" + "4. Quit and exit the program\n");
			int userChoice = input.nextInt();
			if (userChoice == 1) {
				existingTruck();

			} else if (userChoice == 2) {
				System.out.println(averageRating());

			} else if (userChoice == 3) {
				System.out.println(highRatedTruck());

			} else if (userChoice == 4) {
				System.out.println("Goodbye!");
			}
		}
		
	}

	public void existingTruck() {
		for (int index = 0; index < 5; index++) {
			if (fleet[index] != null) {
				System.out.println(fleet[index]);
			}
		}
	}

	public double averageRating() {

		for (int index = 0; index < fleet.length; index++) {
			if (fleet[index] != null) {
				sum += fleet[index].getRating();
			}
		}
		avg = sum / currentNumberOfTruck;
		return avg;

	}

	public double highRatedTruck() {

		for (int index = 0; index < fleet.length; index++) {
			if (fleet[index] != null) {
				if (fleet[index].getRating() > maxNum) {
					maxNum = fleet[index].getRating();

				}
			}
		}
		return maxNum;
	}

}