
public class Rectangle {
	//John Kendrat CMPT 220
		double width;
		double height;
		double area;
		double perimeter;
		//Construct a rectangle object
		Rectangle()  {
		}
		//Construct another rectangle object
		Rectangle(double newWidth, double newHeight){
			width = newWidth;
			height = newHeight;
		}
		//Get the perimeter of the rectangle
		public double getPerimeter(){
			return (2 * width) + (2 * height);
			
		}
		//Get the area of the rectangle
		public double getArea(){
			return width * height;
			
		}
		
		
	
}
