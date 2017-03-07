
public class Location {
    int rows;
    int columns;
    double location; 
	Location(){
		
	}
	Location(int newRows, int newColumns, double Location){
		location = Location;
		rows = newRows;
		columns = newColumns;
	}
	
	public static Location locateLargest(double[][] a){
    	double greatestValue = a[0][0];
    	int rowOfGreatest = 0;
    	int columnOfGreatest = 0;
    	for(int row = 0; row < a.length; row++){
        	for(int column = 0; column < a[row].length; column++){
        		if(greatestValue < a[row][column]){
        			greatestValue = a[row][column];
        			 rowOfGreatest = row;
        	    	 columnOfGreatest = column;
        		}
        	}
        }
    	
		System.out.println("The greatest integer is located at (" + rowOfGreatest + ", " + columnOfGreatest);
		return new Location();
    	
    }
}
