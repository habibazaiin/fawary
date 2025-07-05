import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalArgumentException("Not enough quantity available!");
        }
        items.add(new CartItem(product, quantity));
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double getSubtotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double getShippingFees() {
        double totalWeight = 0;
        for (CartItem item : items) {
            if (item.product.requiresShipping()) {
                totalWeight += item.product.getWeight() * item.quantity;
            }
        }
        return totalWeight * 10; // فرضاً 10 لكل كيلو
    }

    public List<CartItem> getItems() {
        return items;
    }
}
