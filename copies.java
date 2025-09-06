class copies{

	private int copiesAvailable;

	void addCopies(int n){
	
		copiesAvailable=copiesAvailable+n;
	}

	void removeCopies(int n){
	
		if(copiesAvailable-n>0){
		
			copiesAvailable=copiesAvailable-n;
		}
		else{
		
			System.out.println("not enough copies to remove");
		}
	}

	int getCopiesAvailable(){
	
		return copiesAvailable;
	}

	public static void main(String args[]){
	
		copies ca=new copies();
		ca.addCopies(3);
		ca.removeCopies(1);
		System.out.println("copies available = "+ca.getCopiesAvailable());
	}
}
