import java.util.Scanner;  
public class Palindrome {

    public static void main(String[] args) {

        int num, reversedInteger = 0, remainder, originalInteger, sum =0;

        
        
       
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
            System.out.print(originalInteger + " is a palindrome");
            if (sum > 25)
                System.out.println(" and the sum is greater than 25");
            else
                System.out.println(" and the sum is less than 25");
            
        }
        else
            System.out.print(originalInteger + " is not a palindrome");
        
        
        
    }
}
