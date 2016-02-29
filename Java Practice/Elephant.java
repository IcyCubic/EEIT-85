public class Elephant extends animal {
	// Lab 5 - Inheritance
	private String name;
	
	public Elephant(int age, double weight){
		super(age, weight);		
	}
	
	public Elephant(int age, double weight, String name){
		super(age, weight);		
		this.name = name;			
	}
	
	void speak(){		
		super.speak();		
		System.out.printf("My name is %s!%n", name);
	}
	
	
	public static void main(String[] args){
			animal cat = new animal(3, 8.0);
			Elephant bobby = new Elephant(8, 1200.0, "Elephant");	
			
			cat.speak();
			bobby.speak();				
	}

}