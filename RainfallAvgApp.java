import java.util.Scanner;

///**
//2D Arrays Problems
//Compute the average of the rainfall values stored each day for 4 weeks
// RainfallAvgApp
// -- prompts the user to input the rainfall values for 4 weeks
// -- calculates the average of the rainfall
// -- displays the values from the rainfall 2D array
// */

public class RainfallAvgApp {

	public static void main(String[] args) {
		//declare and create 2D[] with 4 weeks (rows) 7 day(col) 
		int rainfall[][] = new int [4][7];  // 4 week 7 days
		
		//input
		Scanner sc = new Scanner(System.in);
		
		//
		//
		//
		
		for (int row = 0; row<rainfall.length; row++) { 
			for (int col = 0; col<rainfall[row].length; col++) {
				System.out.print("enter value for week): " 
								+ (row+1) + "day" 
							+(col+1)+ ":");
				//read the valeu entered by the user and saave it in 2D[]
				rainfall[row] [col] = sc.nextInt();
				
			}
			
		}
		//processinhg
		//calculate ythe sum of all elements of the []
		//how many elements the [] contains
		int sum = 0;
		int counter = 0; //the number of elements in the 2D []
		double average;
		
		for (int row = 0; row< rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				//add the current element from the [] rainfall to the sum
				sum = sum +rainfall[row] [col];
				//another elemet has been added to the sum,
				//the element from[row] [col]
				counter++;	
			}
		}
		
		//compute the average of all ythe elements in the  []
		average = (double) sum/counter;
		//output
		System.out.println();
		System.out.println("Average: "+ average);
		
		//output the 2 D []  the data the user entered
		System.out.println("===============");
		System.out.println("The rainfall values are: ");
		for(int row = 0; row < rainfall.length ; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				System.out.print(rainfall[row] [col] + " ");
				
			rainfall[row] [col] = sc.nextInt();
			
			
			}
		}
		

		
	}

}
