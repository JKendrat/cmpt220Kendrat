import java.util.Arrays;
import java.util.Scanner;
public class Problem714 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		int[] list = new int[5];
		for(int i = 0; i < 5; i++){
			
			System.out.println("Enter a number: ");
			list[i] = input.nextInt();
		}
		gcd(list);
		
	}
	
	public static int gcd(int... numbers){
		int[] divisor1 = new int[numbers.length];
		int[] divisor2 = new int[numbers.length];
		int[] divisor3 = new int[numbers.length];
		int[] divisor4 = new int[numbers.length];
		int[] divisor5 = new int[numbers.length];
		int[] max1 = new int[divisor1.length];
		int[] max2 = new int[divisor2.length];
		int[] max3 = new int[divisor3.length];
		int[] max4 = new int[divisor4.length];
		int[] max5 = new int[divisor5.length];
		//Finds divisors
		for(int i = 0; i < 20; i++){
			if(numbers[0] % i == 0){
			divisor1[i] = numbers[0] % i;  
			}
		}
		for(int i = 0; i < 10; i++){
			if(numbers[1] % i == 0){
			divisor2[i] = numbers[1] % i;  
			}
		}
		for(int i = 0; i < 10; i++){
			if(numbers[2] % i == 0){
			divisor3[i] = numbers[2] % i;  
			}
		}
		for(int i = 0; i < 10; i++){
			if(numbers[3] % i == 0){
			divisor4[i] = numbers[3] % i;  
			}
		}
		for(int i = 0; i < 10; i++){
			if(numbers[4] % i == 0){
			divisor5[i] = numbers[4] % i;  
			}
		}
		//Makes a list for each function from greatest to smallest
		for(int i = 0; i < divisor1.length; i++){
			if(divisor1[i] > 1){
				divisor1[i] = max1[0];
			} else{
				divisor1[i] = max1[i - 1];
			}
		}
		for(int i = 0; i < divisor2.length; i++){
			if(divisor2[i] > 1){
				divisor2[i] = max2[0];
			} else{
				divisor2[i] = max2[i - 1];
			}
		}
		for(int i = 0; i < divisor3.length; i++){
			if(divisor3[i] > 1){
				divisor3[i] = max3[0];
			} else{
				divisor3[i] = max3[i - 1];
			}
		}
		for(int i = 0; i < divisor4.length; i++){
			if(divisor4[i] > 1){
				divisor4[i] = max4[0];
			} else{
				divisor4[i] = max4[i - 1];
			}
		}
		for(int i = 0; i < divisor5.length; i++){
			if(divisor5[i] > 1){
				divisor5[i] = max4[0];
			} else{
				divisor5[i] = max5[i - 1];
			}
		}
		//See if the max value equals the other values
	if(max1[0] == max2[0] && max1[0] == max3[0] && max1[0] == max4[0] && max1[0] == max5[0]){
		return max1[0];
	} else if(max2[0] == max1[0] && max2[0] == max3[0] && max2[0] == max4[0] && max2[0] == max5[0]){
		return max2[0];
	} else if(max3[0] == max2[0] && max3[0] == max1[0] && max3[0] == max4[0] && max3[0] == max5[0]){
		return max1[0];
	} else if(max4[0] == max2[0] && max4[0] == max3[0] && max1[0] == max4[0] && max4[0] == max5[0]){
		return max4[0];
	} else{
		return max5[0];
	} 
	
		
		
}

}