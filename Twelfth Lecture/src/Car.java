
public class Car extends Vehicle{
    private int numDoors;
    private String transmissionType;
    public Car(String color, int maxSpeed, int numDoors, String transmissionType){
        super(color, maxSpeed);
        this.numDoors = numDoors;
        this.transmissionType = transmissionType;
    }
    public void displayCarDetails(){
        displayDetails();
        System.out.println("Num Doors: " + numDoors);
        System.out.println("Transmission Type: " + transmissionType);
    }
    public void lockDoors(){
        System.out.println("Doors locked.");
    }


    public static void main(String[] args){
        Car myCar = new Car("Red", 10, 1, "Car");
        myCar.displayDetails();
        myCar.honk();
        myCar.displayDetails();
        myCar.lockDoors();

    }
}