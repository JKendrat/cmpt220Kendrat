
public class IllegalTriangleException extends Exception{
	
	public IllegalTriangleException(double side1, double side2, double side3){
	
	if(side1 + side2 <= side3)
		throw new IllegalArgumentException("The sum of the two sides is not greater than the other side");

	else if(side2 + side3 <= side1)
		throw new IllegalArgumentException("The sum of the two sides is not greater than the other side");

	else if(side1 + side3 <= side2)
		throw new IllegalArgumentException("The sum of the two sides is not greater than the other side");

	
		
	}
}
