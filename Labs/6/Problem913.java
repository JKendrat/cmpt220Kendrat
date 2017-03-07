import java.util.Scanner;
public class Problem913 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter how many rows");
		int rows = input.nextInt();
		System.out.println("Enter how many columns:");
		int columns = input.nextInt();
		double[][] matrix = new double[rows][columns];
		for(int row = 0; row < matrix.length; row++){
        	for(int column = 0; column < matrix[row].length; column++){
        		matrix[row][column] = input.nextDouble();
        	}
        }
		System.out.println("Enter the largest value of that list:");
		double maxValue = input.nextDouble();
		Location location1 = new Location(rows, columns, maxValue);
		
		System.out.println(location1.locateLargest(matrix));

	}

}
