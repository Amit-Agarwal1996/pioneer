
public class Member {
	String name;
	int age;
	double salary;	
	
	 public static void main(String[] args) {
	 }
	 
}

class MemberVariable {
	 public static String main(String[] args) {
	Member obj=new Member();
	
	obj.name="Harry Potter";
	obj.age=30;
	obj.salary=2500.3;
	
	return "Members Name: "+obj.name+" Members Age: "+obj.age+" Members Salary: "+obj.salary;
}
}
