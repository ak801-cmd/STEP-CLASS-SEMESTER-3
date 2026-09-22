public class CartApp {

    private int[] prices;
    private int count;
    private final String cartId;

    CartApp(String cartId, int size) {
        this.cartId = cartId;
        prices = new int[size];
        count = 0;
    }

    void addItem(int price) {
        if (count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    int getTotal() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            total = total + prices[i];
        }

        return total;
    }

    int getItemCount() {
        return count;
    }

    public static void main(String[] args) {

        CartApp cart = new CartApp("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total = " + cart.getTotal());
        System.out.println("Item Count = " + cart.getItemCount());
    }
}