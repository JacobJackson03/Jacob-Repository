package weekEight;

public class AllStatic {static int x = 11;
    static int z = 4;
    static int y;
    static int t = testingStatMethod();
    private static int c = 1000;

    /* ---------------------- STATIC BLOCK ---------------------------- */
    // Used if you need to do calculation or computation in order to initialize your
    // static variable. You can declare a static block that gets executed exactly once.
    // when the class first loads.
    // Static Blocks execute automatically when the class is loaded in memory.
    static
    {
        System.out.println();
        System.out.println("From Static Block \n");
        System.out.println("Static Block --> can be printed without main on JDK version 1.6 and above. ");
        System.out.println();
        System.out.println("Original x: " +x);
        System.out.println("Original z: " +z);
        System.out.println("Original y: " +y);
        System.out.println("Original t: " +t);
        System.out.println("Original c: " +c);
        System.out.println();

        //Initialize y
        y = x * 4;
        System.out.printf(" y = x * 4, where x is %d : y = %d ",x,y);
        System.out.println("\n Modified y in the STATIC BLOCK : "+ y);
        System.out.println();

        //Access the static variable without creating an instance, since it belongs to the class itself.
        //Example:
        int newValue = AllStatic.z;
        System.out.println("\n --------- {ACCESSING} THE STATIC VARIABLE USING THE CLASS NAME: Class name = AllStatic -----------");
        System.out.printf("\n int newValue = AllStatic.z: newValue= %d   ", newValue);
        System.out.println();

        //Modify the static variable using the class name.
        AllStatic.z = 1234;
        System.out.println("\n --------- {MODIFYING} THE STATIC VARIABLE USING THE CLASS NAME: Class name = AllStatic -----------");
        System.out.printf("\n AllStatic.z = 1234 : z was original 4 now it is : %d ",z);
        System.out.println();

    }
    /* ---------------------- STATIC METHOD ---------------------------- */
    // A common example of a static method is static main.
    // Any static member can be accessed before any objects of
    // its class are created, and without reference to any object
    // Methods declared as static have a few restrictions.
    // -They can only directly call other static methods.
    // -They can only directly access static data.
    // -They cannot refer to this or super in any way.

    public static void main(String[] args) {
        System.out.println();
        System.out.println("\nI am inside of the 'public static void main(String[] args)' ");
        System.out.println("|---------- UNDERSTANDING STATIC --------------|");

        //PRINTS OUT THE NEW VALUE OF t.
        System.out.println("\nThe New t modified from the  testingStatMethod(): " + t);
        System.out.println();

        //METHOD CALL TO message()
        message();

        // FOR THE NESTED STATIC CLASS PORTION
        // Creating an object of the Test Class and  an instance of the static Testing Nested Class to access the private int.
        AllStatic.TestingNestedClass nestingX = new AllStatic.TestingNestedClass();
        nestingX.printing();



    }

    //method name: message()
    // prints out that it is in the static method message.
    static void message()
    {
        System.out.println("\n ------------------------------- FROM THE static void message() -------------------- ");
    }

    // method name: testingStatMethod()
    // will assign the return value to the static variable t.
    static int testingStatMethod(){
        System.out.println("\n ------------ FROM THE static int testingStatMethod() ---------------------- \n ");
        System.out.println(" Return an integer value which is 3. This will be assigned to the static variable t. ");
        return 3;
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
            System.out.println("\n ------------------------- FROM THE TestingNestedClass ---------------------------- \n ");
            System.out.println(" The private static int c is : " + c);
            System.out.println();

        }

    }

}
}
