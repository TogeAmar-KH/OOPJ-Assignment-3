class employee{

	private int age;

	void setAge(int age){
	
		if(age>=18){
		
			this.age=age;
		}
		else{
		
			System.out.println("invalid Age");  
		}
	}

	int getAge(){
	
		return age;
	}

	public static void main(String args[]){
	
		employee e=new employee();
		e.setAge(17);

	}

}
