package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    private Date date;
    private String status;
    private String user;
    private ArrayList<Product> products;
    private double totalPrice;
    private String shippingAddress;

    public Order(Cart cart, User user) {
        if(cart.isPaid() && !user.isBanned()) {
            this.user = user.getEmail();
            this.products = cart.getCartItems();
            this.totalPrice = cart.getTotalPrice();
            this.shippingAddress = cart.getShippingAddress();
            this.status = "processing";
            this.date = new Date();
            System.out.println("Order created.");
        } else {
            System.out.println("Order could not be created.");
        }
    }

    public void advanceOrder() {
        switch (this.status) {
            case "processing" -> this.status = "confirmed";
            case "confirmed" -> this.status = "shipping";
            case "shipping" -> this.status = "delivered";
            default -> System.out.println("Order could not be advanced.");
        }
        System.out.println("Order advanced.");
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", status='" + status + '\'' +
                ", user='" + user + '\'' +
                ", products=" + products +
                ", totalPrice=" + totalPrice +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}
