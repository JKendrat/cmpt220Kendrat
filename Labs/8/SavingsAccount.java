
public class SavingsAccount extends Account2{
    private double Balance = 0;
    
	SavingsAccount(){
    	
    }
    
    SavingsAccount(double balance){
    	Balance = balance; // JA
    }
    
    public double getBalance(){
    	return Balance;
    }
    
    double withdraw(double withdrawal){
    	Balance = Balance - withdrawal;
    	if(Balance < 0){
    		System.out.println("You cannot take out more money then you have");
    		Balance = 0;
    	} else{
    		System.out.println("You now have " + Balance + " in your account");
    	}
    	return Balance;
    }
    
    public String toString(){
		   return "The balance is: " + Balance ;
	   }
   
}
