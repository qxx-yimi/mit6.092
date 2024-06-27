package assn4;

public class Library {
    // Add the missing implementation to this class
    String address;
    static String startHours;
    static String endHours;
    Book[] books;
    int maxLength = 1000;
    int bookNumber;

    public Library(String addr) {
        address = addr;
        startHours = "9am";
        endHours = "5pm";
        books = new Book[maxLength];
        bookNumber = 0;
    }

    public void addBook(Book book) {
        books[bookNumber] = book;
        bookNumber += 1;
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from " + startHours + " to " + endHours);
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String bookName) {
        for (int i = 0; i < bookNumber; i++) {
            if (bookName.equals(books[i].getTitle())) {
                if (books[i].isBorrowed())
                    System.out.println("Sorry, this book is already borrowed.");
                else {
                    System.out.println("You successfully borrowed " + bookName);
                    books[i].borrowed();
                }
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void returnBook(String bookName) {
        for (int i = 0; i < bookNumber; i++) {
            if (bookName.equals(books[i].getTitle())) {
                books[i].returned();
                System.out.println("You successfully returned " + bookName);
                break;
            }
        }
    }

    public void printAvailableBooks() {
        boolean isEmpty = true;
        for (int i = 0; i < bookNumber; i++) {
            if (!books[i].isBorrowed()){
                System.out.println(books[i].getTitle());
                isEmpty = false;
            }
        }
        if (isEmpty)
            System.out.println("No book in catalog");
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}