package weekSix;

public class NewCarClass {public class NewCarClass {
    // The Private Instance Variables/Member Variables/fields
    private String make, model,color;
    private int year,seats,miles;




    //DEFAULT CONSTRUCTOR
    //If user does not place information in. This will set default information.
    public NewCarClass(){
        model = "Test Model";
        make = "Test Make";
        color = "Test Color";
        year = 0;
        seats = 0;
        miles = 0;

    }
    //PARAMETERIZED CONSTRUCTOR
    // SETS THE VALUES PASSED IN USING THE INSTANCE TO WHATEVER INSTANCE THE USER WANTS
    public NewCarClass(String model, String color, String make,int year, int seats, int miles){
        this.model = model;
        this.color = color;
        this.make = make;
        this.year = year;
        this.seats = seats;
        this.miles = miles;

    }
    //------------------------- SETTERS -------------------------------------------------
    // Setters are also called "Mutators",because they change the private field/variables.
    // THEY DO NOT RETURN A VALUE.
    // They accept a parameter (Ex. String make) which is the new value of make for example.
    // uses "this" keyword to express this specific instance.
    // Note: the data type for the setter functions are void, because they do not return anything.
    private void setMake(String make){
        this.make = make;
    }
    //SETS THE MODEL
    private void setModel(String model){
        this.model = model;
    }
    //SETS THE COLOR
    private void setColor(String color){
        this.color = color;
    }
    //SETS THE YEAR
    private void setYear(int year){
        this.year = year;
    }
    //SETS THE SEATS
    private void setSeats(int seats){
        this.seats = seats;
    }
    //SETS THE MILES
    private void setMile(int miles){
        this.miles = miles;
    }

    //------------------------- GETTERS -------------------------------------------------
    // Getters are also called "Accessors",because they can access the private field/variables.
    // THEY "DO" RETURN A VALUE.
    // GETTERS simply get the instance of that variable and return the value.
    // Note: you will have the data type of the method be what the private variables are.
    //       Ex. String make; the data type for the getMake() method will be a String
    //       Ex.  int year;   the data type for the getYear() method will be an integer.

    //GETS THE MAKE
    public String getMake(){
        return make;
    }
    //GETS THE MODEL
    public String getModel(){
        return model;
    }
    //GETS THE COLOR
    public String getColor(){
        return color;
    }
    //GETS THE YEAR
    public int getYear(){
        return year;
    }
    //GETS THE SEATS
    public int getSeats(){
        return seats;
    }
    //GETS THE MILES
    public int getMiles(){
        return miles;
    }

    //DISPLAYS THE CONTENT OF EACH VARIABLE
    // ADD TO IT BEFORE POSTING ----************************************
    public void display(){
        System.out.println("The model is : " + model);
        System.out.println("The color is : " + color);
        System.out.println("The make is: " + make);
        System.out.println("The number of seats are : " + seats);
        System.out.println("The miles are : " + miles);
        System.out.println("The year of the car: " + year);

        System.out.println();
    }

}
}
