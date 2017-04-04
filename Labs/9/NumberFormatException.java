
public class NumberFormatException extends Exception{
    
	public String NumberFormatException(String binaryString){
		String result = null;
		for(int i = binaryString.length(); i >= 0; i--){
			if(i > 1){
				 result = "This string is not a binary";
			} else{
				result =  "Continue with the code";
			}
		}
		return result;
	}
}
