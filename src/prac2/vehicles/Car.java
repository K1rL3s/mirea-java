package prac2.vehicles;


public class Car extends Vehicle {

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {}

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String vehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + "'"
                + ", license='" + license + "'"
                + ", color='" + color + "'"
                + ", year=" + year + "}";
    }

    public int getAge() {
        final int CURRENT_YEAR = 2025;
        return CURRENT_YEAR - year;
    }
}