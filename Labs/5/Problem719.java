import java.util.Scanner;
// JA: Always add comments to your code
public class Problem719 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values in the list:");
		int numberoflistnumbers = input.nextInt();
		int[] originallist = new int[numberoflistnumbers];
			
		for(int i = 0; i < numberoflistnumbers; i++){
			System.out.println("Enter a number:");
			originallist[i] = input.nextInt(); 
			
		}

		
		System.out.println("The list being sorted is: " + isSorted(originallist));
	}
	
	// JA: A simple way to check this is if the element in position i is <= to the one in position i + 1
	public static boolean isSorted(int[] list){
		int Testlist[] = new int[list.length];
		Testlist = list; // JA: If you are going to make this assignment, you did not have to allocate the space
		int otherlist[] = new int[list.length];
		boolean matching = true; 
		
			   for (int i = 0; i < list.length - 1; i++) {
				   
				    int currentMin = list[i];
				   int currentMinIndex = i;
				     
				   for (int j = i + 1; j < list.length; j++) {
					   if (currentMin > list[j]) {
						   currentMin = list[j];
						   currentMinIndex = j;
					   }
				   }
				   
				   
				   if (currentMinIndex != i) {
					   list[currentMinIndex] = list[i];
					   list[i] = currentMin;
					   
				   }
				  
			   }
			   //Get sorted list and compare to pre-sorted list
			   for(int i = 0; i < list.length; i++){
				   if(otherlist[i] == Testlist[i]){
					  matching  = true;
				   } else{
					   matching = false;
				   }
			   }
		
		return matching;
	}

}
