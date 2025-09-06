class Employee{

	String name;
	int basicSalary;

	public Employee(String name,int basicSalary){
	
		this.name=name;
		this.basicSalary=basicSalary;
	}
}


class regularEmployee extends Employee{

	int netSalary;

	public regularEmployee(String name,int basicSalary){
		
		super(name,basicSalary);
	
		netSalary=basicSalary+(int)(basicSalary*0.10);
	}
	
	void displaySalary(){
	
		System.out.println(name+" Net Salary "+netSalary);
	}	
}
class contractEmployee extends Employee{

        int netSalary;

	public contractEmployee(String name,int basicSalary){
	
		super(name,basicSalary);
		netSalary=basicSalary+(int)(basicSalary*0.05);
	
	}

        void displaySalary(){

                System.out.println(name+" Net Salary "+netSalary);
        }
}

class employeeh{

	public static void main(String args[]){
	
		regularEmployee re=new regularEmployee("Rahul",20000);
		contractEmployee ce=new contractEmployee("Riya",15000);

		re.displaySalary();
		ce.displaySalary();
	}
}

