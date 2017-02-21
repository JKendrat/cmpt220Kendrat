import java.util.Scanner;
public class Problem85 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		double [][] matrix1;
		matrix1 = new double[3][3];
		double [][] matrix2;
		matrix2 = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row:");
		 for(int row = 0; row < matrix1.length; row++){
	        	for(int column = 0; column < matrix1[row].length; column++){
	        		matrix1[row][column] = input.nextDouble();
	        	}
	        }
		 System.out.println("Enter another 3-by-3 matrix row by row:");
		 for(int row = 0; row < matrix2.length; row++){
	        	for(int column = 0; column < matrix2[row].length; column++){
	        		matrix2[row][column] = input.nextDouble();
	        	}
	        }
		 System.out.println(matrix1[0][0] + " " + matrix1[0][1] + " " + matrix1[0][2] + " " + "   " + matrix2[0][0] + " " + matrix2[0][1] + " " + matrix2[0][2] + " ");
		 System.out.println(matrix1[1][0] + " " + matrix1[1][1] + " " + matrix1[1][2] + " " + " + " + matrix2[1][0] + " " + matrix2[1][1] + " " + matrix2[1][2] + " ");
		 System.out.println(matrix1[2][0] + " " + matrix1[2][1] + " " + matrix1[2][2] + " " + "   " + matrix2[2][0] + " " + matrix2[2][1] + " " + matrix2[2][2] + " ");
	     
		 for(int i = 0; i < 3; i++){
			 for(int j = 0; j < 3; j++){
				 System.out.print(addMatrix(matrix1, matrix2));
			 }
			 System.out.println("  ");
		 }
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
	   double [][] matrix3;
	   matrix3 = new double[3][3];
	   double sum = 0;
	   double num1 = 0;
	   double num2 = 0;
		for(int j = 0; j < 3; j++){	
		    for(int i = 0; i < 3; i++){
			 num1 = a[i][j];
			 num2 = b[i][j];
			sum = num1 + num2;
			matrix3[i][j] = sum;
		}
		    System.out.println("    ");
	}
		return matrix3;
  }
}
