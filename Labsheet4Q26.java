class Labsheet4Q26 {
    int[][] matrix1 = new int[2][2];
    int[][] matrix2 = new int[2][2];
    static String matrixType = "2x2 Matrix";

    void addMatrices() {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Addition Result (" + matrixType + "):");
        for (int i = 0; i < 2; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }

    void subtractMatrices() {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println("Subtraction Result (" + matrixType + "):");
        for (int i = 0; i < 2; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Labsheet4Q26 m = new Labsheet4Q26();
        m.matrix1[0][0] = 1; m.matrix1[0][1] = 2;
        m.matrix1[1][0] = 3; m.matrix1[1][1] = 4;
        m.matrix2[0][0] = 5; m.matrix2[0][1] = 6;
        m.matrix2[1][0] = 7; m.matrix2[1][1] = 8;
        m.addMatrices();
        m.subtractMatrices();
    }
}
