class BookInventory {
    String title;
    String author;
    int copiesAvailable;

    // Constructor
    BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    // Print book details
    void printEntry() {
        System.out.println(title + " by " + author + " - "
                + copiesAvailable + " copies available");
    }
}

 class main {
    public static void main(String[] args) {

        BookInventory b1 =
                new BookInventory("Clean Code", "Robert C. Martin", 3);

        BookInventory b2 =
                new BookInventory("Effective Java", "Joshua Bloch", 5);

        BookInventory b3 =
                new BookInventory("Refactoring", "Martin Fowler", 0);

        BookInventory b4 =
                new BookInventory("Design Patterns", "GoF", 2);

        // Array of objects
        BookInventory[] books = {b1, b2, b3, b4};

        // Print all books
        for (int i = 0; i < books.length; i++) {
            books[i].printEntry();
        }
    }
}