class Vehicle {
    private String brand;
    private int year;
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    private int mileage;
    public Car(String brand, int year, int mileage) {
        super(brand, year); // Calling superclass constructor using super
        this.mileage = mileage;
    }
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling superclass method using super
        System.out.println("Mileage: " + mileage);
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 15000);
        myCar.displayDetails();
    }
}