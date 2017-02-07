import java.util.Scanner;
public class Problem516 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		for(int j = 2; j < integer; j++){
			if((integer%j)==0){
				System.out.println(j + ",");
			}
		}
		
		
		
		

	}

}
