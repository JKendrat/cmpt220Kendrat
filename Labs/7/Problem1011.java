
public class Problem1011 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println(c1.getArea()); // JA
		System.out.println(c1.getPerimeter()); // JA
		System.out.println(c1.contains(3, 3)); // JA
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5))); // JA
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3))); //JA

	}

}
