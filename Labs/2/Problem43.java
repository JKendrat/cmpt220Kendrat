import java.util.Scanner;
public class Problem43 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String character = input.nextLine();
		
		// JA: You are missing the lower case vowels.
		if(character.contains("A") || character.contains ("E") || character.contains ("I") || character.contains("O") || character.contains("U")){
			System.out.println(character + " is a vowel");
		} else if(character.contains("B") || character.contains("C") || character.contains("D") || character.contains("F") || character.contains("G") || character.contains("H")){
			System.out.println(character + " is a consonant");
		} else if(character.contains("J") || character.contains("K") || character.contains("L") || character.contains("M") || character.contains("N") || character.contains("P")){
			System.out.println(character + " is a consonant");
		} else if(character.contains("Q") || character.contains("R") || character.contains("S") || character.contains("T") || character.contains("V") || character.contains("W")){
			System.out.println(character + " is a consonant");
		} else if(character.contains("X") || character.contains("Y") || character.contains("Z")){
			System.out.println(character + " is a consonant");
		} else{
			System.out.println(character + " is not a valid letter");
		}

	}

}
