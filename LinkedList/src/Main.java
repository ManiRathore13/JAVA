import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.remove(1);
        System.out.println("Updated LinkedList: " + numbers);
    }
}
