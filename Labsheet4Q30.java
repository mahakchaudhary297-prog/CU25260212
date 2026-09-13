class Labsheet4Q30 {
    int booksAvailable;
    static String libraryName = "City Library";

    void issueBook() {
        int available = booksAvailable;
        if (available > 0) {
            available = available - 1;
            booksAvailable = available;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No books available to issue.");
        }
        System.out.println("Books Available: " + booksAvailable);
    }

    void returnBook() {
        int available = booksAvailable;
        available = available + 1;
        booksAvailable = available;
        System.out.println("Book returned successfully.");
        System.out.println("Books Available: " + booksAvailable);
    }

    public static void main(String[] args) {
        Labsheet4Q30 lib = new Labsheet4Q30();
        lib.booksAvailable = 3;
        System.out.println("Library: " + libraryName);
        System.out.println("Initial Books Available: " + lib.booksAvailable);

        lib.issueBook();
        lib.issueBook();
        lib.returnBook();
    }
}
