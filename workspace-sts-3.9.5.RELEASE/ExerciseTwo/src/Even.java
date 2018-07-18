
public class Even {

	public static void main(String[] args) {
		isEven(226);

	}
	
	public static boolean isEven(int number) {
		if((number%2)==0)
		{System.out.println("Input is Even");
		   return true;
		}
		else
		{System.out.println("Input is Odd");
		   return false;
		}
	}

}
