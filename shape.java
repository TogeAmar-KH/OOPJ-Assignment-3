class shapeCalc{

	public double area(){
	
		return 0.0;
	}

}
class rectangle extends shapeCalc{
	
	double area(int length,int breadth){
		
			return length*breadth;
		}
	}

class circle extends shapeCalc{


	double area(int radius){
		
		return 3.14*radius*radius;
	}
}

public class shape{


	public static void main(String args[]){

	
		rectangle rect=new rectangle();
	
		circle circ=new circle();

	
		System.out.println("Rectangle Area = "+rect.area(5,10));
	
		System.out.println("Circle Area = "+circ.area(7));
	}
}
