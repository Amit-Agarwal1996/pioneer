import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {
	
        int num;
        
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
        
        System.out.println("Enter the number");  
        num=sc.nextInt();  
        
        for(int i=1; i<=num; i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		 System.out.print(i+" ");
        	}
        }
	}

}
