package prac2.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, int batteryCapacity) {
        super(model, license, color, year);
        this.engineType = "Electric";
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + "'" +
                ", license='" + license + "'" +
                ", color='" + color + "'" +
                ", year=" + year +
                ", batteryCapacity=" + batteryCapacity +
                ", engineType='" + engineType + "'" +
                '}';
    }
}