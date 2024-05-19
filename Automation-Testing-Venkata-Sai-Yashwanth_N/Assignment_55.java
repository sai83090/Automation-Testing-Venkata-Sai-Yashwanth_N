package Assignment;
interface FrontEndDeveloper {
	 void FrontEngineers();
}
interface BackEndDeveloper extends FrontEndDeveloper {
	 void BackEngineers();
}
abstract class FullStackDeveloper implements BackEndDeveloper {
	abstract void Testing();
}
class Manager extends FullStackDeveloper {
	@Override
	public void BackEngineers() {
		System.out.println("BackEndEngineers");	
	}
	@Override
	public void FrontEngineers() {
		System.out.println("FrontEndEngineers");
	}
	@Override
	void Testing() {
		System.out.println("Automation Testing");
	}
}
public class Assignment_55 {
	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.FrontEngineers();
		obj.BackEngineers();
		obj.Testing();
	}
}
