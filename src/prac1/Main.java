package prac1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Deawoo Matiz", "B777OP", "Silver", 2006);
        Car car2 = new Car();
        Car car3 = new Car("Rolls-Royce Cullian I", 2021);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);
        System.out.println();

        car2.setModel("Lada Granta");
        car2.setLicense("A777MP");
        car2.setColor("Black");
        car2.setYear(2025);

        System.out.println("Car 2 (обновлённая): " + car2);
        System.out.println();

        System.out.println("Возраст Car 1: " + car1.getAge() + " лет");
        System.out.println("Возраст Car 2: " + car2.getAge() + " лет");
        System.out.println("Возраст Car 3: " + car3.getAge() + " лет");
    }
}
