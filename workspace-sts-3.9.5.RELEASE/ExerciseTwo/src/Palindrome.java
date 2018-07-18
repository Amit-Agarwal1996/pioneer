import java.util.Scanner;  
public class Palindrome {

    public static void main(String[] args) {
    	
    	palindromeChecker(121);
    	
    }
    
    public static int palindromeChecker(int num) {

        int reversedInteger = 0, remainder, originalInteger, sum =0;

        
        
       
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
        
        System.out.println("Enter the number");  
        num=sc.nextInt();  
        originalInteger = num;
    
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
            
            if ( remainder % 2 == 0)
            	sum= sum +remainder;
            
        }

  
        if (originalInteger == reversedInteger)
        {
        	System.out.println("reversedInteger is: " +reversedInteger);
            System.out.print(originalInteger + " is a palindrome");
            
        }
        else {
        	
        	System.out.println("reversedInteger is: " +reversedInteger);
            System.out.print(originalInteger + " is not a palindrome");
        }
		return reversedInteger;
        
    }
}

