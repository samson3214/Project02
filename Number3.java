import java.util.Scanner; // scanner library

public class Ordering { // defines name of class

		public static void main(String[] args) { // main method
		       Scanner goodguy = new Scanner(System.in);// define of name of scanner
		       System.out.print("Enter the number to be reversed : "); // prompting user to input data
		       int input = goodguy.nextInt(); // initializing input for scanner
		      reverse(input); // requesting method from main
		       
		   }// ending method

		   public static void reverse(int n) { // initializing method
		       int result = 0; // setting result to 0
		       int rem; // setting remainder
		       while (n > 0) { // loop 
		           rem = n % 10; // remainder is set to modulo divides input by 10; changes remainder to whole number
		           n = n / 10; // input is set to equal the input number divided by 10
		           result = result * 10 + rem; // multiplied result by 10 then add remainder value
		       
		   }
		       System.out.println("The reversed number is " + result); // final statement is printed stating reversed number
		} 
}// ending method
	

