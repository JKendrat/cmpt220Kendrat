
public class Triangle extends GeometricObject{
private double side1 = 1.0;
private double side2 = 1.0;
private double side3 = 1.0;
//Constructs a no-arg Triangle and a triangle with 3 data points
	Triangle(){
	
    }
	
	Triangle(double Side1, double Side2, double Side3){
		side1 = Side1; // JA
		side2 = Side2; // JA
		side3 = Side3; // JA
	}
	//Gets the designated side of the triangle
	double getSide1(){
		return side1;
	}
	double getSide2(){
		return side2;
	}
	double getSide3(){
		return side3;
	}
	//Gets the Area
	double getArea(){
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt(s * (s - side1)* (s - side2) * (s - side3));
		
	}
	//Gets the Perimeter

	double getPerimeter(){
		return side1 + side2 + side3;
		
	}
	//Describes the Triangle to a String
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
