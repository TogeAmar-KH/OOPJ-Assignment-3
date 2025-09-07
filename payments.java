abstract class payment{

	abstract void pay();

}

class creditCardPayment extends payment{

	long cardNumber;
	int ammount;

	public creditCardPayment(long cardNumber,int ammount){
	
		this.cardNumber=cardNumber;
		this.ammount=ammount;
	}

	void pay(){
	
		System.out.println("card Number = ="+cardNumber+" ammount "+ammount);
	}

}
class UpiPayment extends payment{

        String upiId;
        int ammount;

        public UpiPayment(String upiId,int ammount){

                this.upiId=upiId;
                this.ammount=ammount;
        }

        void pay(){

                System.out.println("Upi Id ="+upiId+" ammount "+ammount);
        }

}


class payments{

	public static void main(String args[]){
	
		creditCardPayment ccp=new creditCardPayment(1223456765432L,5000);
		UpiPayment upip=new UpiPayment("rahul@upi",2000);

		ccp.pay();
		upip.pay();
	
	}
}
