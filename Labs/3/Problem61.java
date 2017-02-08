
public class Problem61 {
	
	public static void main(String[] args) {
		// John Kendrat CMPT 220
    for(int j = 0; j < 100; j++){
		
		System.out.print(getPentagonalNumber(j) + " ");
		if(j % 10 == 0){
			System.out.println("\n ");
		}
     }
	
	}

	public static int getPentagonalNumber(int n){
		
		
		int value = n;
		n = value * ((3 * value) - 1)/2;
		return n;
		
	}
	
		
		
		
	
	
	
}
