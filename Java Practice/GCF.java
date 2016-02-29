public class GCF {
	// Practice problem: Find the greatest common factor of 1000 and 495
	
	
	private int gcd_W(int a, int b) {
//Used Euclid's algorithm
	
	while (b > 0) {
		int temp = b;
		b = a%b;
		a = temp;		
		}
	return a;
	}	

	private static int gcd_R(int a, int b){
//Recurssive solution
  	return (b == 0) ? a : gcd_R(b, a%b);
  }
	
	public static void main (String args[]){
	GCF factor = new GCF();
	int v1 = 1000, v2 = 495 ;
	
	System.out.printf("(While Loop)\t The greatest common factor of %d and %d is %d.%n", v1, v2, factor.gcd_W(v1, v2));
  System.out.printf("(Recurrsive)\t The greatest common factor of %d and %d is %d.%n", v1, v2, factor.gcd_R(v1, v2));
	}
	
}