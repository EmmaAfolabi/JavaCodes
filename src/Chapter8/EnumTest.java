package Chapter8;
// Testing enum type Book

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books:");

        // print all books in enum Book
        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
}
