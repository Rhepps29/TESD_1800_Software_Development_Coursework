import java.util.*;

public class ATM {
	public static void main(String[] args) {
		Account[] id = new Account[10];
		for (int i = 0; i<10; i++){
			id[i] = new Account(i,100);
		}
		int currentid = 0;
		Scanner input = new Scanner(System.in);
		int choice;
		double amount;
		while (true){
			do{
				System.out.print("Enter an id: ");
				currentid = input.nextInt();
			}while (currentid > 9 || currentid < 0);
			do{
				System.out.println("Main Menu");
				System.out.println("1: Check Balance");
				System.out.println("2: Withdraw");
				System.out.println("3: Deposit");
				System.out.println("4: Exit");
				System.out.print("Enter a choice: ");
				choice = input.nextInt();
				if (choice == 1){
					System.out.println("The balance is "+ id[currentid].getBalance());
				}else if (choice == 2){
					System.out.print("Enter an amount to withdraw: ");
					amount = input.nextDouble();
					id[currentid].withdraw(amount);
				}else if (choice == 3){
					System.out.print("Enter an amount to withdraw: ");
					amount = input.nextDouble();
					id[currentid].deposit(amount);
				}
			}while (choice != 4);
		}
	}
}