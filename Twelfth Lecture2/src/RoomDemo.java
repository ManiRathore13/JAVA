class RoomDemo {
    public static void main(String[] args) {
        // Create instances of rooms
        Room room1 = new Room(10.0, 8.0, 6.0);
        Room room2 = new Room(12.0, 10.0, 8.0);

        // Display room dimensions and volume
        System.out.println("Room 1: " + room1);
        System.out.println("Volume: " + room1.volume() + " cubic units");

        System.out.println();

        System.out.println("Room 2: " + room2);
        System.out.println("Volume: " + room2.volume() + " cubic units");
    }
}