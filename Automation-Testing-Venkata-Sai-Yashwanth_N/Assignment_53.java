package Assignment;

interface Cricket {
 void Batting();
}
interface Football extends Cricket {
 void Bowling();
}
interface Camera extends Football {
	 void Still();
}
interface Passion extends Camera {
	 void Dance();
}
class Sports implements Passion {
 @Override
 public void Batting() {
     System.out.println("Batting is playing");
 }
@Override
public void Bowling() {
	System.out.println("Bowling is playing");
}
 @Override
 public void Still() {
	 System.out.println("Camera is Stills");
 }
 @Override
 public void Dance() {
	 System.out.println("Dance is Passion");
 }
}
public class Assignment_53  {
 public static void main(String[] args) {
	 Sports obj = new Sports();
	 obj.Batting();
	 obj.Bowling();
	 obj.Still();
	 obj.Dance();
 }
}


	
