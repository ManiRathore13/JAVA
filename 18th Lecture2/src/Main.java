import java.util.Scanner;

 class IntegerToRoman {
    public static String integerToRoman(int num) {
        String[] romanNumerals = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] values = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(romanNumerals[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to convert to Roman numeral: ");
        int number = scanner.nextInt();
        if (number < 1 || number > 3999) {
            System.out.println("Please enter a number between 1 and 3999.");
        } else {
            String romanNumber = integerToRoman(number);
            System.out.println("Roman numeral: " + romanNumber);
        }

        scanner.close();
    }
}
