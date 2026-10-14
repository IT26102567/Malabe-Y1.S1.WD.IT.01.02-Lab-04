import java.util.Scanner;

public class IT26102567Lab4Q3 {
	public static void main(String[] args){
		
		//Create new scanner object to read input from the keyboard 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		//Using nested ternary operators to check if the number is Positive, Negative, or Zero
		String result = (number > 0) ? "Positive" : ((number < 0) ? "Negative" : "Zero");
		
		//Display the final output 
		System.out.println("The number is: " + result);
		
		//Close the scanner
		scanner.close();
		
	}
		
}