package com.stackroute.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class GradeCalculation  extends Grade{

	int marks[] = new int[6];
    int i;
    float total=0, avg;
    String name;
    String grade;
    String subject;
    
    static Map< String,String> hm =  new HashMap< String,String>(); 
    
    Scanner scanner = new Scanner(System.in);
    
	public void enterValues() {
	        System.out.print("Enter name of Student:");
	        name=scanner.next();
	        
	        for(i=0; i<2; i++) { 
	        System.out.print("Enter name of Subject: ");
	        subject=scanner.next();
	            
	        System.out.print("Enter Marks of Subject: ");
	        marks[i] = scanner.nextInt();
	        total = total + marks[i];
	        
	        }
	       
	    }
	
	public void display() {
		
		 avg = total/2;
	        System.out.println("Student name: "+name);
	        System.out.print("Grade is: ");
	        if(avg>=90)
	        {
	            System.out.print("A");
	            grade="A";
	        }
	        else if(avg>=80 && avg<90)
	        {
	           System.out.print("B");
	           grade="B";
	        } 
	        else if(avg>=60 && avg<80)
	        {
	            System.out.print("C");
	            grade="C";
	        }
	        else if(avg>=40 && avg<60)
	        {
	            System.out.print("D");
	            grade="D";
	        }
	        else
	        {
	            System.out.print("E");
	            grade="E";
	        }
	        
	        hm.put(name , grade); 
	}
	 
    public static void main(String args[])
    {
    	for(int i=1;i>0;i++) {
    	
    	GradeCalculation gradeObj=new GradeCalculation();
    	
    	gradeObj.enterValues();
    	gradeObj.display();
           
    	
        Set< Map.Entry< String,String> > st = hm.entrySet();
        
        System.out.println("");

        for (Map.Entry< String,String> me:st) 
        { 
        	
            System.out.println("{"+me.getKey()+","+me.getValue()+"}");  
        } 
        
    	}
        
    }
}
