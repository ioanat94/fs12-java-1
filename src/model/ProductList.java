package model;

import java.util.ArrayList;

public class ProductList {
    private final ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void deleteProduct(Product product) {
        products.removeIf(item -> item.equals((product)));
    }

    public Product getSingleProduct(String productName) {
        for(Product item:products) {
           if(item.getName().equals(productName)) {
               return item;
           }
        }

        System.out.println("Product not found.");
        return null;
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }

    public void set(int i, Product updatedProduct) {
        this.products.set(i, updatedProduct);
    }
}
