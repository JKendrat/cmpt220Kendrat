
public class Problem69 {

	public static void main(String[] args) {
		//John Kendrat CMPT 220 
		
		// Display the table heading
		  System.out.println("Feet    Meters    |   Meters     Feet");
		  
		  // Display the number title
		  System.out.print("    ");
		  System.out.println(footToMeter(1) + meterToFoot(1));
		  
		  
		  
	}
	public static double footToMeter(double foot){
	double meters = 0.305;
		for(int i = 1; i <= 10; i++){
		System.out.println("\n    "+ i + "     " + i*0.305 ); 
		// JA: To be side by side, this should had been a print instead of println
		
	}
       return foot;
    }
	
	public static double meterToFoot(double meter){
		double meters = 0.305;
			for(int i = 20; i <= 65; i+=5){
			System.out.println("\n    "+ i + "     " + i * 3.279);
			 // JA: To be side by side, this should had been a print instead of println
		}
	       return meter;
	    }
}
