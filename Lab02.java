public class Lab02 {
    public static void main(String[] args) {
        // Test default constructor
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        // Test parameterized constructor
        Book hp1Book = new Book("Harry Potter and the Philosophers Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        System.out.println("Check for Discount");
        hp1Book.applyDiscount(20);

        // Test price update
        System.out.println("Check for Price Update");

        hp1Book.updatePrice(2000);
        hp1Book.displayDetails();
        hp1Book.applyDiscount(30);

    }
}
