class Labsheet4Q28 {
    static String language = "English";

    void countWords(String sentence) {
        String s = sentence;
        String[] words = s.split(" ");
        int count = words.length;
        System.out.println("Sentence: " + s);
        System.out.println("Word Count: " + count);
        System.out.println("Language: " + language);
    }

    public static void main(String[] args) {
        Labsheet4Q28 wc = new Labsheet4Q28();
        wc.countWords("Java is a powerful language");
    }
}
