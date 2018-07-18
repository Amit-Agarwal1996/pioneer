import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;

public class FilesInFolder {

	public static void main(String[] args) {
		findFile();
		read();
	}
	
static String findFile() {
	
	    String str = null;
        File file = new File("/home/amit/Documents/workspace-sts-3.9.5.RELEASE/ExerciseTwo/src/");
        File[] files = file.listFiles(new FilenameFilter() {
             
          
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt"))
                    return true;
                 else 
                    return false;
                
            }
        });
        for(File f:files){
        	str=f.getName();
            System.out.println(f.getName());
        }
        return str;
}
static String read() {
	
	    String strr = null;
        String fileName = "/home/amit/Documents/workspace-sts-3.9.5.RELEASE/ExerciseTwo/src/hi.txt";
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
            byte content[] = new byte[2*1024];
            int readCount = 0;
            while((readCount = is.read(content)) > 0){
            	strr=new String(content, 0, readCount-1);
                System.out.println(strr);
            }
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        
        return strr;
       }
    }
