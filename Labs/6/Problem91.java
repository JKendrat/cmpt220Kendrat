
public class Problem91 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220;
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The width of rectangle1 is "+ rectangle1.width + " the width of rectangle2 is " + rectangle2.width);
		System.out.println("The height of rectangle1 is "+ rectangle1.height + " the height of rectangle2 is " + rectangle2.height);
		System.out.println("The area of rectangle1 is "+ rectangle1.getArea() + " the area of rectangle2 is " + rectangle2.getArea());
		System.out.println("The perimeter of rectangle1 is "+ rectangle1.getPerimeter() + " the perimeter of rectangle2 is " + rectangle2.getPerimeter());
		
	}
	

}
