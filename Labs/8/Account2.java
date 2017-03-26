import java.util.Date;

public class Account2 {
	private int Id;
	private double balance;
	private double annualInterestRate;
	double monthlyInterestRate;
    //Makes an empty account
	Account2(){
	}
	Account2(int newId, double newBalance, double newAnnualInterestRate){
		Id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	int getId(){
		return Id;
	}
	double getBalance(){
		return balance;
	}
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
    //Creates the date that the account was created
    Date dateCreated(){
    	Date creationDate = new Date();
    	return creationDate;
    }
    //Gets the monthly interest rate
    double getMonthlyInterestRate(){
    	return monthlyInterestRate = annualInterestRate/12;
    	
    }
    //Gets the monthly interest
    double getMonthlyInterest(){
    	return balance * annualInterestRate/12;
    }
    //Performs a withdrawal on the account
   double withdraw(double withdrawal){
    	balance = balance - withdrawal;
    	
    	return balance;
    }
   //Performs a deposit on the account
   double deposit(double deposit){
	   balance = balance + deposit;
	   return balance;
   }
   
   public String toString(){
	   return "Account: Id " + Id + " balance is: " + balance + " annualInterestrate: " + annualInterestRate;
   }
}
