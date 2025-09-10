package pr2.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar() {
        this.engineType = "Electric";
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar{"
                + "model='" + getModel() + "'"
                + ", license='" + getLicense() + "'"
                + ", color='" + getColor() + "'"
                + ", year=" + getYear()
                + ", ownerName='" + getOwnerName() + "'"
                + ", insuranceNumber='" + getInsuranceNumber() + "'"
                + ", engineType='" + getEngineType() + "'"
                + ", batteryCapacity=" + getBatteryCapacity()
                + "}";
    }
}
