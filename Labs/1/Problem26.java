import java.util.Scanner;
public class Problem26 {

	public static void main(String[] args) {
		// Unit converter
		Scanner scanner = new Scanner(System.in);
		double value;
		System.out.println("Enter a value between 0 and 1000; ");
		value = scanner.nextShort();
		double thirddigit = value % 10;
		double seconddigit = (value / 10) % 10;
		double firstdigit = (value / 100) % 10;
		double digittotal = firstdigit + seconddigit + thirddigit;
		System.out.println("The sum of the digits in your number is " + digittotal);

	}

}
