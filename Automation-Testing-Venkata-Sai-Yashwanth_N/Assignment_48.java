package Assignment;

public abstract class Assignment_48 {
    abstract void multiplication(int a, int b);
    abstract void division(double a, double b);

static class Assignment extends Assignment_48 {

        public static void add(int a, int b) {
            int result = a + b;
            System.out.println(result);
        }

        void subtraction(int x, int y) {
            int minus = x - y;
            System.out.println(minus);
        }

        @Override
        public void multiplication(int a, int b) {
            int multiply = a * b;
            System.out.println(multiply);
        }

        @Override
        public void division(double a, double b) {
            double quotient = a / b;
            System.out.println(quotient);
        }
    }

    public static void main(String[] args) {
        Assignment obj = new Assignment();
        obj.subtraction(50, 10);
        obj.multiplication(12, 5);
        obj.division(10.0, 2.0);
        Assignment.add(30, 78); 
    }
}
