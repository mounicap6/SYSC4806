package com.amazon.bookstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookstoreController {

    @GetMapping("/user_homepage")
    public String userHomepage(Model model) {
        Book b1 = new Book("Harry Potter", "JK Rowling", "N/A", 123, "HP", "Fantasy", 1);
        Book b2 = new Book("Lord of the Rings", "JRR Tolkien", "N/A", 124, "LOTR", "Fantasy", 2);
        BookStore books = new BookStore();
        books.addBook(b1);
        books.addBook(b2);

        model.addAttribute("bookstore", books);

        return "bookstore";
    }

    @GetMapping("/owner_homepage")
    public String ownerHomepage(Model model) {
        Book b1 = new Book("Harry Potter", "JK Rowling", "N/A", 123, "HP", "Fantasy", 1);
        Book b2 = new Book("Lord of the Rings", "JRR Tolkien", "N/A", 124, "LOTR", "Fantasy", 2);
        BookStore books = new BookStore();
        books.addBook(b1);
        books.addBook(b2);

        model.addAttribute("bookstore", books);

        return "bookstore";
    }

    @GetMapping("/")
    public String homePage(){
        return "homepage";
    }

}
