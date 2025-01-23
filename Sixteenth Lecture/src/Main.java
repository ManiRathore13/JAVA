 class StringToIntegerConverter {
    public static int stringToInteger(String number) {
        int result = 0;
        boolean isNegative = false;
        int startIndex = 0;

        if (number.charAt(0) == '-') {
            isNegative = true;
            startIndex = 1;
        }

        for (int i = startIndex; i < number.length(); i++) {
            char c = number.charAt(i);


            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Invalid character in input string");
            }

            int digit = c - '0';
            result = result * 10 + digit;
        }

        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        String number = "-12345";
        try {
            int convertedNumber = stringToInteger(number);
            System.out.println("Converted integer: " + convertedNumber);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
