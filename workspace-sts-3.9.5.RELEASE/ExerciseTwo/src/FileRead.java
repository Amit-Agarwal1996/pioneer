import java.util.Scanner;
import java.io.*;

public class FileRead {

	
	public static void main(String[] args) {
		read();
	}
	
		
		static long read(){
			long size = 0;
	try {	
		FileReader fr = new FileReader("/home/amit/Documents/workspace-sts-3.9.5.RELEASE/ExerciseTwo/src/hi.txt");
	     BufferedReader br = new BufferedReader(fr);
	     String line;
		while((line = br.readLine()) != null)
           {
               System.out.println(line.toUpperCase());
           }
		
		File f = new File("/home/amit/Documents/workspace-sts-3.9.5.RELEASE/ExerciseTwo/src/hi.txt");
		size = f.length();
	    System.out.println("Filesize in bytes: " + size);
	  }
	    catch(Exception e)
	{ e.printStackTrace();
	
	}
	    
		return size;
	}
	

}




