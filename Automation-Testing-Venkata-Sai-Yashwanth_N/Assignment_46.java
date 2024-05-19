package Assignment;

class Method_1
{
    void Parent() 
    {
        System.out.println("This is a Parent");
    }
}

class Method_2 extends Method_1 
{
	
    void Son() 
    {
        System.out.println("This is a Son");
    }
}

class Method_3 extends Method_1
{
    void Daughter()
    {
        System.out.println("This is a Daughter");
    }
}

class Assignment_46 {
    public static void main(String[] args) {
        Method_3 sc = new Method_3 ();
        sc.Daughter();  // Calls the Daughter method of the Assign class
        sc.Parent();    // Calls the Parent method of the Assignment class
    }
}
