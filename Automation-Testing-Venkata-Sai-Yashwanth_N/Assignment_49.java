package Assignment;

interface Amazon {
	void login();
	void logout();
	}
class Flipkart implements Amazon {

	@Override
	public void login() {
		System.out.println("This is a Login Page");
	}

	@Override
	public void logout() {
		System.out.println("This is a Logout Page");
		
	}
}
public class Assignment_49 {
	public static void main(String[] args) {
		Flipkart obj = new Flipkart();
		obj.login();
		obj.logout();
	}
}
