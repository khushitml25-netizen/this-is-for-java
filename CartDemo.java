class Cart {

    // Single item
    double calculateTotal(double price) {
        return price;
    }

    // Multiple items of same type
    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    // Multiple items with discount
    double calculateTotal(double price, int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
}

public class CartDemo {
    public static void main(String[] args) {

        Cart cart = new Cart();

        System.out.println("Single Item: ₹" +
                cart.calculateTotal(500));

        System.out.println("Multiple Items: ₹" +
                cart.calculateTotal(500, 3));

        System.out.println("With 10% Discount: ₹" +
                cart.calculateTotal(500, 3, 10));
    }
}
