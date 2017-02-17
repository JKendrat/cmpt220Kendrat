import java.util.Scanner;
public class Problem618 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.nextLine();
        
		System.out.println("The result of your password containing eight characters is " + atLeastEightCharacters(password));
	    System.out.println("The result of your password containing only letters and digits " + onlyLettersAndDigits(password));
	    System.out.println("The result of your password containing at least two digits is " + mustContainTwoDigits(password));
	}
	
	public static boolean atLeastEightCharacters(String s){
		if(s.length() >= 8){
			return true;
		} else{
			return false;
		}
	}
	
	public static boolean onlyLettersAndDigits(String s){
		char a;
    	for(int i = 0; i < s.length() - 1; i++){
			a = s.charAt(i);
			if(!Character.isLetterOrDigit(a)){
				return false;
			} else{
				return true; // JA: This returns true the first character or letter that it encounters, so it would not check the rest
			}
	
	}
    	return true;
}
    public static boolean mustContainTwoDigits(String s){
		char a;
    	int count = 1;
		
		for(int i = 0; i < s.length() - 1; i++){
			a = s.charAt(i);
			
			if(Character.isDigit(a)){
				count++;
				if(count > 2){ // JA: This checks for at most to digits, not at least
					return false; 
				}
			} 
		
    }
		return true;
		
    }

}
