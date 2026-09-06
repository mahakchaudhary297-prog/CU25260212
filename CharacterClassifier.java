public class CharacterClassifier {
    public static void main(String[] args) {
        char ch = 'e';

        String category = Character.isDigit(ch) ? "Digit" :
                          ("aeiouAEIOU".indexOf(ch) != -1) ? "Vowel" :
                          Character.isLetter(ch) ? "Consonant" : "Special Symbol";

        System.out.println("Character '" + ch + "' is a: " + category);
    }
}