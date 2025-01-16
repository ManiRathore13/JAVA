import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score: ");
        float score = scanner.nextFloat();

        char grade = ' ';

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else if (score >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}
