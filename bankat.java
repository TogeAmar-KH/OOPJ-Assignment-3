class Account{
	int accountNo;
	int balance;

	public Account(int accountNo,int balance){
	
		this.accountNo=accountNo;
		this.balance=balance;
	}
}

class savingAccount extends Account{

	int interestRate;

	public savingAccount(int accountNo,int balance,int interestRate){
	
		super(accountNo,balance);
		this.interestRate=interestRate;
	}

	void display(){

                System.out.println("Savings ac ="+accountNo+"Balance ="+balance+"Interest = "+interestRate);
        }

}
class currentAccount extends Account{

        int overdraft;

        public currentAccount(int accountNo,int balance,int overdraft){

                super(accountNo,balance);
                this.overdraft=overdraft;
        }

	void display(){
	
		System.out.println("current ac ="+accountNo+"Balance ="+balance+"Overdraft = "+overdraft);
	}

}

class bankat{

	public static void main(String args[]){
	

		savingAccount sa=new savingAccount(101,5000,5);
		currentAccount ca=new currentAccount(102,10000,2000);

		sa.display();
		ca.display();
	}

}

