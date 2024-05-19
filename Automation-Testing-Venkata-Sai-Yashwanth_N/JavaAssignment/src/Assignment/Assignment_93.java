package Assignment;
class Upcast5 {
	void upcast5()
	{
		System.out.println("upcasting 5");
	}
}

class Upcast4 extends Upcast5 {
	void upcast4()
	{
		System.out.println("upcasting 4");
	}
}

class Upcast3 extends Upcast4 {
	void upcast3() 
	{
		System.out.println("upcasting 3");
	}
}

class Upcast extends Upcast3 {
	void upcast2()
	{
		System.out.println("upcasting 2");
	}
}

public class Assignment_93 extends Upcast {
	void upcast1()
	{
		System.out.println("upcasting 1");
	}
	public static void main(String[] args) {
		Upcast u1 = new Assignment_93();
		u1.upcast2();
		Assignment_93 u2 = (Assignment_93) u1;
		u2.upcast1();
	}
}
