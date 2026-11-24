public class Main {
    public static void main(String[] args) {
        BookCopy copy = new BookCopy("Clean Code");

        IO.println("Bog: " + copy.getTitle());
        IO.println("Udlånt ved oprettelse: " + copy.isBorrowed()); // false

        IO.println("Første udlån lykkedes: " + copy.borrow()); // true
        IO.println("Udlånt nu: " + copy.isBorrowed()); // true

        IO.println("Andet udlån lykkedes: " + copy.borrow()); // false
        IO.println("Udlånt stadig: " + copy.isBorrowed()); // true

        IO.println("Aflevering lykkedes: " + copy.returnBook()); // true
        IO.println("Efter aflevering - udlånt: " + copy.isBorrowed()); // false
        IO.println("Aflevering igen lykkedes: " + copy.returnBook()); // false

        IO.println("Nyt udlån efter aflevering lykkedes: " + copy.borrow()); // true
        IO.println("Udlånt nu: " + copy.isBorrowed()); // true
    }
}
