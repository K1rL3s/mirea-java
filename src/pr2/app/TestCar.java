package pr2.app;

import pr2.vehicles.Car;
import pr2.vehicles.ElectricCar;
import pr2.vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setModel("Lada Granta");
        car.setLicense("A123BC777");
        car.setColor("White");
        car.setYear(2020);
        car.setOwnerName("John Doe");
        car.setInsuranceNumber("123456789");

        System.out.println("Vehicle type: " + car.vehicleType());
        System.out.println(car.toString());

        System.out.println("\n--------------------\n");

        Vehicle electricCar = new ElectricCar();
        electricCar.setModel("Tesla Model S");
        electricCar.setLicense("E777KX777");
        electricCar.setColor("Red");
        electricCar.setYear(2023);
        electricCar.setOwnerName("Jane Doe");
        electricCar.setInsuranceNumber("987654321");
        electricCar.setEngineType("V8");
        if (electricCar instanceof ElectricCar) {
            ((ElectricCar) electricCar).setBatteryCapacity(100);
        }

        System.out.println("Vehicle type: " + electricCar.vehicleType());
        System.out.println(electricCar.toString());
    }
}
