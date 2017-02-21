import java.util.Scanner;
public class Problem81 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
        Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
        double [][] matrix;
        matrix = new double[3][4];
        for(int row = 0; row < matrix.length; row++){
        	for(int column = 0; column < matrix[row].length; column++){
        		matrix[row][column] = input.nextDouble();
        	}
        }
        for(int i = 0; i < 4; i++){
        System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        
        }
        }
	public static double sumColumn(double[][] m, int columnIndex){
		double sum = 0;
		for(int i = 0; i < 3; i++){
			sum = m[i][columnIndex] + sum;  
		
	}
	return sum;
  }
	
}