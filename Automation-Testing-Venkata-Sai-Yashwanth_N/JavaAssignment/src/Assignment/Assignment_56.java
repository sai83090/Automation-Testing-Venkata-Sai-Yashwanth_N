package Assignment;
interface Mobile {
	void Youtube();
}
interface Laptop extends Mobile {
	void Instagram();
}
interface Tablet extends Laptop {
	void Twitter();
}
abstract class SocialMedia implements Tablet {
	abstract void Facebook();
}
class Person extends SocialMedia {
	@Override
	public void Twitter() {
		System.out.println("Twitter");	
	}
	@Override
	public void Instagram() {
		System.out.println("Instagram");
	}
	@Override
	public void Youtube() {
		System.out.println("YouTube");
	}
	@Override
	void Facebook() {
		System.out.println("Facebook");
	}
}
public class Assignment_56 {
	public static void main(String[] args) {
		Person obj = new Person();
		obj.Twitter();
		obj.Instagram();
		obj.Youtube();
		obj.Facebook();
	}
}
