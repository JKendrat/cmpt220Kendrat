import java.util.Date;
public class Problem97 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
        Account account1 = new Account(1122, 20000, 0.045);
        
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println("The total balance is: " + account1.getBalance());
        System.out.println("The monthly interest is: " + account1.getMonthlyInterest());
        System.out.println("The date this account was made was: " + account1.dateCreated());
	}

}
