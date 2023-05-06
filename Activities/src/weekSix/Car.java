package weekSix;

public class Car { public String model;
    public String color;
    public int seats;
    public int miles;

    public Car(){
        model = "Test Model";
        color = "Test Color";
        seats = 0;
        miles = 0;

    }
    public Car(String model, String color, int seats, int miles){
        this.model = model;
        this.color = color;
        this.seats = seats;
        this.miles = miles;

    }
    public void display(){
        System.out.println("The model is : " + model);
        System.out.println("The color is : " + color);
        System.out.println("The number of seats are : " + seats);
        System.out.println("The miles are : " + miles);
        System.out.println();
    }
}
}
