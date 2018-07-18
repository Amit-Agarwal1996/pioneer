
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {


	   static void countEachWords(String filename , Map<String,Integer> words)throws FileNotFoundException{
	       Scanner file = new Scanner(new File(filename));

	       while (file.hasNext()){

	           String word = file.next();
	           Integer count = words.get(word);
	           if (count !=null)
	               count++;
	           else
	               count = 1;
	           words.put(word,count);

	       }

	       file.close();
//	       System.out.println(words);
//	       return words;
	   }
	   
	   public static String output(){
		   Map<String,Integer> words = new HashMap<String, Integer>();
	       try {
	           countEachWords("/home/amit/Documents/workspace-sts-3.9.5.RELEASE/ExerciseTwo/src/hi.txt",words);
	       } catch (FileNotFoundException e) {
	           e.printStackTrace();
	       }
	       String str=""+words;
		   System.out.println(str);
		   
	       return str;
	   }

	   public static void main(String[] args) {
	       output();
	       
	   }
	}
