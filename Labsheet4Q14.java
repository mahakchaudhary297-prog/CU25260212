class Labsheet4Q14 {
    String name;
    int age;
    static String country = "India";

    void checkEligibility() {
        String n = name;
        int a = age;
        if (a >= 18) {
            System.out.println(n + " is eligible to vote in " + country);
        } else {
            System.out.println(n + " is not eligible to vote in " + country);
        }
    }

    public static void main(String[] args) {
        Labsheet4Q14 p = new Labsheet4Q14();
        p.name = "Mahak";
        p.age = 20;
        p.checkEligibility();
    }
}
