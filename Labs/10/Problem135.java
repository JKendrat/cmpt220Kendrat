import java.util.Scanner;

public class Problem135 {

	public static void main(String[] args) {
		//John Kendrat CMPT 220
		
		Rectangle geoObject1 = new Rectangle(1, 5, 1, 5);
		Rectangle geoObject2 = new Rectangle(2, 10, 2, 10);
		Circle geoObject3 = new Circle(10);
		Circle geoObject4 = new Circle(20);
        
		rectangleMax(geoObject1, geoObject2);
		circleMax(geoObject3, geoObject4);
	}
	 public static String circleMax(Circle circle1, Circle circle2){
	    	double x = circle1.getArea();
	    	double y = circle2.getArea();
	    	if(x < y){
	    		return "The first triangle is the largest of the two";
	    	} else{
	    		return "The second triangle is the largest of the two";
	    	}
	    }
	 public static String rectangleMax(Rectangle rectangle1, Rectangle rectangle2){
	    	double x = rectangle1.getArea();
	    	double y = rectangle2.getArea();
	    	if(x < y){
	    		return "The first rectangle is the largest of the two";
	    	} else{
	    		return "The second rectangle is the largest of the two";
	    	}
	    }
	 

}
