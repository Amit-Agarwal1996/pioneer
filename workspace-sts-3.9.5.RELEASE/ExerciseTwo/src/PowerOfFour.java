
public class PowerOfFour {

	public static void main(String[] args) {
		int i = 256;
        if(isPowerOfFour(i) == true)
         System.out.println(i+" is a power of 4");
        else
         System.out.println(i+" is not a power of 4");
	}

	
	static boolean isPowerOfFour(int n)
    {
		 while(n>0){
		        if(n==1)
		            return true;
		        
		 
		        if(n%4!=0)
		            return false;
		        
		        else
		            n=n/4;
		        
		    }
		 
		    return false;
    }
}
