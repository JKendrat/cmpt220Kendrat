
public class Problem74 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
        
		int average = 0;
        int total = 0;
        int numberofintegers = 0;
		int[] myArray = new int[100];
        
          for(int i = 0; i <= 100; i++){
        
        int integer = (int) (Math.random()*50 + 1);
        myArray[i] = integer;
        total = total + integer;
        numberofintegers++;
        average = total/numberofintegers;
        if(integer > average){
        	System.out.println(integer + " is higher than the average");
        } else if(integer < average){
        	System.out.println(integer + " is lower than the average");
        } else{
        	System.out.println(integer + " is equal to the average");
        }
        }
        
	}

}
