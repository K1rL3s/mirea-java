package prac2.app;

import prac2.vehicles.Car;
import prac2.vehicles.ElectricCar;
import prac2.vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Lada Granta", "B234AA", "Red", 2019);
        Vehicle myElectricCar = new ElectricCar("Zeekr 001", "K185ET", "Orange", 2024, 930);

        System.out.println("Тип ТС: " + myCar.vehicleType());
        myCar.setOwnerName("Искандер Бикташев");
        System.out.println(myCar);

        System.out.println();

        System.out.println("Тип ТС: " + myElectricCar.vehicleType());
        myElectricCar.setOwnerName("Михаил Ходжаев");
        System.out.println(myElectricCar);

        if (myElectricCar instanceof ElectricCar) {
            ElectricCar electric = (ElectricCar) myElectricCar;
            System.out.println("Ëмкость батареи: " + electric.getBatteryCapacity() + " кВт");
        }
    }
}
