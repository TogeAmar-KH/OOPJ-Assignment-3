class temp{

	private int temperature;

	void setTemperature(int t){
	
		if(t>0 && t<100){
		
			temperature=t;
		}
		else{
		
			System.out.println("temperature out of range");
		}
	}
	int getTemperature(){
	
		return temperature;
	}

	public static void main(String args[]){
	
		temp t=new temp();
		t.setTemperature(-5);
		t.getTemperature();
	}
}
