import java.util.ArrayList;
import java.util.Scanner;
public class Problem133 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter how many Integers are in your arraylist:");
		int Integers = input.nextInt();
		System.out.println("Enter the Integers:");
		
		int i = 0;
		while(i < Integers){
			list.add(i);
			i++;
		}
		sort(list);

	}
	
	public static void sort(ArrayList<Integer> list){
		
		for(int i = 0; i < list.size(); i++){
			for(int k = 0; k < list.size(); k++){
				if(list.get(i) < list.get(k)){
					list.set(i, list.get(k));
				} 
			}
		}
	}

}
