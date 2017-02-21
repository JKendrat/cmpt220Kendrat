import java.util.Scanner;
public class Problem711 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
        Scanner input = new Scanner(System.in);
        //Creates List
        System.out.println("Enter ten numbers:");
        double[] list = new double[10];
        for(int i = 0; i < 10; i++){
        	list[i] = input.nextDouble();
        }
        mean(list);
        deviation(list);
	}
	
	public static double deviation(double[] x){
		double summationmean = 0;
		for(int i = 0; i < 10; i++){
			summationmean = (x[i] - mean(x)) * (x[i] - mean(x));
		}
		double deviation = Math.sqrt(summationmean/9);
		return deviation;
	}
	
	
	public static double mean(double[] x){
		double total = 0;
		int numberofnumbers = 0;
		for(int i = 0; i < 10; i++){
			total = x[i] + total;
			numberofnumbers++;
		}
		double mean = total/numberofnumbers;
		return mean;
	}

}
