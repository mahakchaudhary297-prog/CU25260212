class Labsheet4Q10 {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        String n = name;
        String g = genre;
        double r = rating;
        System.out.println("Industry: " + industry);
        System.out.println("Name: " + n);
        System.out.println("Genre: " + g);
        System.out.println("Rating: " + r);
    }

    public static void main(String[] args) {
        Labsheet4Q10 m = new Labsheet4Q10();
        m.name = "Inception";
        m.genre = "Sci-Fi";
        m.rating = 9.0;
        m.display();
    }
}
