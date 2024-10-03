import java.util.Scanner;
 public class IT24100778Lab7Q1B {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	   for (int i=1;i<=3;i++){
		    System.out.println("Student : " + i);
        System.out.print("Enter marks: ");
        String[] marksArray = input.nextLine().split(" ");
        int mark1 = Integer.parseInt(marksArray[0]);
        int mark2 = Integer.parseInt(marksArray[1]);
        int mark3 = Integer.parseInt(marksArray[2]);
        int mark4 = Integer.parseInt(marksArray[3]);
       double average = (mark1 + mark2 + mark3 + mark4) / 4.0; 
        System.out.println("Average is: " + average);
        String grade;
       if (average >= 0 && average <= 49) {
		 grade = "Fail";}
         else if (average >= 50 && average <= 74) {
	     grade = "Credit";}
         else if (average >= 75 && average <= 100) {
		 grade = "Distinction";}
         else {
		 grade = "Invalid Marks";} 
		
        System.out.println("Overall Grade is: " + grade);
		 System.out.println();
	   }
    }
  
}

