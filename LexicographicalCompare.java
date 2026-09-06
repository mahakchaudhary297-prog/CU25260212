import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        int minLength = Math.min(str1.length(), str2.length());
        int result = 0; // 0: equal, negative: str1 comes first, positive: str2 comes first

        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

             if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
        }

        if (result == 0) {
            if (str1.length() < str2.length()) {
                result = -1;
            } else if (str1.length() > str2.length()) {
                result = 1;
            }
        }

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes BEFORE \"" + str2 + "\" lexicographically.");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes BEFORE \"" + str1 + "\" lexicographically.");
        } else {
            System.out.println("Both strings are equal.");
        }

        scanner.close();
    }
}