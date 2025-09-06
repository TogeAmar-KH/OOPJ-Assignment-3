class vehiclet{

	String brand;
	int speed;

	public vehiclet(String brand,int speed){
	
		this.brand=brand;
		this.speed=speed;
	}
}

class car extends vehiclet{

	String modelType;

	public car(String brand,int speed,String modelType){
	
		super(brand,speed);
		this.modelType=modelType;
	}

	void display(){
	
		System.out.println(brand+" "+modelType+" "+speed);
	}
}

class bike extends vehiclet{

        String modelType;

        public bike(String brand,int speed,String modelType){

                super(brand,speed);
                this.modelType=modelType;
        }

        void display(){

                System.out.println(brand+" "+modelType+" "+speed);
        }
}

class vehicle{

	public static void main(String args[]){
	
		car c=new car("Honda",180,"Civic");
		bike b=new bike("Yamaha",120,"R15");

		c.display();
		b.display();
	}
}

