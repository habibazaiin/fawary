public class CartItem {
    public Product product;
    public int quantity;

    public CartItem(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalArgumentException("Not enough quantity available!");
        }
        this.product = product;
        this.quantity = quantity;
        product.reduceQuantity(quantity);
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}
