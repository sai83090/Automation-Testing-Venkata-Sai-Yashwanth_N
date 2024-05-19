package Assignment;

public class Assignment_32 {
    
    public class ClassOne {
        ClassOne() {
            System.out.println("Default Constructor");
        }
    }

    public class ClassTwo {
         ClassTwo(int a, int b) {
            int c = a + b;
            System.out.println("Sum: " + c);
        }

         
        // Method named Assignment_32
        public void Assignment_32() {
            System.out.println("Assignment_32 method called");
        }
    }

    
    public static void main(String[] args) {
    	
    	Assignment_32 c4 = new Assignment_32();
    	
        ClassTwo c1 = c4.new ClassTwo(34, 89);
        
        c1.Assignment_32();
    }
}
