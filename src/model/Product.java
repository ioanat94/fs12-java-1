package model;

import java.util.Arrays;
import java.util.Objects;

public class Product {
    private String name;
    private String image;
    private String description;
    private String[] categories;
    private String[] variants;
    private String[] sizes;
    private double price;
    private int quantity;

    public Product(String name, String image, String description, String[] categories, String[] variants, String[] sizes, double price, int quantity) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.categories = categories;
        this.variants = variants;
        this.sizes = sizes;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", categories=" + Arrays.toString(categories) +
                ", variants=" + Arrays.toString(variants) +
                ", sizes=" + Arrays.toString(sizes) +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && quantity == product.quantity && name.equals(product.name) && image.equals(product.image) && description.equals(product.description) && Arrays.equals(categories, product.categories) && Arrays.equals(variants, product.variants) && Arrays.equals(sizes, product.sizes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, image, description, price, quantity);
        result = 31 * result + Arrays.hashCode(categories);
        result = 31 * result + Arrays.hashCode(variants);
        result = 31 * result + Arrays.hashCode(sizes);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String[] getVariants() {
        return variants;
    }

    public void setVariants(String[] variants) {
        this.variants = variants;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
