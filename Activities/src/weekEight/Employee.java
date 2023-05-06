package weekEight;

public class Employee {private int id;
    private String name;


    // CONSTRUCTOR
    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    //SETTERS
    // Setters are also called "Mutators",because they change the private field/variables.
    // THEY DO NOT RETURN A VALUE.
    // uses "this" keyword to express this specific instance.
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    //GETTERS
    //Getters are also called "Accessors",because they can access the private field/variables.
    //THEY "DO" RETURN A VALUE.
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    //METHOD
    @Override
    // The @Override keyword is used in Java to indicate that a method declaration
    // is intended to override a method with the same signature in a superclass or interface.

    // When a method is marked with @Override, the compiler checks if the method exists in a superclass
    // or interface and if its signature matches. If the method is not found or the signature does not match, the compiler generates an error.

    // Using @Override is considered a good practice because it helps prevent errors in code maintenance
    // and improves readability. It also allows the compiler to provide additional checks,
    // such as detecting when a superclass method is renamed or removed.
    public String toString()
    {
        return String.format("Name: %s%nID: %d%n", name, id);
    }
}
}
