import java.util.Scanner;
public class Problem123 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		double[] array = new double[100];
		for(int i = 0; i < 100; i++){
			array[i] = Math.random() * 50 + 1;
		}
		
		System.out.println("Enter the index of the array:");
		int index = input.nextInt();

	}

}
