package Assignment;

interface Csk {
	abstract void login();
}

abstract class Rcb implements Csk {
	abstract void Password();
	void logout()
	{
		System.out.println("Logout is a Web Application");
	}
}
class Match extends Rcb {

	@Override
	public void login() {
		System.out.println("Login in a Web Application");	
	}
	@Override
	void Password() {
		System.out.println("Password in a Web Application");
	}
	
}
public class Assignment_51 {
	public static void main(String[] args) {
		Match obj = new Match();
		obj.login();
		obj.Password();
		obj.logout();
	}
}
