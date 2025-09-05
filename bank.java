class bank{

	private double balance;

	void deposit(double depbalance){
	
		balance=balance+depbalance;
		System.out.println("Deposit = "+depbalance);
	
	}
	void withdraw(double withbalance){
	
		if((balance-withbalance)>0){
		
			balance=balance-withbalance;
			System.out.println("Withdraw = "+withbalance);
		}
		else{
		
			System.out.println("not enough funds");
		}
	}

       	double getBalance(){
	
		return balance;
	}

	public static void main(String args[]){
	
		bank b=new bank();

		b.deposit(5000);
		b.withdraw(7000);

		System.out.println("Updated Balance = "+b.getBalance());

	}


}
