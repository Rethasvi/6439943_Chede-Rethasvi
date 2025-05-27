public class Exercise17 {
    String make;
    String model;
    int year;

    public Exercise17(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Exercise17 car1 = new Exercise17("Toyota", "Camry", 2020);
        Exercise17 car2 = new Exercise17("Honda", "Civic", 2022);
        car1.displayDetails();
        car2.displayDetails();
    }
}