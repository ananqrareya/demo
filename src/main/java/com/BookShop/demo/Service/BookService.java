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
            books.add(new Book(1, "Book Title 1", "Author 1", 19.99));
            books.add(new Book(2, "Book Title 2", "Author 2", 24.99));
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
