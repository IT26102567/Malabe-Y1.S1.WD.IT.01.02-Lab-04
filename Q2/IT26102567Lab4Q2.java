import java.util.Scanner;

public class IT26102567Lab4Q2 {
    
    public static void main(String[] args) {
       
       // Create new scanner object to input from the keyboard 
       Scanner input = new Scanner(System.in);
      
       // Input the exam marks[cite: 2]
       System.out.print("Please enter exam marks (out of 100): ");
       double examMarks = input.nextDouble();
       
       // Validate the exam marks (should be between 0 & 100)[cite: 2]
       if (examMarks < 0 || examMarks > 100) { 
           System.out.println("Invalid input for exam marks. Terminating program.");
           return; // Exit the program 
       } 
            
       // Input the lab submission marks[cite: 2]
       System.out.print("Please enter lab submission marks (out of 100): "); 
       double labMarks = input.nextDouble();
       
       // Validate the lab submission marks (should be between 0 & 100)[cite: 2]
       if (labMarks < 0 || labMarks > 100) { 
           System.out.println("Invalid input for lab submission marks. Terminating program."); 
           return; // Exit the program
       }
       
       // Input percentages for exam and lab[cite: 2]
       System.out.print("Please enter the percentage given for the exam: ");
       double examPercentage = input.nextDouble();
       
       System.out.print("Please enter the percentage given for the lab submission: ");
       double labPercentage = input.nextDouble();
       
       // Validate that the percentages add up to 100[cite: 2]
       if ((examPercentage + labPercentage) != 100) { 
           System.out.println("The percentages must add up to 100. Terminating program.");
           return; // Exit the program
       }
       
       // Calculate the final exam marks[cite: 2]
       double finalMark = (examMarks * (examPercentage / 100.0)) + (labMarks * (labPercentage / 100.0));
       System.out.println("Final Exam Mark is : " + finalMark);
       
       // Close the scanner resource
       input.close();
    }
}