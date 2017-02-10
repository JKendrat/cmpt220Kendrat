import java.util.Scanner;
public class Problem516 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		// JA: When finding the smallest factors, you need to decompose the numbers
		// JA: For example, if the input is 340, you need to find the smallest number that is a factor 
		// JA: and divide by the number, i.e., 2 is a factor and now your number is 170. You keep doing that 
		// JA: until the number is 1. So the factors of 340 are 2,2,5,17.
		for(int j = 2; j < integer; j++){
			if((integer%j)==0){
				System.out.println(j + ",");
			}
		}
	}

}
