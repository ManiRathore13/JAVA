class Employee{
    String name;
    int age;
    double salary;


Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
}
void display() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Salary: " + salary);
}
void increaseSalary(double increment) {
    salary += increment;
    System.out.println("New salary: " + salary);
}
}
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mani", 20, 50000);
        emp1.display();
        emp1.increaseSalary(5000);
        emp1.display();
        Employee emp2 = new Employee("Praveen", 20, 50000);
        emp2.display();
        emp2.increaseSalary(5000);
        emp2.display();
    }
}