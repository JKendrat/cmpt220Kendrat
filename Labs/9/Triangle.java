
public class Triangle {
    
	public static void main(String[] args) {
		// John Kendrat CMPT 220
		try{
			new TriangleWithException(2, 2, 2);
			new TriangleWithException(1, 2, 3);
			new TriangleWithException(20, 20, 17);
			// JA
			new TriangleWithException(3, 4, 8);

		}
		catch(IllegalTriangleException ex){
			System.out.println(ex);
		}

	}	
	
	
}
class TriangleWithException{	
	
	public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException{
		
	}
	
	
}