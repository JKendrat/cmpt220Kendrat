
public class Problem616 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		int k = 2000;
		for(int i = 0; i < 21; i++){
			
			System.out.println("The number of days in year " + k + " are: " + numberOfDaysInAYear(i));
			k++;
		}

	}
	
	public static int numberOfDaysInAYear(int year){
		if(year % 4 == 0 || year % 400 == 0){
			year = 366;
		} else{
			year = 365;
		}
		return year;
		
	}

}
