import java.util.Scanner;
public class Problem51 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);	
		double positiveintegers = 0;
		double negativeintegers = 0;
        double total = 0;
        double average = 0;
        double numberofintegers = 0;
		
			
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int integer = input.nextInt();
		if(integer == 0){    
		System.out.println("No numbers entered are entered except 0");
		} else{
        while(integer != 0){
        	if(integer < 0){
        		positiveintegers++;
        		total = total + integer;
        		numberofintegers++;
        		System.out.println("Enter an integer, the input ends if it is 0: ");
        		integer = input.nextInt();
        	} else{
        		negativeintegers++;
        		total = total + integer;
        		numberofintegers++;
        		System.out.println("Enter an integer, the input ends if it is 0: ");
        		integer = input.nextInt();
        	}
        			
        }
	
        System.out.print("The number of positives is " + positiveintegers);
		System.out.print("\nThe number of negatives is " + negativeintegers); 
		System.out.print("\nThe total is " + total);
		System.out.print("\nThe average is "+ total/numberofintegers );
		}
		
 }


}


