public class WeekendPractice{
	
	int while_i = 100,
			dowhile_i = 100;
	
	public void whileloop(){
		System.out.println("whileloop results: ");
		while (while_i <=10){
			System.out.println("While Loop i:"+ while_i);
			while_i++;
		}
	}
	
	public void dowhileloop(){
		System.out.println("dowhileloop results: ");
		do {
			System.out.println(dowhile_i);
			dowhile_i++;
		} while (dowhile_i <= 10);
	}
	
	public void forloop() {
		int sum = 0;
		System.out.println("forloop results: ");
		for (int count = 1; count <= 10; count++)
			sum += count;
	}
	
	public void whileloop2(){
		int sum = 0, count = 1;
		
		System.out.println("whileloop2 results: ");
		while (count <=10) {
			sum+=count;
			count++;
		}
	}
	
	public void dowhile() {
		int sum = 0, count = 1;
		
		System.out.println("dowhile results: ");
		do {
			sum += count;
			count++;
		} while (count <= 10);
			
	}	
	
	public void MultiplicationTable() {
		int i, j;
		System.out.println("MultiplicationTable() results: ");
		for(i=1; i<=9; i++){
			for (j=1; j<=9; j++)
				System.out.print(i+"*"+j+"="+i*j+"\t");
			System.out.println();
		}	
	}
	
	public static void main(String[] s){
	
	WeekendPractice a = new WeekendPractice();
	
	a.whileloop();
	a.dowhileloop();
	a.forloop();
	a.whileloop2();
	a.dowhile();
	a.MultiplicationTable();
	}
}