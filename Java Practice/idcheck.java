import java.util.Scanner;

public class idcheck {
	
	public static String getID() {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Input ID to check (Format: A123456789): ");
		return console.nextLine();
	}		
	
	/*
	getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
          Copies characters from this string into the destination character array.
	*/
	
	public static boolean checkID(String test) {
	  char[] d = new char[10];
	  int[] n = new int[10];
	  
	  int d0_int, x1, x2, y=0, checkCode;	  
	  char d0_char;
	  
	  
	  test.getChars(0, 10, d, 0);
	  d0_char = d[0];
	  
	  n[0]=(int)d[0];
	  
	  for (int i = 1; i <n.length; i++){
	  	n[i]=(int)d[i]-48;
	  }
	  
	  switch (d0_char) {
	  	case 'A':
				d0_int=10;
				break;
			case 'B':
				d0_int=11;
				break;
			case 'C':
				d0_int=12;
				break;
			case 'D':
				d0_int=13;
				break;
			case 'E':
				d0_int=14;
				break;
			case 'F':
				d0_int=15;
				break;
	  	case 'G':
				d0_int=16;
				break;
			case 'H':
				d0_int=17;
				break;
			case 'I':
				d0_int=34;
				break;
			case 'J':
				d0_int=18;
				break;
			case 'K':
				d0_int=19;
				break;
			case 'L':
				d0_int=20;
				break;
	  	case 'M':
				d0_int=21;
				break;
			case 'N':
				d0_int=22;
				break;
			case 'O':
				d0_int=35;
				break;
			case 'P':
				d0_int=23;
				break;
			case 'Q':
				d0_int=24;
				break;
			case 'R':
				d0_int=25;
				break;
	  	case 'S':
				d0_int=26;
				break;
			case 'T':
				d0_int=27;
				break;
			case 'U':
				d0_int=28;
				break;
			case 'V':
				d0_int=29;
				break;
			case 'W':
				d0_int=32;
				break;
			case 'X':
				d0_int=30;
				break;
			case 'Y':
				d0_int=31;
				break;
			case 'Z':
				d0_int=32;
				break;
			default:
			return false;
		}				
	
		x1=d0_int/10;
		x2=d0_int%10;
		y=(x1 + (9*x2)+(8*n[1])+(7*n[2])+(6*n[3])+(5*n[4])+(4*n[5])+(3*n[6])+(2*n[7])+n[8]);
		//  1     0       8       14        6       40        28      18       12      8
		
		checkCode = (10-(y%10))%10;
	 //debugging code	
	/*	System.out.println("x1=" +x1);
		System.out.println("x2=" +x2);
		System.out.println("y=" +y);
		System.out.println("d[9]=" +d[9]);
		System.out.println("checkCode=" + checkCode);
		System.out.println(x1 + (9*x2));
		for (int i=0; i<d.length; i++){
			System.out.println("["+(i)+"] = " + n[i]);
		}
		
		for (int i=0; i<d.length; i++){
			System.out.println("d["+(i)+"] = " + d[i]);
		}
		*/
		if (n[9] == checkCode)
			return true;
		else
			return false;		
	}

	public static void main(String[] args) {
	String testID = getID();
	
	System.out.printf(testID + (checkID(testID)?" is a valid ID number!":" is NOT a valid ID number!"));		
	}	
}



