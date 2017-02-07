import java.util.Scanner;
public class Problem63 {
	
	public static void main(String[] args) {
		// John Kendrat CMPT 220
        
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
        int integer = input.nextInt();
        
        
        
        if(isPalindrome(reverse(integer)) == true){
        System.out.println("The number " + integer + " is a Palindrome ");
        } else{
        	System.out.println("The number " + integer + " is not a Palindrome ");
        }
        
	}

	
	
	public static int reverse(int number){
		
	    int n = 0;
	    while(number != 0){
	    	n = (n*10) + (n%10);
	    	number = number/10;
	    }
	    
	    return n;
		  
		
	}
	
	public static boolean isPalindrome(int number){
		if(number == reverse(number)){
			return true;
		} else{
			return false;
		}
		
	}
	
	
	
	
	
	
}
