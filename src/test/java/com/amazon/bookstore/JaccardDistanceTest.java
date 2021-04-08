package com.amazon.bookstore;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;

public class JaccardDistanceTest {

    @Autowired
    private JaccardDistance jaccardDistance;

    private User user1, user2, user3;
    private Book book1, book2, book3, book4;

    //runs before every test 
    @Before("")
    public void setUp(){
        this.user1 = new User("user1");
        this.user2 = new User("user2");
        this.user3 = new User("user3");

        this.book1 = new Book("Book1", "Paulo Coelho", "HarperCollins", 97800613, "pursue your dreams by following what your heart desires", "Adventure",3,"https://upload.wikimedia.org/wikipedia/en/c/c4/TheAlchemist.jpg");
        this.book2 = new Book("Book2", "Paulo Coelho", "HarperCollins", 34534534, "des", "Adventure",3,"https://upload.wikimedia.org/wikipedia/en/c/c4/TheAlchemist.jpg");
        this.book3 = new Book("Book3", "Paulo Coelho", "HarperCollins", 13453456, "descrip", "Adventure",6,"https://upload.wikimedia.org/wikipedia/en/c/c4/TheAlchemist.jpg");
        this.book4 = new Book("Book4", "Paulo Coelho", "HarperCollins", 66956564, "description", "Adventure",4,"https://upload.wikimedia.org/wikipedia/en/c/c4/TheAlchemist.jpg");

        this.user1.addToCart(this.book1);
        this.user1.addToCart(this.book2);
        this.user2.addToCart(this.book1);
        this.user3.addToCart(this.book2);
        this.user3.addToCart(this.book4);
    }

}
