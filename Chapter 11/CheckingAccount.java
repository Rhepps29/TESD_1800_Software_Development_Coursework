public class CheckingAccount extends Account {
	private double limit = 0;
	CheckingAccount(){}
	CheckingAccount(int id, double balance, double limit){
		super.setId(id);
		super.setBalance(balance);
		this.limit = limit;
	}
	public double getLimit(){
		return limit;
	}
	public void setLimit(double limit){
		this.limit = limit;
	}
	@Override
	public void withdraw(double amount){
		if ((super.getBalance()-amount)>-limit){
			super.setBalance((super.getBalance())-amount);
		}else{
			System.out.println("Sorry, that's past the overdraft limit.");
		}
	}
	@Override
	public String toString(){
		return "A checking account with ID "+super.getId()+ ", overdraft limit of $"+limit+" and a balance of $"+ super.getBalance()+ " created on "+ super.getDateCreated()+ ".";
	}
}