import java.util.Scanner;

public class alphadigitsplch {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner (System.in);
 
        System.out.println("Enter any Character ");
        
        char ch = scanner .next().charAt(0);
        
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        	
        	System.out.println( ch + "is A Alphabate " );
        }
         else  if ( ch >= '0' &&   ch <= '9' ) {
        	
        System.out.println(ch +" is A Digit");
		
         }  else {
        	 
        	System.out.println(ch + "is A Special Character");
        }

	}

}
