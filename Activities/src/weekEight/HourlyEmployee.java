package weekEight;

public class HourlyEmployee {int id, String name, double wage, int hours)
    {
        //SUPER KEYWORD USED
        super(id, name);
        this.wage = wage;
        this.hours = hours;
    }
    //SETTERS
    public void setWage(double wage)
    {
        this.wage = wage;
    }
    public void setHours(int hours)
    {
        this.hours = hours;
    }
    //GETTERS
    public double getWage()
    {
        return wage;
    }
    public int getHours()
    {
        return hours;
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
        return String.format("Name: %s%nID: %d%nWage: %.2f%nHours: %d%n",
                getName(), getId(), getWage(), getHours());
    }
}
}
