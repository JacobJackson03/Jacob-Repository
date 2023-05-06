package weekEight;

public class Test {static int x = 11;
    static int y;
    static int t = testingStatMethod();
    private static int c = 1000;

    /* ---------------------- STATIC BLOCK ---------------------------- */
    // Used if you need to do calculation or computation in order to initialize your
    // static variable. You can declare a static block that gets executed exactly once.
    // when the class first loads.
    // Static Blocks execute automatically when the class is loaded in memory.
    static{
        System.out.println("From  Static Block\n");
        System.out.println("Static Block --> can be printed without main on JDK version 1.6 and above.");
        // initialize y
        y = x * 4;
    }
    /* ---------------------- STATIC METHOD ---------------------------- */
    // A common example of a static method is static main.
    // Any static member can be accessed before any objects of
    // its class are created, and without reference to any object
    // Methods declared as static have a few restrictions.
    // -They can only directly call other static methods.
    // -They can only directly access static data.
    // -They cannot refer to this or super in any way.

    static int testingStatMethod(){
        System.out.println("From the testingStatMethod function\n");
        System.out.println("Returns an int");
        return 11;
    }
    static void message() {
        System.out.println("Static method call");
    }
    // I have SDK 19 so it won't run without main for me.
    public static void main(String[] args)
    {
        System.out.println("From  Static main method\n");
        System.out.println("Value of t:"+t);
        message();

        // FOR NESTED STATIC CLASS DEMO PORTION-------
        // Creating an object of the Test class and an instance of the
        // static TestingNestedClass to access the private static int. below
        Test.TestingNestedClass NestedObjects = new Test.TestingNestedClass();
        NestedObjects.printing();

    }

    /* ---------------------- STATIC CLASS---------------------------- */
    // A class can only be static if it is a nested class. You cannot declare a top-level
    // class with static modifier. You can declare a nested class as static.
    // Nested static classes don't need a reference of outer class.
    // A static class cannot access non-static members of the Outer class.
    // A nested class is a member of its enclosing class (can be private, public, protected ect.)
    static class TestingNestedClass
    {
        // non-static method
        public void printing()
        {
            System.out.println("Inside of the static nested TestingNestedClass\n");
            System.out.println(c);
        }
    }
}
}
