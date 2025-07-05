import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    
        ExpirableProduct cheese = new ExpirableProduct("Cheese", 5, 50, LocalDate.now().plusDays(10));
        ShippableProduct tv = new ShippableProduct("TV", 300, 10, 20);
        Product mobileCard = new Product("Mobile Scratch Card", 2, 100);

        Customer customer = new Customer("Ali", 1000);

        customer.getCart().addItem(cheese, 2);
        customer.getCart().addItem(tv, 1);
        customer.getCart().addItem(mobileCard, 5);

        customer.checkout();
    }
}
