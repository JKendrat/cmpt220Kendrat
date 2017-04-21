
public class Circle extends GeometricObject{
	
    private double newRadius; 
	//Default circle
	Circle(){ 
    
    }
    
    Circle(double radius){
    	
    	newRadius = radius;
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

	@Override
	public int compareTo(Number o) {
		
		return 0;
	}
	

}
