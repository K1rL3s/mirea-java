package prac1;

public class Car {
    String model;
    String license;
    String color;
    int year;

    // конструктор по умолчанию
    public Car() {}

    // конструктор со всеми полями
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // конструктор только с моделью и годом, я так зохотел
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + "'"
                + ", license='" + license + "'"
                + ", color='" + color + "'"
                + ", year=" + year
                + "}";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        final int CURRENT_YEAR = 2025;
        return CURRENT_YEAR - year;
    }
}