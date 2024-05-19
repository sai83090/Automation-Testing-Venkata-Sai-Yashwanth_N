package Assignment_58;

public class AccessModifiers {
	public int a  = 10;
	private int b =  30;
	int c = 50;
	protected int d =  70;
	
	public void Publicvar()
	{
		System.out.println("Value of a A :" +a);
	}
	private void Privatevar() {
		System.out.println("Value of a B :" + b);
	}
	void Defaultvar() {
		System.out.println("Value of a C :" + c);
	}
	protected void Protectedvar() {
		System.out.println("Value of a D :" + d);
	}
	public static void main(String[] args) {
		AccessModifiers obj =  new AccessModifiers();
		obj.Publicvar();
		obj.Privatevar();
		obj.Defaultvar();
		obj.Protectedvar();
	}

}
