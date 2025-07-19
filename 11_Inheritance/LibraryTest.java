//Challenge 80 : Using inheritance to perform library operations.
class LibraryItem {
    String itemID, title, author;

    void checkout() {
        System.out.println(title + " checked out.");
    }

    void returnItem() {
        System.out.println(title + " returned.");
    }
}

class Book extends LibraryItem {
    String ISBN;

    Book(String id, String title, String author, String ISBN) {
        this.itemID = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    Magazine(String id, String title, String author, int issueNumber) {
        this.itemID = id;
        this.title = title;
        this.author = author;
        this.issueNumber = issueNumber;
    }
}

class DVD extends LibraryItem {
    double duration;

    DVD(String id, String title, String author, double duration) {
        this.itemID = id;
        this.title = title;
        this.author = author;
        this.duration = duration;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("B001", "Java Basics", "John", "123-456");
        Magazine mag = new Magazine("M001", "Tech Today", "Alice", 7);
        DVD dvd = new DVD("D001", "Java Movie", "Bob", 2.5);

        book.checkout();
        mag.returnItem();
        dvd.checkout();
    }
}
