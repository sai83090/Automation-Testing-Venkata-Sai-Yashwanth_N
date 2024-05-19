package Assignment;

class kart {
	private String s1 = "contact@grotechminds.com";
	public String getMail()
	{
		return s1;
	}
	public void setMail(String s1)
	{
		this.s1 = s1;
	}
}

public class Assignment_95 {
	public static void main(String[] args) {
	kart f1 = new kart();
	f1.setMail("abc@grotechminds.com");
	f1.getMail();
	System.out.println(f1.getMail());
	}
}
