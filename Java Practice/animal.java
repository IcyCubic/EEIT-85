public class animal {
	//Lab 4 - Animal class

	private int age=0;
	private double weight=0;
	
	public animal(int age, double weight){
	this.age = age;
	this.weight = weight;		
	}
	
	void speak(){
		System.out.printf("I am a %d year(s) old and I weigh %.2f kg(s)!%n", age, weight);				
	}
	
//	public static void main(String[] args){
//	animal cat = new animal(2, 5.0);
//	
//		
//	}
	
}