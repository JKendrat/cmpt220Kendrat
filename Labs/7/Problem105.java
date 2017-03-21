import java.util.Scanner;
import java.util.Stack;

public class Problem105 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		Stack st = new Stack();
		System.out.println("Enter an integer");
		int value = input.nextInt();
		for(int i = 2; i <= value; i++){
			if(value % i == 0){
				st.push(i);
			}
		}
		
		for(int i = 0; i < st.size(); i++){
			System.out.println(st.pop());
		}

	}

}
