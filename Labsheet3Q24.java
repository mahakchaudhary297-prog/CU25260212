import java.util.Scanner;

public class Labsheet3Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[arr.length];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[size++] = arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
