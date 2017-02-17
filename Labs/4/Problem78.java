import java.util.Scanner;
public class Problem78 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		
		// JA: Where is the program to test it?

	}
	
	public static int average(int[] array){
		Scanner input = new Scanner(System.in);
		
		int average = 0;
        int total = 0;
        int numberofintegers = 0;
		for(int i = 0; i < 10; i++){
			System.out.println("Enter an integer:");
			int integer = input.nextInt();
			total = total + integer;
			numberofintegers++;
			average = total/numberofintegers;
			
		}
		return average;
	}
    
	public static double average(double[] array){
Scanner input = new Scanner(System.in);
		
		double average = 0;
        int total = 0;
        int numberofintegers = 0;
		for(int i = 0; i < 10; i++){
			System.out.println("Enter an integer:");
			int integer = input.nextInt();
			total = total + integer;
			numberofintegers++;
			average = total/numberofintegers; // JA: This operation has to be non-integer 
			
		}
		return average;
	}
	
}
