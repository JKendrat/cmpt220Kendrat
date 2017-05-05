import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class Form {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Scanner input = new Scanner(System.in);
		//Gets the users name
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		//Gets the date
		Date date = new Date();
		
		//Gets the users age
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		/**Gets the weight and height of the user and 
		 * uses it to get the BMI and checks to see if
		 * the BMI is healthy or not
		 */
		System.out.println("Enter your weight in pounds:");
		double weight = input.nextDouble();
		
		System.out.println("Enter your height in inches");
		double height = input.nextDouble();
		
		
		String BMI = checkBMI(getBMI(weight, height));
		
		//Measures the blood pressure of the user
		System.out.println("If you can measure your blood pressure, please enter the systolic and diastolic numbers now otherwise type in zero for both numbers");
		int systolic = input.nextInt();
		int diastolic = input.nextInt();
		String bloodpressure = checkBloodPressure(systolic, diastolic);
		
		//Gets all of the allergies that the user may have
		System.out.println("Do you have any allergies? If so how many?");
		int numberOfAllergies = input.nextInt();
		String[] allergies = new String[numberOfAllergies];
		System.out.println("Please enter which allergies you have one by one if you have any");
		
		for(int i = 0; i < numberOfAllergies; i++){
			allergies[i] = input.next();
		}
		//Gets any of the medications that the user may have as well as the frequency of their uses
		System.out.println("Do you use any medications? If so how many?");
		int numberOfMedications = input.nextInt();
		String[] medications = new String[numberOfMedications];
		Integer[] frequency = new Integer[numberOfMedications];
		System.out.println("Please enter which medications you use and how frequent you use them");
		
		
		for(int m = 0; m < numberOfMedications; m++){
			System.out.println("Enter the next medication");
			medications[m] = input.next();
			System.out.println("Enter how Frequent(per day) you use the medication");
			frequency[m] = input.nextInt();
		}
		//Prints out all of the information for the user to see 
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Date: " + date);
		System.out.println(BMI);
		System.out.println(bloodpressure);
		System.out.println("Allergies:");
		for(int z = 0; z < allergies.length; z++){
			System.out.println(allergies[z]);
		}
		for(int n = 0; n < medications.length; n++){
			System.out.println(medications[n] + " is used " + frequency[n] + " per day.");
		}
		

	}
	
	private static String checkBloodPressure(int systolic, int diastolic) {
	if(systolic == 0 && diastolic == 0){
		return "Information not available";
	}else{
		if(systolic >= 120 && systolic < 130 && diastolic >= 80 && diastolic < 85){
			return "Your blood pressure of " + systolic + "/" + diastolic + " is normal";
		} else if(systolic >= 120 && systolic < 139 && diastolic >= 80 && diastolic < 89){
			return "Your blood pressure of " + systolic + "/" + diastolic +  " is at risk";
		} else if(systolic >= 139 && diastolic > 89){
			return "Your blood pressure of "  + systolic + "/" + diastolic + "is dangerously high";
		} else{
			return "Your blood pressure of" + systolic + "/" + diastolic +  "is dangerously low";
		}
	}
}

	public static double getBMI(double weight, double height){
		double KGWeight = weight * 0.453592;
		double mHeight = height * 0.0254;
		
		double BMI = KGWeight / (mHeight * mHeight);
		return BMI;
	}
	
	public static String checkBMI(double BMI){
		if(BMI < 19){
			return "Your BMI reads underweight";
		} else if(BMI < 25){
			return "Your BMI reads healthy";
		} else if(BMI < 30){
			return "Your BMI reads overweight";
		} else{
			return "Your BMI reads obese";
		}
	}

}
