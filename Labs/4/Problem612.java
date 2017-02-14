
public class Problem612 {



	public static void main(String[] args) {
		// John Kendrat CMPT 220
       printChars('A', 'Z', 10);
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine){
		/*System.out.println("0, 1, 2, 3, 4, 5, 6, 7, 8, 9,");
		System.out.println("A, B, C, D, E, F, G, H, I, J,");
		System.out.println("K, L, M, N, O, P, Q, R, S, T,");
		System.out.println("U, V, W, X, Y, Z");
		*/
		int k = Character.getNumericValue(ch1);
		int count = numberPerLine;
		for(int i = 0; i < Character.getNumericValue(ch2); i++){
			count++;
			k++;
			System.out.print("\uk");
		  for(int j = 0; j < Character.getNumericValue(ch2); j++){
			  if(j % count == 0){
				  System.out.println(" ");
			  }
		  }
			
			
		}
		
		
	}

}
