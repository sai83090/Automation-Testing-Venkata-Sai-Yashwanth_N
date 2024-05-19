package Assignment;

public class Assignment_44 {

    void Selenium() {
        System.out.println("This is a Selenium");
    }

    void Java() {
        System.out.println("This is a Java");
    }

    public static class Assignment_44_child extends Assignment_44 {
        static void Gk() 
        {
            System.out.println("This is a Gk");
        }
    }
    public static void main(String[] args) {
        Assignment_44_child c1 = new Assignment_44_child();
        c1.Selenium();
        c1.Java();
        Assignment_44_child.Gk();  // Call as a static method on the class
    }
}
