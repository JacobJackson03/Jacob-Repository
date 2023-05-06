package weekSeven;
import java.util.ArrayList;
public class CarDemoArrayList { public static void main(String[] args) {
    // Create an ArrayList to represent the dealership inventory.
    // The data type for this particular program is my class Car --> <Car>
    // new + the constructor ArrayList<>()
    //The first ArrayList object is called inventory to represent the dealership inventory.
    ArrayList<Car> inventory = new ArrayList<Car>();

    // add some sample cars to the inventory
    // I use the .add() method to add some sample Car object to the inventory.
    inventory.add(new Car("Honda", "Red", "Civic", 2000, 5, 100));
    inventory.add(new Car("Tesla", "White", "Model X", 2022, 7, 1000));
    inventory.add(new Car("Toyota", "Blue", "Corolla", 2010, 4, 500));
    inventory.add(new Car("Ford", "Black", "F150", 2015, 3, 10000));
    inventory.add(new Car("Chevy", "Silver", "Camaro", 2021, 2, 50));
    inventory.add(new Car("Nissan", "Gray", "Altima", 2019, 4, 200));
    inventory.add(new Car("BMW", "Green", "X5", 2018, 5, 300));
    inventory.add(new Car("Mercedes", "Gold", "S Class", 2020, 4, 100));
    inventory.add(new Car("Audi", "Silver", "A6", 2016, 5, 1000));

    // Iterate through the inventory and display the information for each car using a for-each loop
    // Here the for-each loop to iterate through the inventory and calls the
    // .display() method from the car class to display the information.
    for (Car car : inventory) {
        car.display();
    }
}
}
}
