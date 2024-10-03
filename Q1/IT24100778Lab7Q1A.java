import java.util.Scanner;
 public class IT24100778Lab7Q1A{
  public static void main (String[]args){
     Scanner input = new Scanner (System.in);
	  System.out.println("Enter marks for four subjects:");
	  System.out.print("Enter subject mark 1: ");
	  int mark1 = input.nextInt();
	   System.out.print("Enter subject mark 2: ");
	  int mark2 = input.nextInt();
	   System.out.print("Enter subject mark 3: ");
	  int mark3 = input.nextInt();
	   System.out.print("Enter subject mark 4: ");
	  int mark4 = input.nextInt();
	  double Average = ( mark1 + mark2 + mark3 + mark4 ) / 4 ;
	  System.out.println("");
	   System.out.println("Average is : " + Average );
	  String grade = "grade"; 
	  if  ( Average >= 0 && Average <= 49 ){
	       grade = "fail";}
	   else if ( Average >= 50 && Average <= 74 ){
	       grade = "credit";}
	   else if ( Average >= 75 && Average <= 100 ){
	       grade = "Distinction";}
		 System.out.println("overall grade is : " + grade );  
	   
	 }
}	 
	   
	  