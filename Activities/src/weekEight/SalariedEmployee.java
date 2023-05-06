package weekEight;

public class SalariedEmployee {private double salary;

    //CONSTRUCTOR
    public SalariedEmployee(int id, String name, double salary)
    {
        //SUPER KEYWORD USED
        super(id, name);
        this.salary = salary;
    }
    //SETTER
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    //GETTER
    public double getSalary()
    {
        return salary;
    }


    //METHOD
    @Override
    public String toString()
    {
        return String.format("Name: %s%nID: %d%nSalary: %.2f%n",
                getName(), getId(), getSalary());
    }
}

}
