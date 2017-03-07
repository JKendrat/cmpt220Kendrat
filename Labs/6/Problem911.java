import java.util.Scanner;
public class Problem911 {

	public static void main(String[] args) {
		//John Kendrat CMPT 220
		//Get the variables from input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the variables for a");
		double a = input.nextDouble();
		System.out.println("Enter the variables for b");
		double b = input.nextDouble();
		System.out.println("Enter the variables for c");
		double c = input.nextDouble();
		System.out.println("Enter the variables for d");
		double d = input.nextDouble();
		System.out.println("Enter the variables for e");
		double e = input.nextDouble();
		System.out.println("Enter the variables for f");
		double f = input.nextDouble();	
		
		//See if solvable and what the equations equal
		LinearEquation linearequation1 = new LinearEquation(a, b, c, d, e, f);
      if(linearequation1.isSolvable() == false)  {
		System.out.println("The solution is not solvable");
      } else{
    	  System.out.println("The equation for X is " + linearequation1.getX());
    	  System.out.println("The equation for Y is " + linearequation1.getY());
    
		
    	  
      }
      
		
	}

}
