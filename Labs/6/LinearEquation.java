public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    
    LinearEquation(){
    	
    }
    LinearEquation(double new_a, double new_b, double new_c, double new_d, double new_e, double new_f){
    	a = new_a;
    	b = new_b;
    	c = new_c;
    	d = new_d;
    	e = new_e;
    	f = new_f;
    }
    
    //Gets the designated variable
    double geta(){
    	return a;
    }
    double getb(){
    	return b;
    }
    double getc(){
    	return c;
    }
    double getd(){
    	return d;
    }
    double gete(){
    	return e;
    }
    double getf(){
    	return f;
    }
    //Determines if the equation has a solution
    boolean isSolvable(){
    	if((a * d) - (b * c) == 0){
    		return false;
    	} else{
    		return true;
    	}
    }
    //Return the solution for the following equation
    double getX(){
    	return ((e * d) - (b * f)) / ((a * d) - (b * c)); 
    }
    double getY(){
    	return ((a * f) - (e * c)) / ((a * d) - (b * c)); 
    }
    
}

