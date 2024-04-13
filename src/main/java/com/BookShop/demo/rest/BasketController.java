package com.BookShop.demo.rest;

import com.BookShop.demo.Service.BookService;
import com.BookShop.demo.entity.BasketData;
import com.BookShop.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Iterator;

@Controller
public class BasketController {
    @Autowired
    private BookService bookService;

    @GetMapping("/addBasket/{id}")
    public String addCart(@PathVariable int id){
    Book book=bookService.findById(id);
        BasketData.basket.add(book);
        return "redirect:/book";
}
    @GetMapping("basket")
    public String getBasket(Model model) {
        model.addAttribute("basketCount", BasketData.basket.size());
        model.addAttribute("total", BasketData.basket.stream().mapToDouble(Book::getPrice).sum());
        model.addAttribute("basket",BasketData.basket);
        return "basket";
    }
    @GetMapping("/basket/DeleteItems")
    public String removeItem(@RequestParam("itemId") int id) {
        Iterator<Book> iterator = BasketData.basket.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == id) {
                iterator.remove();
                break; // Assuming each book has a unique ID, so we can exit the loop after removing the item
            }
        }
        return "redirect:/basket";
    }
    @GetMapping("checkout")
    public String checkOut(Model model){
        model.addAttribute("basketCount", BasketData.basket.size());
        model.addAttribute("total", BasketData.basket.stream().mapToDouble(Book::getPrice).sum());
        return "checkout";
    }

}
