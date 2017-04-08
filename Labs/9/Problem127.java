
public class Problem127 {

	public static void main(String[] args) {
		
		// JA
		try{
			System.out.println(bin2Dec("111"));
			System.out.println(bin2Dec("345"));
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	public static int bin2Dec(String binaryString) throws NumberFormatException{ // JA
		// JA: This is not right. You have to make sure it is binary (0,1)
		int newDecimal = Integer.parseInt(binaryString);
		return newDecimal;
	}

}
