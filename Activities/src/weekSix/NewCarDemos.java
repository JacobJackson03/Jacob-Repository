package weekSix;

public class NewCarDemos {public class NewCarDemos {
    public static void main(String[] args) {
        //creating an instance of the newCarClass
        NewCarClass test = new NewCarClass();
        //uses the display method from the NewCarClass
        test.display();
        //creating an instance of the newCarClass
        //uses the parameterized constructor to fill in the data
        NewCarClass test2 = new NewCarClass("Honda","Red","Civic",2000,5,100);
        test2.display();
        NewCarClass Tesla = new NewCarClass("Tesla","White","Model X",2022,7,1000);

        System.out.println("\nUsing Getter Methods to access the values\n");
        //Uses getters to print out the value
        System.out.println(Tesla.getModel());
        System.out.println(Tesla.getColor());
        System.out.println(Tesla.getMake());
        System.out.println(Tesla.getSeats());
        System.out.println(Tesla.getYear());
        System.out.println(Tesla.getMiles());

        //can also use .display() as it is a method within the class that you can access.
        Tesla.display();



    }
}
}
