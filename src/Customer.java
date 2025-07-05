public class Customer {
    private String name;
    private double balance;
    private Cart cart;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.cart = new Cart();
    }

    public void checkout() {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty!");
        }

        double subtotal = cart.getSubtotal();
        double shipping = cart.getShippingFees();
        double total = subtotal + shipping;

        if (balance < total) {
            throw new IllegalStateException("Insufficient balance!");
        }

        balance -= total;

        System.out.println("Checkout Details:");
        System.out.println("-----------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Shipping Fees: $" + shipping);
        System.out.println("Total Paid: $" + total);
        System.out.println("Remaining Balance: $" + balance);
    }

    public Cart getCart() {
        return cart;
    }
}
