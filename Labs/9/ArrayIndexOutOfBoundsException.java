
public class ArrayIndexOutOfBoundsException extends Exception{
    
	public ArrayIndexOutOfBoundsException(double array[], double index){
	    double maximum = array[0];
		for(int i = 0 ; i < 50; i++){
	    	if(array[i] > maximum){
	    		maximum = array[i];
	    	}
	    }
		
		if(index < maximum || index > 0){
			throw new IllegalArgumentException("The index is in bounds");

		} else{
			throw new IllegalArgumentException("Index is out of bounds");
		}
	}
}
