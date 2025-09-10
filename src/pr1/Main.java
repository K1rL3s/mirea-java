package pr1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", "x123xx", "Blue", 2020);
        System.out.println("Car 1: " + car1.toString());
        System.out.println("Age of Car 1: " + car1.getAge() + " years");

        Car car2 = new Car();
        System.out.println("Car 2: " + car2.toString());
        System.out.println("Age of Car 2: " + car2.getAge() + " years");

        Car car3 = new Car("Ford Mustang", 2022);
        System.out.println("Car 3: " + car3.toString());
        System.out.println("Age of Car 3: " + car3.getAge() + " years");

        car2.setModel("Honda Civic");
        car2.setYear(2018);
        System.out.println("Updated Car 2: " + car2.toString());
        System.out.println("Updated age of Car 2: " + car2.getAge() + " years");
    }
}
