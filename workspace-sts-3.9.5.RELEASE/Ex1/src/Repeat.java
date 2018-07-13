import java.util.Scanner;
public class Repeat {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string : ");
			String str=sc.next( );

			System.out.println("Enter the number: ");
			int num=sc.nextInt( );
			int fnum=num;
			char ch[]=str.toCharArray();
			
			for(int i=0;i<str.length();i++)
			{
				System.out.print(ch[i]);
				
			}
		while(fnum>0) {
			for(int i=str.length()-num;i<str.length();i++)
				System.out.print(ch[i]);
		
			fnum--;
		}
			
	}

}


