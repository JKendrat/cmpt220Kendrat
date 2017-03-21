
public class Problem103 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		MyInteger my = new MyInteger(6);
		
		if(my.isEven(6)){
			System.out.println("The number is even");
		}
		
		if(my.isOdd(6)){
			System.out.println("The number is odd");
		}
		
		if(my.isPrime(6)){
			System.out.println("The number is a prime number");
		}
		
		System.out.println(my.equals(6));
		
		System.out.println(my.parseInt("1234"));
			
		
		
		

	}

}
