import java.util.Scanner;
public class Problem25 {

	public static void main(String[] args) {
		// Gratuity rate calculator
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("Enter the subtotal: ");
        total = scanner.nextShort();
        double gratuity = 0;
        System.out.println("Enter the Gratuity Rate: ");
        gratuity = scanner.nextShort();
        gratuity = gratuity/total;
        total = total + gratuity;
        System.out.println("Your gratuity is " + gratuity + " and your total is " + total);
	}

}
