package Assignment;

class Assignment_43 {
	
	void Selenium() 
	{
		System.out.println("This is a Selenium");	
	}
	void Java()
	{
		System.out.println("This is a Java");
	}
	void Gk()
	{
		System.out.println("This is a Gk");
	}
class Assignment_43_child extends Assignment_43 {
	
}
	public static void main(String[] args) {
		Assignment_43 c1 =  new Assignment_43();
		c1.Selenium();
		c1.Java();
		c1.Gk();
	}

}
