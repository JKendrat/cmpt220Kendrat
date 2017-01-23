import java.util.Scanner;
public class Problem21 {

	public static void main(String[] args) {
		// Fahrenheit calculator
        Scanner scanner = new Scanner(System.in);
	    double celcius = 0;
	    System.out.println("Enter a number for Celcius");
		celcius = scanner.nextShort();
		double fahrenheit;
		fahrenheit = (9.0/5) * celcius + 32;
		System.out.println("The temperature in degrees fahrenheit is " + fahrenheit );
		
	}

}
