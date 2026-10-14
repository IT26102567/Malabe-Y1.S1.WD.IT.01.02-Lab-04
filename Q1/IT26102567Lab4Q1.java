import java.util.Scanner;

public class IT26102567Lab4Q1 {
	public static void main(String[] args){
		
		//Create new scanner object to input from keyboard
		Scanner input = new Scanner(System.in);
		
		//Input a number from the keyboard 
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//Check if the values are positive, negative or zero 
		if (number > 0) {
			System.out.println("The number is: Positive");
		} else if (number < 0){
			System.out.println("The number is: Negative");
		} else { 
		    System.out.println("The number is zero");
		}
		
		input.close();
		
	
	}
	
}
		

	

			