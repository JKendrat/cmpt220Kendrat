
public class Circle2D {
    private int newX;
    private int newY;
    private double newRadius; // JA
	//Default circle
	Circle2D(){ // JA
    	this(0, 0, 1);
    }
    
    Circle2D(int x, int y, double radius){
    	newX = x; // JA
    	newY = y; // JA
    	newRadius = radius;
    }
    
    
    
    public int getX(){
    	return newX;
    }
    
    public int getY(){
    	return newY;
    }
    
    public double getRadius(){ // JA
    	return newRadius;
    }
    
    public double getPerimeter(){
    	return 2 * (Math.PI * newRadius);
    }
    
    public double getArea(){
    	return Math.PI * (newRadius * newRadius);
    }
    
    public boolean contains(double x, double y){
    	if(x <= newX && y <= newY){
    		return true;
    	} else{
    		return false;
    	}
    }
    public boolean contains(Circle2D circle){
    	if(circle.getPerimeter() <= this.getPerimeter() && contains(circle.getX(), circle.getY()) == true){
    		return true;
    	} else{
    		return false;
    	}
    }
    public boolean overlaps(Circle2D circle){
    	if(circle.getPerimeter() >= this.getPerimeter() && circle.getX() < this.getX() || circle.getY() < this.getY()){
    		return true;
    	} else{
    		return false;
    	}
    }
}
