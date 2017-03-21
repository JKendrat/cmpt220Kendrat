
public class MyInteger {
    
    int value;
    //Creates a constructor for the integer
    MyInteger(){
    	
    }
    
    MyInteger(int myInteger){
    	value = myInteger;
    }
    //Gets the integer
	int getInt(){
		return value;
	}
	
	//Determines if even, odd, or prime for the integer
	boolean isEven(int value){
    	if(value % 2 == 0){
    		return true;
    	} else{
    		return false;
    	}
    }
	
	boolean isOdd(int value){
    	if(value % 2 == 0){
    		return false;
    	} else{
    		return true;
    	}
    }
	boolean isPrime(int value){
    	for(int i = 2; i < value; i++){
    		if(value % i == 0){
    			return false;
    		}
    		
    	}
    	return true;
    }
	//Determines if even, odd, or prime for MyValue
	boolean isEven2(int MyInteger){
    	if(value % 2 == 0){
    		return true;
    	} else{
    		return false;
    	}
    }
	
	boolean isOdd2(int MyInteger){
    	if(value % 2 == 0){
    		return false;
    	} else{
    		return true;
    	}
    }
	boolean isPrime2(int MyInteger){
    	for(int i = 2; i < value; i++){
    		if(value % i == 0){
    			return false;
    		}
    		
    	}
    	return true;
    }
	//checks if the object equals the specified value
	boolean equals(int integer1){
		if(integer1 == value){
			return true;
		} else{
			return false;
		}
	}
	boolean equals2(int MyInteger){
		if(value == MyInteger){
			return true;
		} else{
			return false;
		}
	}
	
	//Converts a string into an int value
	int parseInt(String value){
		return Integer.parseInt(value);
	}
	
	static int parseInt(char[] value){
		for(int i = 0; i < value.length; i++){
			value[i] = Integer.parseInt(value[i]);
		}
		 
	}
}
