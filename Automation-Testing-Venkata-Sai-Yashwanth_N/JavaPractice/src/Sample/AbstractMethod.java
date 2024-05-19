package Sample;

abstract class AbstractMethod {
	abstract void printInfo();
}
class Employee extends AbstractMethod {
    void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
	
class Base {
    public static void main(String args[])
    {
    	AbstractMethod s = new Employee();
        s.printInfo();
    }
}