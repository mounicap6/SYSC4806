package com.amazon.bookstore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    private String name;
    private static int numberOfUsers=0;
    @Id
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private ShoppingCart shoppingCart;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Book> purchasedBooks;

    public User(String name){
        this.name = name;
        numberOfUsers += 1;
        id = new Long(numberOfUsers);
        shoppingCart = new ShoppingCart();
        purchasedBooks = new ArrayList<>();
    }

    public User() {
        numberOfUsers += 1;
        id = new Long(numberOfUsers);
        shoppingCart = new ShoppingCart();
        purchasedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfUsers() {
        return numberOfUsers;
    }

    public static void setNumberOfUsers(int numberOfUsers) {
        User.numberOfUsers = numberOfUsers;
    }

    public Long getId() {
        return id;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

    public void setPurchasedBooks(ArrayList<Book> purchasedBooks) {
        this.purchasedBooks = purchasedBooks;
    }
}