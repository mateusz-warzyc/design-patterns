package pl.mateuszwarzyc.creational.prototype.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Coffee13.
 */
public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic book");
        book.setPrice(19.99);
        book.setNumberOfPages(335);
        items.put("Book", book);
    }
}