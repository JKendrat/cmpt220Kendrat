import java.util.Scanner;
public class Problem420 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String sentence = input.nextLine();
    
    System.out.println("The first character in your sentence is " + sentence.charAt(0) + " and your string has a length of " + sentence.length());
	}

}
