import java.util.ArrayList;
class FruitArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        System.out.println("Fruits in the list: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.set(1, "Orange");
        System.out.println("\nAfter replacing 'Banana' with 'Orange': " + fruits);
        fruits.remove("Cherry");
        System.out.println("\nAfter removing 'Cherry': " + fruits);
        if (fruits.contains("Mango")) {
            System.out.println("\n'Mango' is present in the list.");
        } else {
            System.out.println("\n'Mango' is not present in the list.");
        }
        System.out.println("\nTotal number of fruits: " + fruits.size());
    }
}
