import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		int num ;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
        
        System.out.println("Enter the number");  
        num=sc.nextInt(); 

        if((num > 20) && (num < 30))
        {
        	if(num % 2 ==0)
        	  System.out.println("Jerry");
        	else
        	  System.out.println("Tom");
        }   	
        else
        	 System.out.println("Numer not recognized");
	}

}
