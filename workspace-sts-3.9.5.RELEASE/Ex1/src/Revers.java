import java.util.Scanner;

public class Revers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string : ");
			String str=sc.next( );

			
			char ch[]=str.toCharArray();
			
			for(int i=str.length()-1;i>=0;i--)
				System.out.print(ch[i]);

	}

}
