import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		 
		 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string : ");
			String str=sc.next( );

			
			char ch[]=str.toCharArray();
			
			for(int i=0; i< str.length();i++)
			{ if((ch[i]>= 65 && ch[i]<=90) ||(ch[i]>= 97 && ch[i]<= 122))
			{
	        if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||  ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'  )
	            System.out.print(ch[i] + " - vowel ");
	        else
	            System.out.print(ch[i] + " - consonant ");
			}
			else
				System.out.print(ch[i] + " - not alphabet ");
			}

	}

}
