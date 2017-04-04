import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1211 {
		
		public static void main1(String[] args) {
			Scanner input = new Scanner(System.in);
			if (args.length != 2) {
	            System.out.println("Invalid arguments.");
	            System.out.println("Usage: java Chapter_12.11 John filename");
	            System.exit(1);
	        }

	        // Check if the filename exist
	        File filename = new File(args[1]);
	        if (!filename.exists()) {
	            System.out.println(args[1] + " does not exist.");
	            System.out.println(2);
	        }
	        
	        String newName = "";
	        while (input.hasNext()) {
                newName += input.nextLine();
            }
	        
	        newName.replaceAll(args[0], "");
	        
            System.out.println(newName);
            
		}
	
}

