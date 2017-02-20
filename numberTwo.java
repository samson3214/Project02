import java.util.Scanner;// scanner imported 
public class numberTwo //numberTwo is defined as the class name
	{
    public static void main(String[] args)//main method
  {
        Scanner myHelp = new Scanner(System.in);//  class scanner
        
        System.out.println("Enter the amount of investment ");//stating user input value amount
        double investmentAmount = myHelp.nextDouble();// creating value of investment amount
        
        System.out.println("Enter the annual interest rate "); //asks user to input interest rate
        double  annualInterestRate = myHelp.nextDouble();//  user input = to annual interest rate 
        
        annualInterestRate = annualInterestRate / 100; // change from percent to decimal the interest rate
        int numberOfYears=30;// set equal to number of years

		
		System.out.println("Years      " + "   Future Value"); // printing the the start point of statement
       
        for (numberOfYears=1; numberOfYears <=30; numberOfYears++) // starts the loop, 30 times for the method
{
        	
        	double future = futureInvestmentValue(investmentAmount, annualInterestRate, numberOfYears); 
        	
        	System.out.printf("%-10d",numberOfYears); // calculating function
        	
        	System.out.printf("%11.2f\n", future);// 11 numbers total; 9 numbers b4 decimal + 2 decimal points
        	
        	
}//loop ends 
        } // ending method

    
    
    
  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)// finding future investment value 
  {
    		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12); // returning the future investment amount
    	
  			} // loop ends
    
} // ending method