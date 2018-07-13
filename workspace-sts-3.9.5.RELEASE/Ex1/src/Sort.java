import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		 int sum=0, count=0, fsum=0;
		 @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string : ");
				String str=sc.next( );
                
				
				char ch[]=str.toCharArray();
				
				for(int i=0;i<str.length();i++)
				{
					for(int j=i+1; j<str.length(); j++)
					{
					if(ch[i]<ch[j])
					{
						char chh=ch[i];
						ch[i]=ch[j];
						ch[j]=chh;
				     }
					}
				}
				System.out.print("Sorted number in non-decreasing order : ");
				for(int i=0; i<str.length();i++)
					System.out.print(ch[i]);
					  
					
				
				for(int i=0; i<str.length();i++)
				{ if(ch[i]%2==0) {
					count++;
				  sum = sum + ch[i];
				}
				}
				fsum=sum-(count*48);
				
				System.out.println(" ");
				System.out.println(fsum);
				if(fsum>15)
					System.out.println("true ");
				else
					System.out.println("false ");
	}

}
