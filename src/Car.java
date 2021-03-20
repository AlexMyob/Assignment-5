public class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int year;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(Car o) {
        if (this.year == o.year && this.make.equals(o.make) && this.model.equals(o.model)) {
            System.out.println(this.toString() + " is identical to " + o.toString());
            return 0;
        } else if (this.year < o.year) {
            System.out.println(this.toString() + " is older than " + o.toString());
            return -1;
        } else {
            System.out.println(this.toString() + " is newer than " + o.toString());
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
    }
}
