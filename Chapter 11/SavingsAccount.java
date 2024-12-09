public class SavingsAccount extends Account {
	SavingsAccount(){}
	SavingsAccount(int id, double balance){
		super.setId(id);
		super.setBalance(balance);
	}
	@Override
	public void withdraw(double amount){
		if ((super.getBalance()-amount)>0){
			super.setBalance((super.getBalance())-amount);
		}else{
			System.out.println("A savings account cannot be overdrawn.");		
		}
	}
	@Override
	public String toString(){
		return "A savings account with ID "+super.getId()+ " and a balance of $"+ super.getBalance()+ " created on "+ super.getDateCreated()+ ". Savings accounts cannot be overdrawn.";
	}
}