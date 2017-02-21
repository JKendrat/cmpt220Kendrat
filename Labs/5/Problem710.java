import java.util.Scanner;

public class Problem710 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		
		double[] integer = new double[10];
		for(int i = 0; i < 10; i++){
		System.out.println("Enter an integer:");
		integer[i] = input.nextDouble();
		
		}
		System.out.println("The minimum number is: " + indexOfSmallestElement(integer));
	}
	
	public static int indexOfSmallestElement(double[] array){
		double currentMin = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
			   // Find the minimum in the list[i..list.lenght - 1]
			    currentMin = array[i];
			   int currentMinIndex = i;
			   
			   for (int j = i + 1; j < array.length; j++) {
				   if (currentMin > array[j]) {
					   currentMin = array[j];
					   currentMinIndex = j;
				   }
			   }
			   
			   // Swap list[i] with list[currentMinIndex] if necessary
			   if (currentMinIndex != i) {
				   array[currentMinIndex] = array[i];
				   array[i] = currentMin;
			   }
		   }
		
		return (int) currentMin;
  }
}