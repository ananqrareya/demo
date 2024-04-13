package com.BookShop.demo.Service;

import com.BookShop.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private static List<Book> books=null ;

    private static List<Book> internalBook(){
        if(books==null) {
            books = new ArrayList<>();
            books.add(new Book(1, "The Alchemist", "Paulo Coelho", 70.00));
            books.add(new Book(2, "The Great Gatsby", "F. Scott Fitzgerald", 65.50));
            books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee", 80.20));
            books.add(new Book(4, "1984", "George Orwell", 75.80));
            books.add(new Book(5, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 85.00));
            books.add(new Book(6, "Pride and Prejudice", "Jane Austen", 68.50));
            books.add(new Book(7, "The Catcher in the Rye", "J.D. Salinger", 72.80));
            books.add(new Book(8, "The Hobbit", "J.R.R. Tolkien", 90.00));
            books.add(new Book(9, "The Lord of the Rings", "J.R.R. Tolkien", 95.50));

        }
        return books;
    }
    public  List<Book> findAll(){
        return internalBook();
    }
public Book findById(int id){
        for(Book book :internalBook()){
            if(book.getId()==id)
                return book ;
        }
        return null;
}
}
