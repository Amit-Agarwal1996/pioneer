import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
      int num1 , num2 ;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
        
        System.out.println("Enter the target number");  
        num1=sc.nextInt(); 
        
        System.out.println("Enter the guess number");  
        num2=sc.nextInt(); 
        
        if(num2>num1)
        	 System.out.println("Number guessed is more than original number "); 
        else if(num2<num1)
        	 System.out.println("Number guessed is less than original number"); 
        else
        	 System.out.println("Number guessed matches the original number"); 
        	
	}

}
