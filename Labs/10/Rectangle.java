
public class Rectangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 2.0;
	private double side3 = 1.0;
	private double side4 = 2.0;
	//Constructs a no-arg Rectangle and a rectangle with 4 data points
		Rectangle(){
		
	    }
		
		Rectangle(double Side1, double Side2, double Side3, double Side4){
			side1 = Side1; 
			side2 = Side2;
			side3 = Side3;
			side4 = Side4;
		}
		//Gets the designated side of the Rectangle
		double getSide1(){
			return side1;
		}
		double getSide2(){
			return side2;
		}
		double getSide3(){
			return side3;
		}
		double getSide4(){
			return side4;
		}
		//Gets the Area
		double getArea(){
			
			return side1 * side2;
			
		}
		//Gets the Perimeter

		double getPerimeter(){
			return side1 + side2 + side3 + side4;
			
		}
		//Describes the Rectangle to a String
		public String toString(){
			return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + " side4 = " + side4;
		}

		@Override
		public int compareTo(Number o) {
			// TODO Auto-generated method stub
			return 0;
		}
}
