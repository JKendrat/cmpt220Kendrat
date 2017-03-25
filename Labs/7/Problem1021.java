import java.lang.Integer;
public class Problem1021 {
    // JA: This problem requires you to use BigInteger
	public static void main(String[] args) {
		// John Kendrat CMPT 220
		int integer1 = 0;
		int i = 0;
		while(integer1 != 10){
			i++;
			if(Long.MAX_VALUE % (5 * i) == 0){
				System.out.println(Long.MAX_VALUE % (5 * i));
			} else if(Long.MAX_VALUE % (6 * i) == 0){
				System.out.println(Long.MAX_VALUE % (6 * i));
			}
		}
		

		
		
	}
    	

}
