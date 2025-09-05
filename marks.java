class marks{

	private int marks;

	void setMarks(int marks){

		if(marks >=0 && marks<=100){
		this.marks=marks;
		}

	}

	int getMarks(){
	
		return marks;
	}

	public static void main(String args[]){
	
		marks m=new marks();
		m.setMarks(85);
		System.out.println("marks = "+m.getMarks());


	}
}
