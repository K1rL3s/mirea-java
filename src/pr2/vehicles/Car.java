package pr2.vehicles;

public class Car extends Vehicle {

    public Car() {
        this.engineType = "Internal Combustion";
    }

    @Override
    public String vehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + getModel() + "'"
                + ", license='" + getLicense() + "'"
                + ", color='" + getColor() + "'"
                + ", year=" + getYear() + 
                ", ownerName='" + getOwnerName() + "'"
                + ", insuranceNumber='" + getInsuranceNumber() + "'"
                + ", engineType='" + getEngineType() + "'"
                + "}";
    }
}
