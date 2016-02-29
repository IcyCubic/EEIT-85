import java.util.Scanner;

public class HelloWorldGraphics2 {
  public static void main(String args[]) {
		int count;
		
		if (args.length==0)
			count = getLayer();
		else
			count = Integer.parseInt(args[0]);
		
   	
   	System.out.println("請畫三角形!");      
    drawTriangle(count);
    System.out.println("畫的還不錯!");
    System.out.printf("%nDraw Triangle%n%n");
   // draw();
    draw2(count);
    
  }
  
  //Original from StackOverflow, modified display
  /*
  public static void draw(){
  	for (int i = 0; i < 5; i++) 
  		System.out.printf("%s%n%n", "    *********".substring(i, 5 + 2*i));
  } 
  */

	public static int getLayer(){
		Scanner console = new Scanner(System.in);
		
		System.out.println("How many lines? ");
		return console.nextInt();
	}
   
  public static void draw2(int count){
	  StringBuffer stars = new StringBuffer();
	  
	  //Constructs the appropriate length string to print later
	  for (int i = 0; i < count/2; i++)
	  	stars.append(' ');	  
  	for (int i = 0; i < count; i++)
  		stars.append('*');
  	  	 		 	  	  	
    for (int i = 0; (count%2==0)?(i < count/2):(i < count/2+1); i++)
			System.out.printf("%s%n%n", stars.substring((count%2==0)?i+1:i, (count/2+1)+2*i));   	
  } 
   
  public static void drawTriangle(int count){
  	int i, j, k;
    
    for (i = 1; i <= count; i++){
    	if (i%2==0) {
    		System.out.println("");
    		continue;
    	}
    	for (k = ((count-i)/2)-1; k >=0; k--)
    		System.out.print(" ");
    	for (j = 1; j <= i; j++ ) 
      	System.out.print("*");
      System.out.println();
    }
  }	

}