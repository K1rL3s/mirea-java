package pr1;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    private static final int CURRENT_YEAR = 2025;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        this.model = "Unknown";
        this.license = "000000";
        this.color = "White";
        this.year = 2000;
    }

    public Car(String model, int year) {
        this.model = model;
        this.license = "111111";
        this.color = "Black";
        this.year = year;
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
        return CURRENT_YEAR - year;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + "'" +
                ", license='" + license + "'" +
                ", color='" + color + "'" +
                ", year=" + year +
                '}';
    }
}
