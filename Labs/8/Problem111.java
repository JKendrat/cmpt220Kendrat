import java.util.Scanner;
public class Problem111 {

	public static void main(String[] args) {
		//John Kendrat CMPT 220
		double side1 = 1.0;
		double side2 = 1.0;
		double side3 = 1.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first side of the Triangle");
		side1 = input.nextDouble();
        System.out.println("Enter the second side of the Triangle");
		side2 = input.nextDouble();
		System.out.println("Enter the third side of the Triangle");
		side3 = input.nextDouble();
		
		
		Triangle triangle = new Triangle(side1, side2, side3);
		
		System.out.println("What is the color of the triangle?");
		String color = input.nextLine();
		triangle.setColor(color);
		
		System.out.println("Is the triangle filled? Type yes or no:");
		String filled = input.nextLine();
		if(filled == "yes"){
			triangle.setFilled(true);
		} else{
			triangle.setFilled(false);
		}
		
		System.out.println("The area of the triangle is: " + triangle.getArea());
		System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
		System.out.println("The color of the triangle is: " + triangle.getColor());
		System.out.println("The fillness of the triangle is: " + triangle.isFilled());
		
        
	}

}
