package model;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<Product> cartItems = new ArrayList<>();
    private double totalPrice = 0.00;
    private String shippingAddress = "";
    private String paymentMethod = "";
    private boolean isPaid = false;

    public void addToCart(Product product) {
        if (product.getQuantity() > 0) {
            this.cartItems.add(product);
            this.totalPrice += product.getPrice();

            System.out.println("Product added to cart.");
        }
    }

    public void removeFromCart(Product product) {
        this.cartItems.removeIf(item -> item.equals(product));
        this.totalPrice -= product.getPrice();

        System.out.println("Product removed from cart.");
    }

    public void emptyCart() {
        this.cartItems.clear();
        this.totalPrice = 0.00;
        this.shippingAddress = "";
        this.paymentMethod = "";
        this.isPaid = false;

        System.out.println("Cart emptied.");
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;

        System.out.println("Shipping address set.");
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;

        System.out.println("Payment method set.");
    }

    public void pay(double amount) {
        if(amount == this.totalPrice) {
            this.isPaid = true;

            System.out.println("Payment successful.");
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartItems=" + cartItems +
                ", totalPrice=" + totalPrice +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", isPaid=" + isPaid +
                '}';
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
