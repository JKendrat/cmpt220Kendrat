import java.util.Scanner;
public class Problem29 {

	public static void main(String[] args) {
		// Gratuity rate calculator
        Scanner scanner = new Scanner(System.in);
        double startingvelocity = 0;
        System.out.println("Enter the starting velocity: ");
        startingvelocity = scanner.nextShort();
        double endingvelocity = 0;
        System.out.println("Enter the Ending Velocity: ");
        endingvelocity = scanner.nextShort();
        double seconds = 0;
        System.out.println("Enter the time in seconds: ");
        seconds = scanner.nextShort();
        double acceleration = (endingvelocity - startingvelocity) / seconds;
        System.out.println("The average acceleration was: " + acceleration);
	}

}