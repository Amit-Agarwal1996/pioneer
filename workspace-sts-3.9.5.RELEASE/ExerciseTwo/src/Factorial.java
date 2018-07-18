
public class Factorial {

	public static void main(String[] args) {
    
		printLongFactorials();
		    }
		     
		   static long printLongFactorials()
		    {
		        long i  = 1L;
		        long fn = 1L;
		        long fg= 2432902008176640000L;
		        while (true)
		        {
		            System.out.println("The factorial of "+i+" is "+fn);
		            if (Long.MAX_VALUE / fn < (i+1)) {
		                System.out.println("The factorial of "+(i+1)+" is out of range.\n" );
		                break;
		            }
		            i++;
		            fn *= i;
		        }
		  
		   fn=fn%fg;
		        return fn; 
		   }
	}


