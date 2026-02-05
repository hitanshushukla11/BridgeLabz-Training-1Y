class VariableExamples{  //class keyword with class name

    int id = 10; // instance variable
	String name = "Gaurav"; //instance variable
	static int age = 18; //static variable
	int rollNo ;
	
	void display()   //method 
	{
	    String status = "Active"; //local variable
		System.out.println("status: "+status);  // printing statement
	}
	public static void main(String[] args)
	{
	
	VariableExample var = new VariableExample();
	
	var.display();
	System.out.println(id + name + age);
	var.rollNo = 35;
	
	}
}