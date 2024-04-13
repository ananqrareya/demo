package com.BookShop.demo.rest;

import com.BookShop.demo.Service.BookService;
import com.BookShop.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookRest {
    @Autowired
    private BookService bookService;

    @GetMapping(value = {"/", "/book"})

    public String showBook(Model model){
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "index";
    }
}
