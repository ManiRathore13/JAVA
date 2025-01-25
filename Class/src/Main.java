class Car {
    // Properties of the car
    private String color;
    private String model;
    private String company;
    private int year;
    private double price;

    // Constructor to initialize a Car object
    public Car(String color, String model, String company, int year, double price) {
        this.color = color;
        this.model = model;
        this.company = company;
        this.year = year;
        this.price = price;
    }

    // Getters and setters for the properties
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Method to start the car
    public void start() {
        System.out.println(model + " is starting...");
    }

    // Method to stop the car
    public void stop() {
        System.out.println(model + " is stopping...");
    }

    // Method to honk
    public void honk() {
        System.out.println(model + " is honking: Beep! Beep!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Car car1 = new Car("Red", "Model S", "Tesla", 2022, 79999.99);

        // Displaying car details
        car1.displayCarDetails();

        // Using car methods
        car1.start();
        car1.honk();
        car1.stop();
    }
}
