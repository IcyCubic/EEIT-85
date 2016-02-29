public class TestString {
	
	public static void main(String args[]) {
/*
      String str1 = new String("hello");
     	String str2 = new String("hello");
     	String str3 = "hello";
     	String str4 = "hello";
     	
     	System.out.println(str1==str2);          //false
     	System.out.println(str3==str4);          //true   ※ String pool
     	System.out.println(str1==str3);          //false
     	System.out.println(str2==str4);          //false
      
      System.out.println("--------");     	
     	
     	System.out.println(str1.equals(str2));   //true
     	System.out.println(str3.equals(str4));   //true
     	System.out.println(str1.equals(str3));   //true
     	System.out.println(str2.equals(str4));   //true
*/





/*
        //測試 char charAt(int index)
        
        // Standard by the books way of doing it
        String s = "0123456789";
        char c = s.charAt(5);
        System.out.println(c);
        
        // Lazy way
				System.out.println(s.charAt(6));
				
				// Laziest way. "expression" implies String object    
				System.out.println("0123456789".charAt(7));
*/





 /* 
        //測試length();
	      String s = "0123456789資策會";
	      int len = s.length();
	      System.out.print(s + " 的長度是 ");
	      System.out.println(len + " 個字");
*/




/*
        //測試空字串 String str = "";
	      String str = "";
	      //KDK6 以前
	      System.out.println(str.length()==0);
	      //KDK6 開始
	      System.out.println(str.isEmpty());
*/



/*	
        //測試substring
        String s1 = "0123456789資策會";
		
	      String s2 = s1.substring(6);
	      System.out.println(s2);          //6789資策會
		
	      String s3 = s1.substring(6,9);
	      System.out.println(s3);          //678
	 
	      String s4 = s1.substring(9,10);
	      System.out.println(s4);          //9
		
	      String s5 = s1.substring(9,11);  //9資
	      System.out.println(s5);
*/





/* 		
	      //測試 int compareTo(String anotherString)	
	      System.out.println("123".compareTo("456"));
		
	      //測試轉大小寫
	      System.out.println("abc".toUpperCase());
	      System.out.println("ABC".toLowerCase());
*/




    
/*   
        //測試String replace(char oldChar, char newChar)
        String s = "0123456789資策會";
        s = s.replace('策','X');
        System.out.println(s); 
*/



		

/*	
        //測試 trim();	
	      String s = " 0123456789資策會 ";
	      System.out.println(s + " : 長度為 " + s.length() );
	      //刪除前後的空白
	      s = s.trim();
	      System.out.println(s + " : 長度為 " + s.length() );
*/		





/*	  
        //測試indexOf(int ch) indexOf(int ch, int fromIndex)
        //indexOf(String str) indexOf(String str, int fromIndex)
	  
	      String s = "0123456789資策會0123456789";

	      //求得字元'9'第一次出現的位置
	      System.out.println(s.indexOf('9'));              //9
		
	      //從第10個字元開始，搜尋'9'第一次出現的位置
	      System.out.println(s.indexOf('9',9));            //9
		
	      //從第11個字元開始，搜尋'9'第一次出現的位置
	      System.out.println(s.indexOf('9',10));           //22
		
	      //從第1個字元開始，搜尋"資策會"第一次出現的位置
	      System.out.println(s.indexOf("資策會",0));       //10
		
	      //如果指定的文字不存在，則傳回-1
	      System.out.println(s.indexOf('z'));              //-1
*/
   

	String string1 = "     Bbracadabra.Blakazam!     "; //initialize string
	string1 = string1.replace('B', 'A'); //Replaces 'B' with 'A'
	string1 = string1.trim(); //Trim whitespace
	
	System.out.printf("\"%s\" is %d characters long!!%n", string1, string1.length()); //prints the length of string1
	
	System.out.printf("All upper case!--> %s%n", string1.toUpperCase()); // prints toUpperCase
	System.out.printf("All upper case!--> %s%n", string1.toLowerCase()); // prints toLowerCase
	
	char snip = string1.charAt(5); //finds the 5th character in string 1
	
	System.out.printf("The 5th character of \"%s\" is \'%s\'!%n", string1, snip); //prints the 5th character in string1 to the screen
	
	int position = string1.indexOf('.'); //locate index position
	System.out.println("Index Position: " + position);
	
	String str1 = string1.substring(0, position); // Assign section 1 of the string
	String str2 = string1.substring(position+1); // Assign section 2 of the string
	
	//Tests whether or not the sections are empty
	System.out.printf("String section 1 is Empty: %s%nString section 2 is Empty: %s%n", str1.isEmpty(), str2.isEmpty());
	
	System.out.println("String 1: " + str1); //prints the separated strings to the screen
	System.out.println("String 2: " + str2);
	
	//Prints the # of differences between str1 and str2
	System.out.printf("Number of differences between %s and %s: %d",str1, str2, -str1.compareTo(str2)); 

	}
	
}
