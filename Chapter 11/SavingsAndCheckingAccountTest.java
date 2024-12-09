class SavingsAndCheckingAccountTest {
	public static void main(String[] args) {
		Account hi = new Account(10,3000);
		CheckingAccount bye = new CheckingAccount(1,70,300);
		SavingsAccount aloha = new SavingsAccount(20,2);
		System.out.print(hi.toString()+ "\n"+bye.toString()+"\n"+aloha.toString());
	}
}