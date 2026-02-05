import java.util.*;

    class Student{
	int id;
	int age;
	String name;
	String status;
	void printDetails(){
	System.out.println("ID:" + id);
	System.out.println("Name:" + name);
	System.out.println("Age:" + age);
	}
	public static void main(String[] args){
	    Student s1 = new Student();
		    s1.id = 1251500682;
			s1.name = "Hitanshu Shukla";
			s1.age = 19;
			s1.status = "Active";
			s1.printDetails();
		}
	}