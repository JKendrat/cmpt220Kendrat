import java.util.ArrayList;
import java.util.Scanner;
public class Problem1111 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       for(int i = 0; i < 5; i++){
    	   System.out.println("Enter the " + i + " number");
    	   numbers.add(input.nextInt());
       }
       
       sort(numbers);
       System.out.println(numbers.toString());
	}
	
	public static void sort(ArrayList<Integer> list){
		
		for(int i = 0; i < 5; i++){
		    
			double currentMin = list.get(0);
			int currentMinIndex = i;
			
			for(int j = i + 1; j < 5; j++){
				if(currentMin > list.get(j)){
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i){
				int var1 = list.get(currentMinIndex);
				var1 = list.get(i);
				currentMin = list.get(i);
			}
			
		}
	}

}
