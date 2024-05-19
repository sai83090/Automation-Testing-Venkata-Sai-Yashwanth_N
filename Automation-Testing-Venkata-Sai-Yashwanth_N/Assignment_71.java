package Assignment;
import java.util.Date;
public class Assignment_71 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String mydate = d2.toString();
		System.out.println(mydate);
	}

}
