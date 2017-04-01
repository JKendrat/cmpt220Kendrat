
public class CheckingAccount extends Account2{
private double Balance = 0;
private double limit = 100;
    
	CheckingAccount(){
    	
    }
    
    CheckingAccount(double balance){
    	Balance = balance; // JA
    }
    
    public double getBalance(){
    	return Balance;
    }
    
    double withdraw(double withdrawal){
    	Balance = Balance - withdrawal;
    	if(Balance < -limit){
    		System.out.println("You have gone over your limit");
    		Balance = -limit;
    	} else{
    		System.out.println("You now have " + Balance + " in your account");
    	}
    	return Balance;
    }
    
    public String toString(){
		   return "The balance is: " + Balance ;
	   }
}
