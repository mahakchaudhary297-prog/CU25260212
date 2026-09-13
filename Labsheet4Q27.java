class Labsheet4Q27 {
    static int totalReversals;

    void reverseString(String str) {
        String s = str;
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        totalReversals++;
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reversed);
    }

    public static void main(String[] args) {
        Labsheet4Q27 sr = new Labsheet4Q27();
        sr.reverseString("Hello");
        sr.reverseString("Java");
        System.out.println("Total Reversals: " + totalReversals);
    }
}
