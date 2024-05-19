package Assignment;
class Assignment {                 //Multilevel Inheritance
    
    void Parent() {
        System.out.println("This is a Parent");
    }
}

class Assigs extends Assignment {
    void Daughter_1() {
        System.out.println("This is a Son");
    }
}

class Assign extends Assigs {
    void Daughter() {
        System.out.println("This is a Daughter");
    }
}

class Assignment_45 {
    public static void main(String[] args) {
        Assign sc = new Assign();
        sc.Daughter();
        sc.Daughter_1();
        sc.Parent();
    }
}
