package Assignment;

interface RR {
	abstract void Username();
}
interface RRR {
	abstract void Password();
}
class Result implements RR, RRR {

	@Override
	public void Username() {
		System.out.println("Username is a Web Application");
	}

	@Override
	public void Password()
	{
		System.out.println("Password is a Web Application");
	}
}
public class Assignment_50 {
public static void main(String[] args) {
		Result obj = new Result();
		obj.Username();
		obj.Password();
	}

}
