package com.BookShop.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class BasketData {
    public static List<Book> basket;
    static {
        basket=new ArrayList<>();
    }
}
