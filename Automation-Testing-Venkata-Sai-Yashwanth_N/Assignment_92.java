package Assignment;
class UpCasting3 {
	void upcast3()
	{
		System.out.println("Upcasting 3");
	}
}

class Upcasting2 extends UpCasting3 {
	void upcast2()
	{
		System.out.println("Upcasting 2");
	}
}

class Upcasting1 extends Upcasting2 {
	void upcast3()
	{
		System.out.println("Upcasting 1");
	}
}

public class Assignment_92 extends Upcasting1 {
	void upcast4()
	{
		System.out.println("upcasting 4");
	}
public static void main(String[] args) {
     Upcasting1 obj = new Assignment_92(); 
     obj.upcast3();
     Assignment_92 obj_2 = (Assignment_92) obj; //downcasting
     obj_2.upcast4();
	}
}

