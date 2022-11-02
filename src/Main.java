import model.*;

public class Main {
    public static void main(String[] args) {

        // PRODUCT OPERATIONS

        // "POST"
        Product product1 = new Product("Cat Toy 1", "https://some-url.com/1", "Cool toy 1", new String[]{"cats", "toys"}, new String[]{"mouse"}, new String[]{"small"}, 9.99, 10);
        Product product2 = new Product("Cat Toy 2", "https://some-url.com/2", "Cool toy 2", new String[]{"cats", "food"}, new String[]{"feather"}, new String[]{"medium"}, 8.99, 11);
        Product product3 = new Product("Cat Toy 3", "https://some-url.com/3", "Cool toy 3", new String[]{"cats", "beds"}, new String[]{"ball"}, new String[]{"large"}, 7.99, 12);
        Product product4 = new Product("Cat Toy 4", "https://some-url.com/4", "Cool toy 4", new String[]{"cats", "hygiene"}, new String[]{"wand"}, new String[]{"small", "medium"}, 6.99, 13);
        Product product5 = new Product("Cat Toy 5", "https://some-url.com/5", "Cool toy 5", new String[]{"cats", "other"}, new String[]{"catnip"}, new String[]{"medium", "large"}, 5.99, 14);

        ProductList products = new ProductList();
        products.addProduct(product1);
        products.addProduct(product2);
        products.addProduct(product3);
        products.addProduct(product4);
        products.addProduct(product5);

        // "GET"
        System.out.println(products.getSingleProduct("Cat Toy 1"));
        System.out.println(products.getAllProducts());

        // "PUT"
        Product updatedProduct = new Product("Cat Toy 100", "https://some-url.com/100", "Cool toy 100", new String[]{"cats", "toys"}, new String[]{"mouse"}, new String[]{"small"}, 99.99, 100);
        products.set(0, updatedProduct);
        System.out.println(products.getSingleProduct("Cat Toy 100"));
        System.out.println(products.getAllProducts());

        // "DELETE"
        products.deleteProduct(product5);
        System.out.println(products.getAllProducts());

        // CART OPERATIONS

        Cart cart = new Cart();
        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.addToCart(product3);
        cart.addToCart(product4);
        cart.addToCart(product5);
        System.out.println(cart);

        cart.removeFromCart(product5);
        System.out.println(cart);

        cart.setShippingAddress("Test str, no. 123, 12345 Honolulu");
        cart.setPaymentMethod("credit card");
        cart.pay(33.96);
        System.out.println(cart);

        // cart.emptyCart();
        // System.out.println(cart);

        // USER & ORDER OPERATIONS

        User user = new User("Ioana", "Tiplea", "ioana.tiplea@integrify.io", "https://cool-profile-pics.com/1");
        System.out.println(user);

        user.setFirstName("John");
        user.setLastName("Doe");
        user.setImage("https://cool-profile-pics.com/1");
        System.out.println(user);

        Order order = new Order(cart, user);
        System.out.println(order);

        order.advanceOrder();
        System.out.println("Order status: " + order.getStatus());
    }
}