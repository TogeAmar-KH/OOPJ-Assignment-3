class animals{

	void makeSound(){
	
		System.out.println("");
	}
}

class dog extends animals{

	@Override
	void makeSound(){

                System.out.println("Bhau bhau");
        }


}

class cat extends animals{

        
        void makeSound(){

                System.out.println("Meow");
        }


}

class animal{

	public static void main(String args[]){

		dog d=new dog();
		cat c=new cat();

		d.makeSound();
		c.makeSound();

	}

}



