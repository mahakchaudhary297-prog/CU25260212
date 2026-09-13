class Labsheet4Q11 {
    static int operationsCount;

    void add(int a, int b) {
        int sum = a + b;
        operationsCount++;
        System.out.println("Sum: " + sum);
    }

    void subtract(int a, int b) {
        int diff = a - b;
        operationsCount++;
        System.out.println("Difference: " + diff);
    }

    void multiply(int a, int b) {
        int product = a * b;
        operationsCount++;
        System.out.println("Product: " + product);
    }

    void divide(int a, int b) {
        if (b != 0) {
            int quotient = a / b;
            operationsCount++;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero not allowed");
        }
    }

    public static void main(String[] args) {
        Labsheet4Q11 calc = new Labsheet4Q11();
        calc.add(10, 5);
        calc.subtract(10, 5);
        calc.multiply(10, 5);
        calc.divide(10, 5);
        System.out.println("Total Operations: " + operationsCount);
    }
}
