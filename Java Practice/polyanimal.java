public class polyanimal extends animal {
	// Lab 6 - Polymorph
	private String name;
	
	public polyanimal(int age, double weight){
		super(age, weight);		
	}
	
	public polyanimal(int age, double weight, String name){
		super(age, weight);		
		this.name = name;			
	}
	
	void speak(){		
		super.speak();		
		System.out.printf("My name is %s!%n", name);
	}
	
	
	public static void main(String[] args){
			animal cat = new animal(3, 8.0);
			animal bobby = new polyanimal(8, 1200.0, "Elephant");	
			// ^dat poly         ^dat subclass
			
			cat.speak();
			bobby.speak();				
	}

}