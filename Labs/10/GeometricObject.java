
public abstract class GeometricObject implements Comparable<Number>{
	private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    public GeometricObject(){
    	dateCreated = new java.util.Date();
    }
    
    public GeometricObject(String color, boolean filled){
    	dateCreated = new java.util.Date();
    	this.color = color;
    	this.filled = filled;
    }
    
    public void setColor(String color){
    	this.color = color;
    }
    
    public String getColor(){
    	return color;
    }
    
    public boolean isFilled(){
    	return filled;
    }
    
    public void setFilled(boolean filled){
    	this.filled = filled;
    }
    
    public java.util.Date getDateCreated(){
    	return dateCreated;
    }
    @Override
    public String toString(){
    	return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
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
    public static String circleMax(Circle circle1, Circle circle2){
    	double x = circle1.getArea();
    	double y = circle2.getArea();
    	if(x < y){
    		return "The first triangle is the largest of the two";
    	} else{
    		return "The second triangle is the largest of the two";
    	}
    }
}
