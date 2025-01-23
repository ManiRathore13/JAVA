 class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String str1, String str2) {
        StringBuilder commonPrefix = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String str1 = "flower";
        String str2 = "flowing";

        String result = findLongestCommonPrefix(str1, str2);
        System.out.println("Longest Common Prefix: " + result);
    }
}
