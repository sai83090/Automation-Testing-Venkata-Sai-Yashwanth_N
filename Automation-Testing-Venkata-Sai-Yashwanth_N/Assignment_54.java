package Assignment;

interface Cinema {
	void Movie();	
}
interface Webseries {
	void Webseries();
}
abstract class ENT implements Cinema, Webseries {
	abstract void Laptop();
}
class TV extends ENT {
	@Override
	public void Movie() {
		System.out.println("Movies");
	}
	@Override
	public void Webseries() {
		System.out.println("Webseries");	
	}
	@Override
	void Laptop() {
		System.out.println("Laptop");
	}
}
public class Assignment_54 {
	public static void main(String[] args) {
		TV obj = new TV();
		obj.Movie();
		obj.Webseries();
		obj.Laptop();
	}
}
