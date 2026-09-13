class Labsheet4Q15 {
    double principal;
    double rate;
    double time;
    static String bank = "HDFC Bank";

    void calculateInterest() {
        double p = principal;
        double r = rate;
        double t = time;
        double interest = (p * r * t) / 100;
        System.out.println("Bank: " + bank);
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {
        Labsheet4Q15 si = new Labsheet4Q15();
        si.principal = 10000;
        si.rate = 5;
        si.time = 2;
        si.calculateInterest();
    }
}
