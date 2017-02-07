
public class Problem55 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		      // Display the table heading
			  System.out.println("Kiilograms    pounds    |   Pounds     Kilograms");
			  int k = 20;
			  // Display the number title
			  System.out.print("    ");
			  
			  for (int j = 1; j <= 200; j+=2) {
				System.out.print("\n    " + j + "        " + j * 2.2);
				System.out.print("|       " + k + "         " + k /2.2     );
				k += 5;
				
			  }
			 
			  // Display the table body	
        
	}

}
