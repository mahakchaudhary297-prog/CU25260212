import java.util.Scanner;

public class Labsheet3Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int zero = 0;
        int nonzero = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0) {
                    zero++;
                } else {
                    nonzero++;
                }
            }
        }

        if (zero > nonzero) {
            System.out.println("Sparse matrix");
        } else {
            System.out.println("Not sparse matrix");
        }
    }
}
