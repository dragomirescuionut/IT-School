package session13_recap.Challenges.OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String shippingAddress;
    private String billingAddress;
    private List<Product> shoppingCart = new ArrayList<>();

    public void addProductToShoppingCart(Product product) {
        shoppingCart.add(product);
        System.out.println("Shopping cart was updated: ");
        for (Product prod : shoppingCart) {
            System.out.println(prod);
        }
    }

    public void removeProductToShoppingCart(Product product) {
        if (shoppingCart.contains(product)) {
            shoppingCart.remove(product);
        } else {
            System.out.println("Please remove items that are already in the shopping cart! ");
        }
    }

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }
}
