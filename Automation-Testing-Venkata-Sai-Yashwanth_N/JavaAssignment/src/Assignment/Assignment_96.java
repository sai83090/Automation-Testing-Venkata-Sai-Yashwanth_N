package Assignment;
class HCL {
	
	private String name = "name1";
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	private int number = 0000;
	public int getnumber()
	{
		return number;
	}
	public void setnumber(int number)
	{
		this.number = number;
	}
	
	private char mychar;
	public char getmychar()
	{
		return mychar;
	}
	public void setmychar(char mychar)
	{
		this.mychar = mychar;
	}
	
	private float salary=98.98f;
	public float getsalary()
	{
		return salary;
	}
	public void setsalary(float salary)
	{
		this.salary = salary;
	}
	
	private boolean result = true;
	public boolean getresult()
	{
		return result;
	}
	public void setresult(boolean result)
	{
		this.result = result;
	}
	
	private double average = 3243.24d;
	public double getaverage()
	{
		return average;
	}
	public void setaverage(double average)
	{
		this.average = average;
	}
}

public class Assignment_96 {
	public static void main(String[] args) {
		HCL H1 = new HCL();
		H1.setName("Venkata Sai Yashwanth.Namburu");
		H1.getName();
		H1.setnumber(7478);
		H1.getnumber();
		H1.setmychar('D');
		H1.getmychar();
		H1.setsalary(25000f);
		H1.setresult(false);
		H1.getresult();
		H1.setaverage(2353535d);
		System.out.println(H1.getName());
		System.out.println(H1.getnumber());
		System.out.println(H1.getmychar());
		System.out.println(H1.getsalary());
		System.out.println(H1.getresult());
		System.out.println(H1.getaverage());
	}
}
