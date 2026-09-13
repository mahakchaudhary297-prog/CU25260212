class Labsheet4Q18 {
    int units;
    static int fixedCharge = 50;

    void calculateBill() {
        int u = units;
        int total = (u * 5) + fixedCharge;
        System.out.println("Units: " + u);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + total);
    }

    public static void main(String[] args) {
        Labsheet4Q18 eb = new Labsheet4Q18();
        eb.units = 100;
        eb.calculateBill();
    }
}
