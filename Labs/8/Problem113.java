
public class Problem113 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
		Account2 account = new Account2(1011, 1000, 0.05);
		CheckingAccount checkingaccount = new CheckingAccount(1000);
		SavingsAccount savingsaccount = new SavingsAccount(1000);
		
		System.out.println(account.toString());
		System.out.println(checkingaccount.toString());
		System.out.println(savingsaccount.toString());
		
	}

}
