class Vehicle{
    private String color;
    private int maxSpeed;
    public Vehicle(String color, int maxSpeed){
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public void displayDetails(){
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed);
    }
    public void honk(){
        System.out.println("Honking..");
    }
}