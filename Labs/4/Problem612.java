
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
// JA:		int k = Character.getNumericValue(ch1);
		int k = ch1; // JA
		int count = numberPerLine;
// JA		for(int i = 0; i < Character.getNumericValue(ch2); i++){
		for(int i = (int)ch1; i <= (int)ch2; i++){ // JA
			count++;
            System.out.print((char)i + " "); // JA
			k++;
			//System.out.print("uk"); // JA: This won't print the character, and it gives a compilation error
// JA			  for(int j = 0; j < Character.getNumericValue(ch2); j++){
//				  if(j % count == 0){
				  if(count % numberPerLine == 0){ // JA
					  System.out.println();
				  }
// JA			  }
			
			
		}
		
		
	}

}
