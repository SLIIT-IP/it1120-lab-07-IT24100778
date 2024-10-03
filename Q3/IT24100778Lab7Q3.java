import java.util.Scanner;
 public class IT24100778Lab7Q3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	   
	  for (int i=1;i<=5;i++){
		  System.out.println("customer : " + i);
	   
	   System.out.print( "enter total bill amount : " );
	   int totalbill = input.nextInt();
	   
	   double discount = 0;
	   
	   System.out.print("Enter mode of payment (c for cash, o for other ) :");
	   char modepayment = input.next().charAt(0);
	   
	   if ( modepayment == 'C' || modepayment == 'c' ){
	        discount = totalbill * 0.05 ; 
		    System.out.println("Discount is : " + discount );
		}	 
        else if  ( modepayment == 'O' || modepayment == 'o' ){
		  System.out.println("no discount applicable " );
		  
		}
		else {
	      System.out.println("payment mode is not valid " );
		  System.out.println(" ") ;
		  continue;
		}
		   
		 
	    double amount = totalbill - discount ;
	
	    System.out.println("amount to be paid : " + amount ) ;
	    System.out.println(" ") ;
       
       }	   
	
	}
 }	
            		
	   
	   
	   