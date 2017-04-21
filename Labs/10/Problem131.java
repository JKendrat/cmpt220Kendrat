import java.util.Scanner;
public class Problem131 {

	public static void main(String[] args) {
		//John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sides of the triangle");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		
		Triangle triangle1 = new Triangle(side1, side2, side3);
		
		System.out.println("What is the color of the Triangle?");
		String color = input.nextLine();
		
		System.out.println("Is the triangle filled?");
		Boolean filled = input.nextBoolean();
		
		System.out.println("The area of the triangle is: " + triangle1.getArea());
		System.out.println("The perimeter of the triangle is: " + triangle1.getPerimeter());
		System.out.println("The color of the triangle is: " + triangle1.getColor());
		System.out.println("Is the triangle filled: " + triangle1.isFilled());

	}
	
}
