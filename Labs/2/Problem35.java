import java.util.Scanner;
public class Problem35 {
	
	public static void main(String[] args) {
		//John Kendrat CMPT220
		Scanner input = new Scanner(System.in);
		//Ask user for the day
		System.out.println("Enter today's day: ");
		int day = input.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
	    int otherday = input.nextInt();
	    
	    
	    switch(day % 7){
	    case 0: System.out.println("Today is Sunday");break;
	    case 1: System.out.println("Today is Monday");break;
	    case 2: System.out.println("Today is Tuesday");break;
	    case 3: System.out.println("Today is Wednesday");break;
	    case 4: System.out.println("Today is Thursday");break;
	    case 5: System.out.println("Today is Friday");break;
	    case 6: System.out.println("Today is Saturday");break;
	    }
	    
	    switch((day + otherday) % 7){
	    case 0: System.out.println("The future day is Sunday");break;
	    case 1: System.out.println("The future day is Monday");break;
	    case 2: System.out.println("The future day is Tuesday");break;
	    case 3: System.out.println("The future day is Wednesday");break;
	    case 4: System.out.println("The future day is Thursday");break;
	    case 5: System.out.println("The future day is Friday");break;
	    case 6: System.out.println("The future day is Saturday");break;
	    
	    
	    
	  
	    }
	   
	    
	    
	    
	    
	 
	    
	}
}
