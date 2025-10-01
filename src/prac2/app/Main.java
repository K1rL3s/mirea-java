package prac2.app;

import prac2.vehicles.Car;
import prac2.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Daewoo Matiz", "H475KK", "Silver", 2006);
        car.setOwnerName("Никита Лимонов");
        car.setInsuranceNumber("ААА 0001234567");
        car.setEngineType("Gasoline");

        System.out.println("Машина информация");
        System.out.println("Модель: " + car.getModel());
        System.out.println("Владелец: " + car.getOwnerName());
        System.out.println("Движок: " + car.getEngineType());
        System.out.println(car);
        System.out.println();

        ElectricCar electricCar = new ElectricCar("Xiaomi YU7", "A158HH", "White", 2025, 365);
        electricCar.setOwnerName("Максим Перекопский");
        electricCar.setInsuranceNumber("XXX 7654321000");

        System.out.println("Электричка машина информация:");
        System.out.println("Модель: " + electricCar.getModel());
        System.out.println("Владелец: " + electricCar.getOwnerName());
        System.out.println("Движок: " + electricCar.getEngineType());
        System.out.println("Ëмкость батареи: " + electricCar.getBatteryCapacity() + " кВт");
        System.out.println(electricCar);
    }
}
