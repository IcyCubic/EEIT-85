public class IfElseVersion {
	public static void main (String s[]) {
		int area = 350, coverage = 200, count;
		count = area / coverage; //1
		
		if (area % coverage == 0) //false
			count += 0;
		else
			count +=1; //count is now 2
			
		System.out.print("Need " + count);
		
		if (count ==1) //false
			System.out.println(" can");
		else
			System.out.println(" cans");
	}
}