public class animal {
	//Lab 4 - Animal class

	private int age=0;
	private double weight=0;
	
	public animal(int age, double weight){
	this.age = age;
	this.weight = weight;	
	speak();
	}
	
	private void speak(){
		System.out.printf("I am a %d year old animal weighing %.2f kg!", age, weight);				
	}
	
	public static void main(String[] args){
	animal cat = new animal(2, 5.0);
	
		
	}
	
}