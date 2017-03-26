import java.util.Scanner;
import java.util.ArrayList;
public class Problem1113 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
     	   System.out.println("Enter the " + i + " number");
     	   numbers.add(input.nextInt());
        }
        removeDuplicate(numbers);
        System.out.println(numbers.toString());
        
	}
	
	public static void removeDuplicate(ArrayList<Integer> list){
		for(int i = 0; i < 10; i++){
			for(int j = i; j < 10; j++){
				int compare = list.get(i);
				if(compare == list.get(j+1)){
					list.remove(j + 1);
				}
			}
		}
	}

}
